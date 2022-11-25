

app.controller("room-manager-ctrl", function($scope, $http, $location) {
	$scope.items = [];
	$scope.form = {};
	$scope.roomtype = [];
	$scope.initialize = function() {
		//load rooms
		$http.get(url + "/rest/rooms").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);
		})

		//load room type
		$http.get(url + "/rest/roomtype").then(resp => {
			$scope.roomtype = resp.data;
			console.log(resp.data);
		})
	}
			//reset form
	$scope.reset = function(){
		$scope.form = {		 
		     
		}
    }
	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
	}
	 $scope.create = function(){
		var item = angular.copy($scope.form);
		$http.post(`/rest/roomsManager`,item).then(resp=>{
			$scope.items.push(resp.data);
			console.log(resp.data);			
			$scope.reset();						
		}).catch(err=>{
			console.log("Error ",err);
			
		})
    }
    $scope.update = function(){
		var item = angular.copy($scope.form);
		$http.put(`/rest/rooms/${item.id}`,item).then(resp=>{
			var index = $scope.items.findIndex(p=>p.id == item.id);
			$scope.items[index] = item;				
			console.log(resp.data);
			$scope.reset();
		}).catch(err=>{
			
			console.log("Error ",err);
		})
		%scope.reset();
		
		
	}
	$scope.delete = function(item) {
		$http.delete(`/rest/rooms/${item.id}`).then(resp => {
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
})