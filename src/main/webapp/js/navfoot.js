$(function() {
	var curPage = $(".curPage").val();
	/*顶部导航*/
	$.ajax({
		type:"post",
		url:"/LoveCupid/topNav.htm",
		success:function(data){
			$(".topNav").html(data);
			$(".topNav #leftul li").removeClass("on");
			$(".topNav #leftul li").eq(curPage).addClass("on");
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
	//顶部导航的链接
	$(".topNav #leftul li").click(function(){
		
	});
});