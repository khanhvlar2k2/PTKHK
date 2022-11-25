

app.controller("roomtype-manager-ctrl", function($scope, $http, $location) {
	$scope.items = [];
	$scope.form = {};
	$scope.initialize = function() {
		//load accounts
		$http.get(url + "/rest/roomtype").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);
		})
	}
	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
	}
	$scope.initialize();
})