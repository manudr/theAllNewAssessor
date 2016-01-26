'use strict';

App.factory('AccountService', ['$http', '$q', function($http, $q){
    return {
        fetchAllAccounts: function() {
            return $http.get('/apps/dcappsmonitor/rservices/accountService/accounts').then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching accounts...');
                    return $q.reject(errResponse);
                }
            );
        },

        fetchAccount: function(accountNo) {
            return $http.get('/apps/dcappsmonitor/rservices/accountService/accounts/' + accountNo).then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching specific account...');
                    return $q.reject(errResponse);
                }
            );
        },

        fetchMatchedAccounts: function(searchString) {
            return $http.get('/apps/dcappsmonitor/rservices/accountService/allSearchableStrings/' + searchString).then(
                function(response){
                    return response.data;
                },
                function(errResponse){
                    console.error('Error while fetching matched accounts...');
                    return $q.reject(errResponse);
                }
            );
        },

        fetchNeighborhoodSales: function(zipCode, neighborhood, subdivision) {
            return $http.get('/apps/dcappsmonitor/rservices/accountService/neighborhoodSales/' + zipCode + '/' + neighborhood + '/' + subdivision).then(
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