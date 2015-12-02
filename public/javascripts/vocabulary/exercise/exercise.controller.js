angular.module('app.vocabulary').controller('ExerciseController', function ($scope, $timeout, WordsDataService) {
    'use strict';

    // temp
    $scope.level = 1;
    $scope.category = {
        id: 2,
        name: 'Animals'
    };
    
    $scope.words = [];
    $scope.currentWord = null;
    $scope.correctWords = [];
    $scope.showResult = false;

    $scope.nextWord = function () {
        $scope.currentWord = $scope.words.pop();
        $scope.showResult = false;
        $scope.getUserInput();
    };

    $scope.getUserInput = function() {
        // TODO: Record user voice and send to the server
        $timeout(function () {
            $scope.showResult = true;
        }, 5000)
    }

    WordsDataService.getWords($scope.category, $scope.level).then(function (words){
        $scope.words = words;
        $scope.nextWord();
    });
});
