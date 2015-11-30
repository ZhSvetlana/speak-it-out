angular.module('app.vocabulary').controller('CategoriesController', function ($scope, CategoriesDataService) {
    'use strict';

    $scope.categories = [];

    CategoriesDataService.getAll().then(function(categories) {
        $scope.categories = categories;
        $scope.categories.unshift({
            id: 0,
            name: 'All categories'
        });
    });
});
