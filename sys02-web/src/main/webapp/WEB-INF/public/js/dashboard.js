function onMain(url) {
	$('#main').attr('src', url)
}

$(function() {

	$('#f_menubar\\:user').click(function() {

		$('#main').attr('src', 'http://www.w3schools.com/tags/tag_br.asp')

		// $('#main').html("s");

		// $.ajax({
		// url : "http://dev:8080/web/login",
		// crossDomain : true
		// }).done(function(data) {
		// $('#main').html(data);
		// });

	})

});