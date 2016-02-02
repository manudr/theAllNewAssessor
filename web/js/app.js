'use strict';

var App = angular.module('myApp',['ngRoute']);

App.config(['$routeProvider', function($routeProvider) {
	$routeProvider
        .when('/parcelSearch', {
            templateUrl: 'views/parcelSearch.html'
        })
        .when('/searchByMap', {
            templateUrl: 'views/searchByMap.html',
            controller : "MapCtrl as mapCtrl"
        })
        .when('/parcels/:searchString', {
            templateUrl: 'views/parcelSearchResults.html',
            controller : "AccountListController as accountListCtrl",
            resolve: {
                async: ['AccountService', '$route', function(AccountService, $route) {
                    return AccountService.fetchMatchedStrings($route.current.params.searchString);
                }]
            }
        })
        .when('/parcelDetails/:accountNo/:zipCode/:neighborhood/:subdivision', {
            templateUrl: 'views/parcelDetails.html',
            controller : "AccountDetailsController as accountDetailsCtrl",
            resolve: {
                async: ['AccountService','$route', function(AccountService , $route) {
                    return AccountService.fetchAccount($route.current.params.accountNo);
                }]
            }
        })
        .when('/parcelSearchAutoComplete', {
            templateUrl: 'views/parcelSearchAutoComplete.html'
        })
		.otherwise({redirectTo:'/parcelSearchAutoComplete'});
}]);