$(function(){
	for(var i=1;i<=10;i++){
		$("#girls").append("<img src="+getRootPath()+"/images/girls/girl"+i+".jpg />");
		$("#girls img").eq(i-1).css("left",77*(i-1)+3+"px");
	}
	/*图片*/
	$("#top #girls img").hover(function(){
		$(this).css("transform","scale(1.6)");  
		$(this).css("z-index","100");  
	},function(){
		$(this).css("transform","scale(1)");  
		$(this).css("z-index","0");  
	});
	/*vipBanner*/
	$("#top #vipBanner").hover(function(){
		$("#top #vipBanner").animate({top:"-110px"});		
	},function(){
		$("#top #vipBanner").animate({top:"0px"});	
	});
	/*更多条件点击*/
	$("#center #moreConditonA").click(function(){	
		/*箭头向上，缩起来*/
		if($(this).css("background-position")=="-163px 706px"){
			//更新箭头向下
			$(this).css("background-position","-133px 706px");
			$("#query").css("height","100px");
		}
		/*箭头向下，展开*/
		else{
			//更新箭头向上
			$(this).css("background-position","-163px 706px");
			$("#query").css("height","150px");
		}
	
	});
	/*编辑*/
	$("#edit").click(function(){
		if($("#queryCondition").css("height")=="6px"){
			$("#queryCondition").css("height","110px");
		}
		else{
			$("#queryCondition").css("height","0px");	
		}
	});
	/*编辑中的取消*/
	$("#cancel").click(function(){
		$("#queryCondition").css("height","0px");
	});
});



function getRootPath(){
	var curPath = location.href;   //	http://localhost:8088/SSM_1_JSON/index.jsp
	var pathName = location.pathname;   //	SSM_1_JSON/index.jsp
	var pos = curPath.indexOf(pathName);  
	var localhostPath = curPath.substring(0, pos);   //	http://localhost:8088/
	var projectName = pathName.substring(0, pathName.substr(1).indexOf("/")+1);  //  SSM_1_JSON
	return (localhostPath+projectName);    //	http://localhost:8088/SSM_1_JSON
}

