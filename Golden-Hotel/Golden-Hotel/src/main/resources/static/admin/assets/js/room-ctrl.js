app.controller("room-ctrl", function($scope, $http, $location) {
 $scope.items = [];
 $scope.initialize = function(){
	   $http.get(url +"/rest/rooms").then(resp => {
            $scope.items = resp.data;
           console.log(resp.data);	
        });
	
		
	}
	$scope.initialize();
		
})