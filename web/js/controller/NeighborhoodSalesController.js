'use strict';

App.controller('neighborhoodSalesController', function($scope, $route, AccountService) {
    var neighborhoodSalesController = this;

    $scope.sortType     = 'accountNo'; // set the default sort type
    $scope.sortReverse  = false;  // set the default sort order
    $scope.globalsSearchString   = '';     // set the default search/filter term

    AccountService.fetchNeighborhoodSales($route.current.params.zipCode, $route.current.params.neighborhood, $route.current.params.neighborhoodExt, $route.current.params.subdivision).then(function(data) {
        neighborhoodSalesController.sales = data;
        $scope.sales = data;
    });
});