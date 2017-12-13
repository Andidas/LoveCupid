$(function() {
	$(".js-editBtn").click(function() {
		$(this).parents(".js-preview").siblings(".js-edit").removeClass("hidden");
		$(this).parents(".js-preview").addClass("hidden");
		$(this).parents(".profile-caption").siblings(".js-edit").removeClass("hidden");
		$(this).parents(".profile-caption").siblings(".js-preview").addClass("hidden");
		$(this).siblings(".js-cancelEditBtn").siblings(".js-editBtn").addClass("hidden");
		$(this).siblings(".js-cancelEditBtn").removeClass("hidden");
	});
	$(".js-cancelEditBtn").click(function() {
		$(this).parents(".js-edit").siblings(".js-preview").removeClass("hidden");
		$(this).parents(".js-edit").addClass("hidden");
		$(this).parents(".profile-caption").siblings(".js-preview").removeClass("hidden");
		$(this).parents(".profile-caption").siblings(".js-edit").addClass("hidden");
		$(this).siblings(".js-editBtn").siblings(".js-cancelEditBtn").addClass("hidden");
		$(this).siblings(".js-editBtn").removeClass("hidden");
	});
	$(".profile-tab-trend").click(function() {
		$(this).addClass("on");
		$(this).siblings().removeClass("on");
	});
	$(".profile-tab-info").click(function() {
		$(this).addClass("on");
		$(this).siblings().removeClass("on");
	});

	$(".js-trend-content").focus(function() {
		$(".js-placeholder").css("display", "none");
	});
	$(".js-trend-content").blur(function() {
		if ($(this).val() == "" || $(this).val() == null || $(this).val() == undefined) {
			$(".js-placeholder").css("display", "block");
		}
	});
	$(".js-add-tag").click(function() {
		$(".js-trend-content").focus();
		var content = $(".js-trend-content").val();
		if (content != null && content != "" && content != undefined) {
			$(".js-trend-content").val(content + $(this).text());
		} else {
			$(".js-trend-content").val($(this).text());
		}
	});
	$(".js-create-tag").click(function() {
		$(".js-trend-content").focus();
		var content = $(".js-trend-content").val();
		if (content != null && content != "" && content != undefined) {
			$(".js-trend-content").val(content + "##");
		} else {
			$(".js-trend-content").val("##");
		}
	});
	$(".close").click(function() {
		$(".js-trend-content").val("");
		if ($(".js-trend-content").val() == "" || $(".js-trend-content").val() == null || $(".js-trend-content").val() == undefined) {
			$(".js-trend-content").blur();
		}
	});
	$(".js-trend-content").keyup(function() {
		var len = $(this).val().length;
		$(".js-word-count").text(len);
		$(".submit-trigger").removeClass("disabled");
		if (len > 163) {
			$(".js-word-count").css("color", "red");
		} else {
			$(".js-word-count").css("color", "#ccc");
		}
		if(len==0){
			$(".submit-trigger").addClass("disabled");
		}
	});
	$(".icon-upload-profile-letter").click(function(){
		$(".poplayer-letter").removeClass("hidden");
		$(".masklayer").removeClass("hidden");
	});
	$(".close-trigger").click(function(){
		$(".ui-scrollbar").val("");
		$(".poplayer-letter").addClass("hidden");
		$(".masklayer").addClass("hidden");
	});
	$(".myfirst").click(function(){
		var index = $(".js-tab a").index(this);
		$(this).removeClass("current");
		$(this).prevAll().removeClass("current");
		$(this).nextAll().removeClass("current");
		$(this).addClass("current");
		var strclass = $(".js-content").attr("class");
		var lastclass = strclass.split(" ")[2];
		$(".js-content").removeClass(lastclass);
		if(index==0){
			$(".js-content").addClass("letter-template-default");
		}else if(index==1){
			$(".js-content").addClass("letter-template-past");
		}else if(index==2){
			$(".js-content").addClass("letter-template-xiaoshipian");
		}
		else if(index==3){
			$(".js-content").addClass("letter-template-unbosom");
		}
	});
	$(".ui-scrollbar").keyup(function(){
		var len = $(this).val().length;			
		if(len>10){
			$(".js-btn-txt").removeClass("disabled");
		}else{
			/*$(".char-constantia").text(10-len);	*/
			$(".js-btn-txt").addClass("disabled");
		}
		
	});
});