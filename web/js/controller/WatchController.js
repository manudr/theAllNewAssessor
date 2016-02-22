'use strict';

App.controller('watchController', function($scope, AccountService) {
    $scope.searchString = "";
    $scope.$watch("searchString", function(newValue) {
        if ($scope.searchString.length > 4) {
            $scope.matchedAccounts = null;
                AccountService.fetchMatchedStrings(newValue).then(function(data) {
                    $scope.matchedAccounts = data;
                    var resultsCount = $scope.matchedAccounts.length;
                    $scope.showResultsCount = true;
                    $scope.resultsCount = resultsCount;
                    $scope.showParcelSearchResultsTable = true;
            });
        }
    });
});