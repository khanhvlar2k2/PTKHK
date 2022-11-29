app = angular.module("admin-app", ["ngRoute"]);

var url = 'http://localhost:8080'

app.config(function($routeProvider) {
	$routeProvider
		.when("/employee-manager", {
			templateUrl: "../admin/pages/account/account.html",
			controller: "account-ctrl"
		})
		.when("/dashboard", {
			templateUrl: "../admin/pages/dashboard/dashboard.html",
			controller: ""
		}).
		when("/profile", {
			templateUrl: "../admin/pages/account/profile.html",
			controller: ""
		}).
		when("/retain-rooms-manager", {
			templateUrl: "../admin/pages/rooms/RentalRoomsManager.html",
			controller: "room-ctrl"
		}).
		when("/roomtype-manager", {
			templateUrl: "../admin/pages/rooms/RoomTypeManager.html",
			controller: "roomtype-manager-ctrl"
		}).
		when("/room-manager", {
			templateUrl: "../admin/pages/rooms/RoomsManager.html",
			controller: "room-manager-ctrl"
		}).when("/unauthorized", {
            templateUrl: "../admin/pages/account/unauthorized.html",
            controller: "authority-ctrl"
        })
		.otherwise({
			redirectTo: "/dashboard",
			controller: "dashboard-ctrl"
		})
})
