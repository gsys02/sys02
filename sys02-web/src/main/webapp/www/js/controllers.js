var self = angular.module('controllers', []);

self.controller('my', function($scope, Api) {

	var res = Api.datos().get({
		name : "prueba"
	});
	$scope.name = res;

});

self.controller('input', function($scope, Api) {

	$scope.name = 'sinuhe';

	$scope.send = function() {

		var res = Api.datos().get({
			name : $scope.name
		});

		$scope.res = res;
	};

	$scope.click = function() {

		$scope.res = Api.ya("yuju");
	}

});
