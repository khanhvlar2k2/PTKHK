

app.controller("room-ctrl", function($scope, $http, $location) {
$scope.items = [];

$scope.initialize = function(){
	//load accounts
	  $http.get(url+"/rest/rooms").then(resp=>{
			$scope.items = resp.data;
			console.log(resp.data);

			console.log(resp.data[7].booking[0].guest.firstname);

		})
			
	}
	$scope.initialize();	
})