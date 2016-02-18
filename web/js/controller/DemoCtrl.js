'use strict';

App.controller('DemoCtrl', ['$scope', function($scope) {
        $scope.colors = ['Red', 'Green', 'Blue'];
    }])
    .directive('collapseToggler', function(){
        return {
            restrict: 'A',
            link: function(scope, elem, attrs) {
                elem.on('click', function() {
                    $(this).siblings('.collapse').toggleClass('in');
                });
            }
        };
    })