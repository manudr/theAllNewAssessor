'use strict';

App.controller('watchController', function($scope, AccountService) {
    var watchController = this;
    watchController.matchedAccounts = [];
    $scope.testName = "";

    $scope.$watch("testName", function(newValue, oldValue) {
        if ($scope.testName.length > 0) {
            $scope.greeting = "Greetings " + $scope.testName;
            $scope.matchedAccounts = AccountService.fetchMatchedAccounts(newValue);
            AccountService.fetchMatchedAccounts(newValue).then(function(data) {
                watchController.matchedAccounts = data;
                $scope.matchedAccounts = data;
            });
        }
    });
});