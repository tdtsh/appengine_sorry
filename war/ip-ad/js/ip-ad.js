//UAを確認してbodyにクラス追加
$(document).ready(function(){
	var agent = navigator.userAgent;
	if(agent.search(/iPhone/) != -1){
		$("body").addClass("iphone");
	}else if(agent.search(/Android/) != -1){
		$("body").addClass("android");
	}
});

