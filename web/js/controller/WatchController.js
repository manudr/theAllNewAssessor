'use strict';

App.controller('watchController', function($scope, AccountService) {
    var watchController = this;
    watchController.matchedAccounts = [];
    $scope.searchString = "";

    $scope.$watch("searchString", function(newValue, oldValue) {
        if ($scope.searchString.length > 0) {
            $scope.matchedAccounts = AccountService.fetchMatchedAccounts(newValue);
            AccountService.fetchMatchedAccounts(newValue).then(function(data) {
                watchController.matchedAccounts = data;
                $scope.matchedAccounts = data;
            });
        }
    });
});