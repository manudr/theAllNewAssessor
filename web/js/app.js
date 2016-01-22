'use strict';

var App = angular.module('myApp',['ngRoute']);

App.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/computers', {
			templateUrl: 'views/item_computers.html',
			controller : "ItemListController as itemListCtrl",
			resolve: {
                async: ['ItemService', function(ItemService) {
                    return ItemService.fetchAllItems('computers');
               	}]
            }
		})
		.when('/phones', {
			templateUrl: 'views/item_phones.html',
			controller : "ItemListController as itemListCtrl",
			resolve: {
                async: ['ItemService', function(ItemService) {
                    return ItemService.fetchAllItems('phones');
               	}]
            }
		})
		.when('/printers', {
			templateUrl: 'views/item_printers.html',
			controller : "ItemListController as itemListCtrl",
			resolve: {
                async: ['ItemService', function(ItemService) {
                    return ItemService.fetchAllItems('printers');
               	}]
            }
		})
		.when('/computerdetails/:id', {
			templateUrl: 'views/item_computer_details.html',
			controller : "ItemDetailsController as itemDetailsCtrl",
			resolve: {
                async: ['ItemService','$route', function(ItemService , $route) {
                    return ItemService.fetchSpecificItem('computers',$route.current.params.id);
               	}]
            }
		})
		.when('/phonedetails/:id', {
			templateUrl: 'views/item_phone_details.html',
			controller : "ItemDetailsController as itemDetailsCtrl",
			resolve: {
                async: ['ItemService','$route', function(ItemService , $route) {
                    return ItemService.fetchSpecificItem('phones',$route.current.params.id);
               	}]
            }
		})
		.when('/printerdetails/:id', {
			templateUrl: 'views/item_printer_details.html',
			controller : "ItemDetailsController as itemDetailsCtrl",
			resolve: {
                async: ['ItemService','$route', function(ItemService , $route) {
                    return ItemService.fetchSpecificItem('printers',$route.current.params.id);
               	}]
            }
		})
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
                    return AccountService.fetchMatchedAccounts($route.current.params.searchString);
                }]
            }
        })
        .when('/parcelDetails/:accountNo', {
            templateUrl: 'views/parcelDetails.html',
            controller : "AccountDetailsController as accountDetailsCtrl",
            resolve: {
                async: ['AccountService','$route', function(AccountService , $route) {
                    return AccountService.fetchAccount($route.current.params.accountNo);
                }]
            }
        })
		.otherwise({redirectTo:'/parcelSearch'});
}]);