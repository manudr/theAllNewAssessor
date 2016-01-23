'use strict';

App.controller('mainController', function($scope) {
    $scope.sortType     = 'accountNo'; // set the default sort type
    $scope.sortReverse  = false;  // set the default sort order
    $scope.globalsSearchString   = '';     // set the default search/filter term
    $scope.numResultsMatched = '100';
    console.log('mainController...', $scope.numResultsMatched);
});