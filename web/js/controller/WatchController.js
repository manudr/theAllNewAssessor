'use strict';

App.controller('watchController', function($scope, AccountService) {
    var watchController = this;
    watchController.matchedAccounts = [];
    $scope.searchString = "";
    $scope.showParcelSearchResultsTable = true;

    $scope.$watch("searchString", function(newValue, oldValue) {
        if ($scope.searchString.length > 3) {
            AccountService.fetchMatchedAccounts(newValue).then(function(data) {
                watchController.matchedAccounts = data;
                $scope.matchedAccounts = data;
            });
        }
    });
});