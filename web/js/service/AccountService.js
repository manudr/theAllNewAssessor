'use strict';

App.factory('AccountService', ['$http', '$q', function($http, $q){
    return {
        fetchParcel: function(accountNo) {
            return $http.get('/apps/theAllNewAssessor/rservices/accountService/parcels/' + accountNo).then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching specific account...');
                    return $q.reject(errResponse);
                }
            );
        },

        fetchMatchedStrings: function(searchString) {
            return $http.get('/apps/theAllNewAssessor/rservices/accountService/allSearchableStrings/' + searchString).then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching matched accounts...');
                    return $q.reject(errResponse);
                }
            );
        },

        fetchNeighborhoodSales: function(zipCode, neighborhood, neighborhoodExt, subdivision) {
            return $http.get('/apps/theAllNewAssessor/rservices/accountService/neighborhoodSales/' + zipCode + '/' + neighborhood + '/' + neighborhoodExt + '/' + subdivision).then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching matched accounts...');
                    return $q.reject(errResponse);
                }
            );
        }
    };
}]);