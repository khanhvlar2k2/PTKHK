app.controller("main-ctrl", function($scope, $http, $location) {

	$scope.user = {};
	$scope.orz = [];
	$scope.courm = [];
  
	$scope.initialize = function() {
		$http.get("/rest/account").then(resp => {
			$scope.user = resp.data;
			console.log(resp.data);
		})
		$http.get("/rest/rooms/count").then(resp => {
			$scope.courm = resp.data;
			console.log(resp.data)
		})		
	}
	$scope.showNew = function() {
		$http.get(url + "/rest/rooms").then(resp => {
			$scope.items = resp.data;
		}).then(() => {
			$scope.orz = [];
			for (let i = 0; i < 5; i++) {
				var a = $scope.items.filter(x => {
					return x.status == i;
				}).length
				$scope.orz.push(a)
			}
		})
	}
    $scope.initialize ();
	$scope.showNew();

	
})