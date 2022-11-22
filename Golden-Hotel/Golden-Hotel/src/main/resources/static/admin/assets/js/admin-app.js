app = angular.module("admin-app", ["ngRoute"]);

var url = 'http://localhost:8080'

app.config(function($routeProvider) {
	$routeProvider
		.when("/employee-manager", {
			templateUrl: "../admin/pages/Employeemanager.html",
			controller: "account-ctrl"
		})
		.when("/dashboard", {
			templateUrl: "../admin/pages/dashboard.html",
			controller: ""
		}).
		when("/retain-rooms-manager", {
			templateUrl: "../admin/pages/RentalRoomsManager.html",
			controller: "room-ctrl"
		})
		.otherwise({
			redirectTo: "/dashboard",
			controller: ""
		})
})
