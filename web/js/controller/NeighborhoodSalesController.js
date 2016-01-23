'use strict';

App.controller('neighborhoodSalesController', function($scope, AccountService) {
    console.log('neighborhoodSalesController...');
    var neighborhoodSalesController = this;

    $scope.sortType     = 'accountNo'; // set the default sort type
    $scope.sortReverse  = false;  // set the default sort order
    $scope.globalsSearchString   = '';     // set the default search/filter term

    AccountService.fetchNeighborhoodSales('80134').then(function(data) {
        neighborhoodSalesController.sales = data;
        $scope.sales = data;
    });
});