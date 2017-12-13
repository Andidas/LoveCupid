$(function() {
	$("#myli1").hover(function() {
			$(this).find(".glyphicon").css("color", "black");
		},
		function() {
			$(this).find(".glyphicon").css("color", "gainsboro");
		});
	$("#myli2").hover(function() {
			$(this).find(".glyphicon").css("color", "black");
		},
		function() {
			$(this).find(".glyphicon").css("color", "gainsboro");
		});
});