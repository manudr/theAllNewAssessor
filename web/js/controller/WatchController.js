'use strict';

App.controller('watchController', function($scope, AccountService) {
    $scope.checkModel = {
        matchAll: false,
        matchAnyWhere: true,
        matchExact: false
    };

    $scope.checkboxModel = {
        value1 : true,
        value2 : 'YES'
    };

    $scope.checkResults = [];

    $scope.$watchCollection("checkModel", function () {
        $scope.checkResults = [];
        angular.forEach($scope.checkModel, function (value, key) {
            if (value) {
                $scope.checkResults.push(key);
            }
        });
    });

    $scope.searchString = "";
    $scope.showParcelSearchResultsTable = true;

    $scope.$watch("searchString", function(newValue, oldValue) {
        if ($scope.searchString.length > 3) {
            AccountService.fetchMatchedStrings(newValue).then(function(data) {
                $scope.matchedAccounts = data;
            });
        }
    });
});