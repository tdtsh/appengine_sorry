//傾きの角度取得してbodyのクラスを変更
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

//初期状態を確認してbodyにクラス追加
$(document).ready(function(){
	tilt();

	//傾きが変わったら実行
	var agent = navigator.userAgent;
	if(agent.search(/iPhone/) != -1){
		window.onorientationchange = tilt;
	}else{
		window.onresize = tilt;
	}
});

