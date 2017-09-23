var defaultListApp = angular.module('defaultListApp', ['builder', 'builder_editors']);
defaultListApp.controller('defaultListCtrl', ['$scope','Restangular', function($scope, Restangular){
    $scope.items = ['item1','item2','item3','item4'];
    Restangular.setBaseUrl('https://api.yaas.io/saphybrischi/giftregistry/v1/');
    Restangular.one('giftRegistries/').getList().then(function(items){
        $scope.items = items;
    },function(error){
        //handle error
    });

}]);
