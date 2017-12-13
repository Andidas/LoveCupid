$(function(){
	for(var i=0;i<5;i++){
		$("#center #girls").append("<div class=personalInfo><img src=images/girls/girl"+(i+13)+".jpg><div class=state><h3>【第635期】微博控美腻90后小妞， 找175以上幽默的暖男</h3><p>我叫张勤，91年出生，天平座，外貌协会钻石级会员。平时喜欢画画，打羽毛球，逛街买衣服。我在上海工作学习，你也在上海，或者周边城市也可以。希望我们有共同语言。" +
				"期望找一个温暖细心，有幽默感的男生。身高最好不要低于175 ，不喜欢瘦子，不希望你很忙，有时间可以陪我。</p></div><span class=fnumber><span class=number>9,308</span><br>人看过</span><div class=detail><div>查看详情</div>");	
	}
	$(".personalInfo").click(function(){
		window.open("http://localhost:8080/love/personalInfo.html");	
	});
});