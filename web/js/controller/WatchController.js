'use strict';

App.controller('watchController', function($scope, AccountService) {
    $scope.checkModel = {
        matchAll: true,
        matchAnyWhere: false
    };

    $scope.searchString = "";

    $scope.$watch("searchString", function(newValue, oldValue) {
        if ($scope.searchString.length > 3) {
            AccountService.fetchMatchedStrings(newValue).then(function(data) {
                $scope.matchedAccounts = data;
                var resultsCount = $scope.matchedAccounts.length;
                //console.log(resultsCount);
                $scope.showResultsCount = true;
                $scope.resultsCount = resultsCount;
                $scope.showParcelSearchResultsTable = true;
            });
        }
    });
});