angular.module('app.vocabulary').factory('WordsDataService', function ($http, $q) {
    'use strict';
    return {
        getWords: function getWords(category, level) {
            return $q.resolve([
                {
                    id: 1,
                    spelling: 'Marcin',
                    picture: '/assets/images/animals/cat.png',
                    level: 1 ,
                    category_id: 2
                },
                {
                    id: 2,
                    spelling: 'Andrzej',
                    picture: '/assets/images/animals/penguin.png',
                    level: 1 ,
                    category_id: 2
                }
            ]);
        }
    }
});
