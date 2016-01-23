'use strict';

App.factory('ItemService', ['$http', '$q', function($http, $q){
    return {


        fetchAllItems: function(category) {
                return $http.get('/apps/dcappsmonitor/rservices/accountService/allSearchableStrings/dron')
                        .then(
                                function(response){
                                    return response.data;
                                },
                                function(errResponse){
                                    console.error('Error while fetching Items...');
                                    return $q.reject(errResponse);
                                }
                        );
        },

        fetchSpecificItem: function(category,id) {
            return $http.get('/apps/dcappsmonitor/rservices/accountService/allSearchableStrings/dron')
                    .then(
                            function(response){
                                return response.data;
                            },
                            function(errResponse){
                                console.error('Error while fetching specific Item...');
                                return $q.reject(errResponse);
                            }
                    );
        }
	};

}]);


