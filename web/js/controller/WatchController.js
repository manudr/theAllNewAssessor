'use strict';

App.controller('watchController', function($scope, AccountService) {
    $scope.searchString = "";

    $scope.searchStringChangedFunction = function() {
        if ($scope.searchString != null && $scope.searchString.length > 3) {
            $scope.matchedAccounts = null;
            AccountService.fetchMatchedStrings($scope.searchString).then(function(data) {
                $scope.matchedAccounts = data;
                var resultsCount = $scope.matchedAccounts.length;
                $scope.showResultsCount = true;
                $scope.resultsCount = resultsCount;
                $scope.showParcelSearchResultsTable = true;
            });
        }
    };
});