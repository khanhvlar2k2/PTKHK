app.controller("blog-ctrl", function($scope, $http, $location) {
	$scope.items = [];
	$scope.form = {};
	$scope.account = {};
	$scope.initialize = function() {
		$scope.loadBlogs();
		$http.get("/rest/account").then(resp => {
			$scope.account = resp.data;
			console.log(resp.data);
		});

	}
	$scope.loadBlogs = function() {
		$http.get("/rest/blogs").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);
		});
	}
	$scope.reset = function() {
		$scope.form = {
			date: new Date(),
			employeeid: $scope.account.id,
			thumbnail : 'empty.jpg'
			
		}

	}
	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
		$.toast({
			text: 'Edit Blog  ' + '<b>' + item.title + '</b>' + ' successful',
			heading: 'Edit Information',
			showHideTransition: 'plain',
			icon: 'info',
			position: 'top-right',
			textAlign: 'left'
		})
	}
	$scope.create = function() {
		var item = angular.copy($scope.form);
		$http.post(`/rest/blog`, item).then(resp => {
			$scope.items.push(resp.data);
			$scope.loadBlogs();
			console.log(resp.data);
		}).catch(err => {
			console.log("Error ", err);

		})

		$scope.reset();
	}
	$scope.update = function() {
		var item = angular.copy($scope.form);
		$http.put(`/rest/blog/${item.id}`, item).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items[index] = item;
			$scope.loadBlogs();
			console.log(resp.data);
		}).catch(err => {

			console.log("Error ", err);
		})

		$scope.reset();

	}
	$scope.delete = function(item) {
		$http.delete(`/rest/blog/${item.id}`).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items.splice(index, 1);
			$scope.reset();
			$scope.loadBlogs();
			console.log(resp.data);
		}).catch(err => {
			console.log("Error ", err);
		})
	}
	$scope.imageChanged = function(files) {
		var data = new FormData();
		data.append('file', files[0]);
		$http.post('/rest/upload/blog', data, {
			transformRequest: angular.identity,
			headers: { 'Content-Type': undefined }
		}).then(resp => {
			$scope.form.thumbnail = resp.data.name;
		}).catch(err => {
			console.log("Error ", err)
		})
	}
	$scope.reset();
	$scope.initialize();
	$scope.pager = {
		page: 0,
		size: 4,
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