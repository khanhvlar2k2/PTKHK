app.controller("account-ctrl", function($scope, $http, $location) {
	$scope.items = [];
	$scope.form = {};
	$scope.hotels = [];
	$scope.roles = [];
	$scope.selection = [];
	$scope.authorities = [];
	$scope.initialize = function() {

		//load all roles
		$http.get("/rest/roles").then(resp => {
			$scope.roles = resp.data;
			console.log(resp.data);
		});
		$scope.loadaccount(); //load workplace
		//load authorities of staffs and directors
		$http.get("/rest/authorities?admin=true").then(resp => {
			$scope.authorities = resp.data;
		}).catch(err => {
			$location.path("/unauthorized");
		})

	}
	$scope.loadaccount = function() {
		//load accounts
		$http.get("/rest/accounts").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);
		})
	}
	//Chọn roles
	$scope.toggleRole = function(role) {
		var compareElement = -1;
		var idx = $scope.selection.indexOf(role);
		console.log(idx);
		//Currently Selected
		if (idx > -1) {
			$scope.selection.splice(idx, 1);
		}
		//Is newly added
		else {
			$scope.selection.push(role);
		}
	}
	//Load Roles on form by clicking Edit
	$scope.getOneByRole = function(id) {
		$http.get(`/rest/authoritiesOne?id=${id}`).then(resp => {
			$scope.selection = [];
			$scope.roles.forEach(e => {
				resp.data.forEach(e1 => {
					if (e.name == e1.role.name) {
						$scope.selection.push(e);
					}
				})
			})
		})
	}
	//reset form
	$scope.reset = function() {
		
		$scope.form = {
			avatar: 'no_avatar.png',
			status: true,
			gender: false
		}
	}
	$scope.create = function() {
		var item = angular.copy($scope.form);
		$http.post(`/rest/accountsManage`, item).then(resp => {
			$scope.items.push(resp.data);
			console.log(resp.data);
			
			//thêm phân quyền
			$scope.selection.forEach(r => {
				var authority = { account: item, role: r };
				$http.post(`/rest/authorities`, authority).then(resp => {
					$scope.items.push(resp.data);
				}).catch(err => {
					console.log("Error ", err);
				})
				
			})
			$.toast({
				text: 'Add New Account Success  ' +item.fullname,
				heading: 'Create Information',
				showHideTransition: 'plain',
				icon: 'success', 
				position: 'bottom-right',
				textAlign: 'left'})
			$scope.reset();
			

		}).catch(err => {
			console.log("Error ", err);
			$.toast({
				text: 'Add new account failed  ' +$scope.form.fullname,
				heading: 'Created Information',
				showHideTransition: 'plain',
				icon: 'error', 
				position: 'bottom-right',
				textAlign: 'left'
		})
			
		})
	}

	//Update account
	$scope.update = function() {
		var item = angular.copy($scope.form);
		$http.put(`/rest/accounts/${item.id}`, item).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items[index] = item;
			console.log(resp.data);
			//xoá toàn bộ roles của user hiện tại
			$http.delete(`/rest/authoritiesOne/${item.id}`).then(resp => {
				//sau khi xoá thì thêm mới lại role đã chọn
				$scope.selection.forEach(r => {
					var authority = { employee: item, role: r };
					$http.post(`/rest/authorities`, authority).then(resp => {
						$scope.items.push(resp.data);
					}).catch(err => {
						console.log("Error ", err);
					})
				})
			})


			$.toast({
				text: 'Updated Account' +item.fullname +' successful',
				heading: 'Update Information',
				showHideTransition: 'plain',
				icon: 'success', 
				position: 'bottom-right',
				textAlign: 'left'
			})
			$scope.initialize();
			$scope.reset();
		}).catch(err => {

			console.log("Error ", err);
		})
		$scope.reset();


	}

	//Hiển thị lên form
	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
		$scope.getOneByRole(item.id);
		$.toast({
				text: 'Edited account ' +$scope.form.fullname +' successful',
				heading: 'Edit Information',
				showHideTransition: 'plain',
				icon: 'info', 
				position: 'bottom-right',
				textAlign: 'left'
		})
	}


	//Remove account
	$scope.delete = function(item) {
		$http.delete(`/rest/accounts/${item.id}`).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items.splice(index, 1);
			$scope.reset();
			$.toast({
				text: 'Deleted account ' + item.fullname +' successful',
				heading: 'Delete Information',
				showHideTransition: 'plain',
				icon: 'error', 
				position: 'bottom-right',
				textAlign: 'left'
		})

			console.log(resp.data);
		}).catch(err => {
			console.log("Error ", err);
		})
	}
	$scope.imageChanged = function(files) {
		var data = new FormData();
		data.append('file', files[0]);
		$http.post('/rest/upload/avatar', data, {
			transformRequest: angular.identity,
			headers: { 'Content-Type': undefined }
		}).then(resp => {
			$scope.form.avatar = resp.data.name;
		}).catch(err => {
			console.log("Error ", err)
		})
	}

	$scope.getAu = function(role) {

		$http.get("/rest/accounts?role=" + role).then(resp => {
			$scope.items = resp.data;
			$scope.pager.first()
		})
		//load authorities of staffs and directors
		$http.get("/rest/authorities?role=" + role).then(resp => {
			$scope.authorities = resp.data;
			console.log(resp.data);
		}).catch(err => {
			$location.path("/unauthorized");
		})


	}

	$scope.initialize();
	$scope.reset();
	$scope.pager = {
		page: 0,
		size: 9,
		get items() {
			var start = this.page * this.size;
			return $scope.items.slice(start, start + this.size);
		},
		get count() {
			return Math.ceil(1.0 * $scope.items.length / this.size);
		},
		first() {
			this.page = 0;
		},
		previous() {
			this.page--;
			if (this.page < 0) {
				this.last();
			};
		},
		next() {
			this.page++;
			if (this.page >= this.count) {
				this.first();
			};
		},
		last() {
			this.page = this.count - 1;
		},
	}


})