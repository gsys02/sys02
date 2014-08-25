var self = angular.module('app', [ 'ngRoute', 'controllers', 'services' ]);

self.config(function($routeProvider) {

	$routeProvider.when('/data', {
		templateUrl : 'www/js/view/data.html',
		controller : 'my'
			
	}).when('/', {
		templateUrl : 'www/js/view/input.html',
		controller : 'input'
	}).

	otherwise({
		redirectTo : '/'
	});

});
