

app.controller("room-ctrl", function($scope, $http, $location) {
	$scope.items = [];
	$scope.form = {};
	$scope.formb = {};
	$scope.date = new Date();
	$scope.selection = [];
	$scope.initialize = function() {

		$scope.loadData();



	}
	$scope.loadData = function() {

		$http.get(url + "/rest/rooms").then(resp => {
			$scope.items = resp.data;
			console.log(resp.data);

		})
	}

	$scope.dataStatus = function(item) {
		$http.get(`/rest/dataStatus/${item.status}`, item).then(resp => {
			$scope.items = resp.data;
			$scope.loadData();
			console.log(resp.data);
		})
	}
	$scope.edit = function(item) {
		$scope.formb = angular.copy(item);


	}
	$scope.update = function() {
		var item = angular.copy($scope.formb);
		$http.put(`/rest/rooms/${item.id}`, item).then(resp => {
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items[index] = item;
			$scope.selection.forEach(b => {
				var data = {room: item,booking: b };
				$http.post(`/rest/booking`, data).then(resp => {
					$scope.items.push(resp.data);
				}).catch(err => {
					console.log("Error ", err);
				})
			})
			console.log(resp.data);
			$scope.initialize();
		}).catch(err => {
			console.log("Error ", err);

		})

	}
	$scope.initialize();
})