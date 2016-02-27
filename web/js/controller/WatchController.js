'use strict';

App.controller('watchController', function($scope, AccountService) {
    $scope.searchString = "";

    $scope.searchStringChangedFunction = function() {
        if ($scope.searchString != null && $scope.searchString.length > 2) {
            $scope.matchedParcels = null;
            AccountService.fetchMatchedStrings($scope.searchString).then(function(data) {
                $scope.matchedParcels = data;
                var resultsCount = $scope.matchedParcels.length;
                $scope.showResultsCount = true;
                $scope.resultsCount = resultsCount;
                $scope.showParcelSearchResultsTable = true;
            });
        }
    };
});