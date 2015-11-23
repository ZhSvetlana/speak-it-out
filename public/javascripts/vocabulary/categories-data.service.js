angular.module('app.vocabulary').factory('CategoriesDataService', function ($http, $q) {
    'use strict';
    return {
        getAll: function getAll() {
            var deffered = $q.defer();
            deffered.resolve([
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
                }
            ]);
            return deffered.promise;
            //return $http.get('/api/categories').then(function (response) {
            //    return response.data;
            //})
        }
    }
});
