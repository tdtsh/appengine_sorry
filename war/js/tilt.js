//�X���̊p�x�擾����body�̃N���X��ύX
function tilt(){
	var orientation = window.orientation;
	if(orientation == 0){
		$("body").addClass("portrait");
		$("body").removeClass("landscape");
	}else{
		$("body").addClass("landscape");
		$("body").removeClass("portrait");
	}
}

//������Ԃ��m�F����body�ɃN���X�ǉ�
$(document).ready(function(){
	tilt();

	//�X�����ς��������s
	var agent = navigator.userAgent;
	if(agent.search(/iPhone/) != -1){
		window.onorientationchange = tilt;
	}else{
		window.onresize = tilt;
	}
});

