//UA���m�F����body�ɃN���X�ǉ�
$(document).ready(function(){
	var agent = navigator.userAgent;
	if(agent.search(/iPhone/) != -1){
		$("body").addClass("iphone");
	}else if(agent.search(/Android/) != -1){
		$("body").addClass("android");
	}
});

