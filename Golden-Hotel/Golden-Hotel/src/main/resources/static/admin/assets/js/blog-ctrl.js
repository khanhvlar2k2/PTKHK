app.controller("blog-ctrl", function($scope, $http, $location) {
	$scope.items = [];
    $scope.form = {};
     $scope.account = {};
	$scope.initialize = function() {	
		$http.get("/rest/blogs").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);
		});
		$http.get("/rest/account").then(resp => {
			$scope.account = resp.data;
		})		
	} 
	$scope.reset = function(){
		var employee = $scope.account.id;
		$scope.form = {
			date: new Date(),
			employeeid: employee
		}
	}
	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
		$.toast({
				text: 'Edit Blog  '+'<b>' +item.id +'</b>'+' successful',
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
			console.log(resp.data);
		}).catch(err => {
			console.log("Error ", err);
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