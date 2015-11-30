angular.module('app.vocabulary').factory('CategoriesDataService', function ($http, $q) {
    'use strict';
    return {
        getAll: function getAll() {
            return $q.resolve([
                {
                    id: 1,
                    name: 'School'
                },
                {
                    id: 2,
                    name: 'Animals'
                },
                {
                    id: 3,
                    name: 'Food'
                },
                {
                    id: 3,
                    name: 'AAA'
                }
            ]);
            //return $http.get('/api/categories').then(function (response) {
            //    return response.data;
            //})
        }
    }
});
