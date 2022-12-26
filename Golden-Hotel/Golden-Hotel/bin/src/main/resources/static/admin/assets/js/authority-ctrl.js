app.controller("authority-ctrl",function($scope,$http,$location){
    $scope.roles = [];
    $scope.admins = [];
    $scope.authorities = [];
    
    $scope.initialize = function(){
		//load all roles
		$http.get("/rest/roles").then(resp=>{
			$scope.roles = resp.data;
		});
		
		//load staffs and directors (administrators)
		$http.get("/rest/accounts").then(resp=>{
			$scope.admins = resp.data;
		})
		
		//load authorities of staffs and directors
		$http.get("/rest/authorities?admin=true").then(resp=>{
			$scope.authorities = resp.data;
			console.log(resp.data);
		}).catch(err=>{
			$location.path("/unauthorized");
		})
		
		$scope.authority_of = function(account,role){
			if($scope.authorities){
				return $scope.authorities.find(ur => ur.employee.id == account.id && ur.role.id == role.id)
			}
		}
		
		$scope.authority_changed = function(account,role){
			
			var authority = $scope.authority_of(account,role);
			console.log("role: "+JSON.stringify(authority));
			if(authority){//đã cấp quyền => thu hồi quyền (xoá)
				$scope.revoke_authority(authority);
			}else{//chưa cấp quyền => cấp quyền mới
				authority = {employee:account,role:role};
				$scope.grant_authority(authority);
			}
		}
	}
	//Thêm mới authority
	$scope.grant_authority = function(authority){
		$http.post(`/rest/authorities`,authority).then(resp=>{
			$scope.authorities.push(resp.data);
			$.toast({
				text: 'Cretate role '+'<b>'+authority.role.name +'</b>'+' of account '+'<b>'+ authority.employee.fullname+'</b>' +' successful',
				heading: 'Create new role information',
				showHideTransition: 'plain',
				icon: 'success', 
				position: 'bottom-right',
				textAlign: 'left'
		})
		}).catch(err=>{
			console.log("Error ",err);
			
		})
	}
	
	//Xoá authority
	$scope.revoke_authority = function(authority){
		$http.delete(`/rest/authorities/${authority.id}`).then(resp=>{
			var index = $scope.authorities.findIndex(a => a.id == authority.id);
			$scope.authorities.splice(index,1);
			$.toast({
				text: 'Deleted role '+'<b>'+authority.role.name +'</b>'+' of account '+'<b>' + authority.employee.fullname +'</b>' +' successful',
				heading: 'Delete role information',
				showHideTransition: 'plain',
				icon: 'error', 
				position: 'bottom-right',
				textAlign: 'left'
		})
		}).catch(err=>{
			console.log("Error ",err);
			
			
		})
	}
	
	$scope.getAu = function(role){
		$http.get("/rest/accounts?role="+role).then(resp=>{
			$scope.admins = resp.data;
			$scope.pager.first()
		})
		//load authorities of staffs and directors
		$http.get("/rest/authorities?role="+role).then(resp=>{
			$scope.authorities = resp.data;
			console.log(resp.data);
		}).catch(err=>{
			$location.path("/unauthorized");
		})
	}
	$scope.pager = {
		page:0,
		size:10,
		get admins(){
			var start = this.page * this.size;
			return	$scope.admins.slice(start,start+this.size);
		},
		get count(){
			return Math.ceil(1.0*$scope.admins.length/this.size);
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
	
	$scope.initialize();
})