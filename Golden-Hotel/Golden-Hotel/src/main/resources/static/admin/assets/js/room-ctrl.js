

app.controller("room-ctrl", function($scope, $http, $location) {
$scope.items = [];

$scope.initialize = function(){
	//load accounts
	  $http.get(url+"/rest/hotel").then(resp=>{
			$scope.items = resp.data;
			console.log(resp.data);
		})				
	}
	$scope.initialize();	
})