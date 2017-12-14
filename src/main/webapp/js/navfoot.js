$(function() {
	/*顶部导航*/
	$.ajax({
		type:"post",
		url:"/LoveCupid/topNav.htm",
		success:function(data){
			$(".topNav").html(data);
		}
	});
	/*底部导航*/
	$.ajax({
		type:"post",
		url:"/LoveCupid/footerNav.htm",
		success:function(data){
			$(".footerNav").html(data);
		}
	});
});