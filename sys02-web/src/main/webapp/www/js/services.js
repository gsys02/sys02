var self = angular.module('services', [ 'ngResource' ]);

self.service('Api', function($resource) {

	this.ya = function(text) {
		return "Factory says \"Hello " + text + "\"";
	};

	this.datos = function() {
		return $resource('api/:name/:id');
	};

});
