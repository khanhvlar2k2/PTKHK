

app.controller("room-ctrl", function($scope, $http, $location) {
	$scope.items = [];
    $scope.date = new Date();
	$scope.initialize = function() {
		//load accounts
		$http.get(url + "/rest/rooms").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);

		})
 

	}
	$scope.dataStatus = function(item){
		$http.get(`/rest/dataStatus/${item.status}`,item).then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);	
		})
	}
	$scope.edit = function(item){
		$scope.form = angular.copy(item);
   
		
    }
    $scope.update = function() {
		var item = angular.copy($scope.form);
		$http.put(`/rest/rooms/${item.id}`, item).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items[index] = item;
			console.log(resp.data);
	
		}).catch(err => {

			console.log("Error ", err);
		})
		
	}
	$scope.initialize();
})