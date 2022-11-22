app.controller("main-ctrl", function($scope, $http, $location) {

	$scope.user = {};

	$scope.initialize = function() {
		$http.get("/rest/account").then(resp => {
			$scope.user = resp.data;
			console.log(resp.data)
		})
	}

	
})