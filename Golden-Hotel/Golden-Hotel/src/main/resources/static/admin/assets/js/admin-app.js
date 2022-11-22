app = angular.module("admin-app", ["ngRoute"]);

var url = 'http://localhost:8080'

app.config(function($routeProvider) {
    $routeProvider
        .when("/employee-manager", {
            templateUrl: "../admin/pages/Employeemanager.html",
            controller: "account-ctrl"
        }).when("/retailroom-manager", 
           {
            templateUrl: "../admin/pages/RentalRoomsManager.html",
            controller: "room-ctrl"
        })
        .otherwise({
            redirectTo: "/dashboard",
            controller: ""
        })
})

pp = angular.module("admin-app", ["ngRoute"]);

var url = 'http://localhost:8080'

app.config(function($routeProvider) {
    $routeProvider
        .when("/employee-manager", {
            templateUrl: "../admin/pages/Employeemanager.html",
            controller: "account-ctrl"
        })
        .when("/retailroom-manager", {
            templateUrl: "../admin/pages/RentalRoomsManager.html",
            controller: "room-ctrl"
        })
        .otherwise({
            redirectTo: "/dashboard",
            controller: "dashboard-ctrl"
        })
})