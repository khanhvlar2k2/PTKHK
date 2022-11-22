

app.controller("room-ctrl", function($scope, $http, $location) {
 $scope.items = [];
$scope.initialize = function(){
	//load accounts
	  $http.get(url+"/rest/rooms").then(resp=>{
			$scope.items = resp.data;
		})	
	}
	$scope.initialize();
	
	
	
})