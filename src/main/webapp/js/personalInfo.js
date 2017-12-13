$(function(){
	$("#content .share b").mouseover(function(){
		var oldy =parseInt($(this).css("background-position-y"));
		var newy = oldy - 20;
		$(this).css("background-position-y",newy+"px");		
	});
	
	$("#content .share b").mouseout(function(){
		var oldy =parseInt($(this).css("background-position-y"));
		var newy = oldy + 20;
		$(this).css("background-position-y",newy+"px");	
	});
	

});