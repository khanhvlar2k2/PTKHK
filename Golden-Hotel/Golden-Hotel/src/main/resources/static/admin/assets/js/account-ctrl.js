app.controller("account-ctrl", function($scope, $http, $location) {
 $scope.items = [];
 $scope.roles = [];
 $scope.form = {};
 $scope.hotels = [];

 $scope.initialize = function(){
	   $http.get("/rest/roles").then(resp => {
            $scope.roles = resp.data;
           console.log(resp.data);	
        });
	//load accounts
	  $http.get("/rest/accounts").then(resp=>{
			$scope.items = resp.data;
		})
	       ;     //load workplace
        $http.get("/rest/workplace").then(resp => {
            $scope.hotels = resp.data;
        console.log(resp.data);	
        });
		$scope.reset();
		
	}
		//reset form
	$scope.reset = function(){
		$scope.form = {
			 
		     avatar:'no_avatar.png',
             status:true,
             gender:false
		}
    }
//Thêm account
    $scope.create = function(){
		var item = angular.copy($scope.form);
		$http.post(`/rest/accountsManage`,item).then(resp=>{
			$scope.items.push(resp.data);
			console.log(resp.data);			
			$scope.reset();
			
		}).catch(err=>{
			console.log("Error ",err);
			
		})
    }
 //Update account
    $scope.update = function(){
		var item = angular.copy($scope.form);
		$http.put(`/rest/accounts/${item.id}`,item).then(resp=>{
			var index = $scope.items.findIndex(p=>p.id == item.id);
			$scope.items[index] = item;				
			console.log(resp.data);
		}).catch(err=>{
			
			console.log("Error ",err);
		})
		%scope.reset();
		
		
	}
//Hiển thị lên form
    $scope.edit = function(item){
		$scope.form = angular.copy(item);

		
    }
		 //Remove account
    $scope.delete = function(item){
		$http.delete(`/rest/accounts/${item.id}`).then(resp=>{
			var index = $scope.items.findIndex(p=>p.id == item.id);
			$scope.items.splice(index,1);
			$scope.reset();
			
			console.log(resp.data);
		}).catch(err=>{
			
			console.log("Error ",err);
		})
	}
  $scope.imageChanged = function(files){
		var data = new FormData();
		data.append('file',files[0]);
		$http.post('/rest/upload/avatar',data,{
			transformRequest:angular.identity,
			headers:{'Content-Type':undefined}
		}).then(resp=>{
			$scope.form.avatar = resp.data.name;
		}).catch(err=>{
					console.log("Error ",err)
		})
    }
		
	$scope.initialize();
	
	$scope.pager = {
		page:0,
		size:9,
		get items(){
			var start = this.page * this.size;
			return	$scope.items.slice(start,start+this.size);
		},
		get count(){
			return Math.ceil(1.0*$scope.items.length/this.size);
		},
		first(){
			this.page = 0;
		},
		previous(){
			this.page--;
			if(this.page<0){
				this.last();
			};
		},
		next(){
			this.page++;
			if(this.page >= this.count){
				this.first();
			};
		},
		last(){
			this.page = this.count -1;
		},
	}

	
})