app.controller("guest-ctrl", function($scope, $http, $location) {
	$scope.items = [];
	$scope.initialize = function() {	
		$http.get("/rest/guests").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);
		});		
	}    
	$scope.delete = function(item) {		
		$http.delete(`/rest/guest/${item.id}`).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items.splice(index, 1);
			$.toast({
				text: 'Deleted Guest '+'<b>' + item.id+'</b>' +' successful',
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