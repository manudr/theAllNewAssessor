'use strict';

App.controller('neighborhoodSalesController', function($scope, $route, AccountService) {
    //console.log('neighborhoodSalesController...');
    var neighborhoodSalesController = this;

    $scope.sortType     = 'accountNo'; // set the default sort type
    $scope.sortReverse  = false;  // set the default sort order
    $scope.globalsSearchString   = '';     // set the default search/filter term

    //console.log('$route.current.params.accountNo: ', $route.current.params.accountNo, '$route.current.params.zipCode: ', $route.current.params.zipCode, '$route.current.params.neighborhood: ' , $route.current.params.neighborhood, '$route.current.params.subdivision: ', $route.current.params.subdivision);

    AccountService.fetchNeighborhoodSales($route.current.params.zipCode, $route.current.params.neighborhood, $route.current.params.subdivision).then(function(data) {
        neighborhoodSalesController.sales = data;
        $scope.sales = data;
    });
});