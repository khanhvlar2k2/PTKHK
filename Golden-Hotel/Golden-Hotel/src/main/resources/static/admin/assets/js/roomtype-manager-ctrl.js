

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
		$.toast({
				text: 'Edit Room Type '+'<b>' +item.name +'</b>'+' successful',
				heading: 'Edit Information',
				showHideTransition: 'plain',
				icon: 'info', 
				position: 'bottom-right',
				textAlign: 'left'
			})
	}
	//reset form
	$scope.reset = function() {
		
		$scope.form = {
			
		}
	}
	$scope.create = function() {
		var item = angular.copy($scope.form);
		$http.post(`/rest/Roomtypes`, item).then(resp => {
			$scope.items.push(resp.data);
			console.log(resp.data);	
			$.toast({
				text: 'Add New Room Type Success  '+'<b>' +item.name+'</b>',
				heading: 'Create Information',
				showHideTransition: 'plain',
				icon: 'success', 
				position: 'bottom-right',
				textAlign: 'left'})
			$scope.reset();
			

		}).catch(err => {
			console.log("Error ", err);
			$.toast({
				text: 'Add New Room Type failed  '+'<b>' +$scope.form.name+'<b>',
				heading: 'Created Information',
				showHideTransition: 'plain',
				icon: 'error', 
				position: 'bottom-right',
				textAlign: 'left'
		})
			
		})
	}
	//Update account
	$scope.update = function() {
		var item = angular.copy($scope.form);
		$http.put(`/rest/Roomtypes/${item.type}`, item).then(resp => {
			var index = $scope.items.findIndex(p => p.type == item.type);
			$scope.items[index] = item;
			console.log(resp.data);
			$.toast({
				text: 'Updated Room Type'+'<b>' +item.name+'</b>' +' successful',
				heading: 'Update Information',
				showHideTransition: 'plain',
				icon: 'success', 
				position: 'bottom-right',
				textAlign: 'left'
			})
		}).catch(err => {

			console.log("Error ", err);
		})
		$scope.reset();


	}
	$scope.delete = function(item) {		
		$http.delete(`/rest/Roomtypes/${item.type}`).then(resp => {
			var index = $scope.items.findIndex(p => p.type == item.type);
			$scope.items.splice(index, 1);
			$scope.reset();
			$.toast({
				text: 'Deleted account '+'<b>' + item.fullname+'</b>' +' successful',
				heading: 'Delete Information',
				showHideTransition: 'plain',
				icon: 'error', 
				position: 'bottom-right',
				textAlign: 'left'
		})

			console.log(resp.data);
		}).catch(err => {
			console.log("Error ", err);
		})
	}
	$scope.imageChanged = function(files) {
		var data = new FormData();
		data.append('file', files[0]);
		$http.post('/rest/upload/avatar', data, {
			transformRequest: angular.identity,
			headers: { 'Content-Type': undefined }
		}).then(resp => {
			$scope.form.avatar = resp.data.name;
		}).catch(err => {
			console.log("Error ", err)
		})
	}

	$scope.initialize();
	$scope.reset();
})