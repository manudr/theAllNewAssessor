'use strict';


App.controller('NeighborhoodSalesController', ['$scope', 'AccountService', function($scope, AccountService) {
    var neighborhoodSalesController = this;

    console.log('neighborhoodSalesController...');
    $scope.sales = AccountService.fetchAccount();
    neighborhoodSalesController.sales = AccountService.fetchNeighborhoodSales('80134');
    console.log('$scope.sales:', $scope.sales);
    console.log('neighborhoodSalesController.sales:', neighborhoodSalesController.sales);
}]);