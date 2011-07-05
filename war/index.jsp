<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="content-script-type" content="text/javascript" />
	<meta http-equiv="content-style-type" content="text/css" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<title>iPhoneの縦・横でスタイルを切り替える</title>
	<link type="text/css" rel="stylesheet" href="css/style.css" />
	<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="js/tilt.js"></script>
</head>
<body>

<div id="container">
	<div id="conts">
		<h1 class="title">iPhoneの縦・横でスタイルを切り替える</h1>

		<h2 class="naviTitle">横並びのボックスサイズを変更する</h2>
		<div class="boxSet clearfix">
			<div class="box left">
				<!--a href="/sns/bc/imagestr/index.html" target="_blank">しゃもじくん</a-->
			<ul>
				<li><a href="sample/test.html">sample</a></li>
				<li><a href="ui/dialog/index.html">dialog</a></li>
				<li><a href="html5/index.html">html5/index.html</a></li>
				<li><a href="html5/iphone.html">html5/iphone.html</a></li>
			</ul>
			</div>
		
			<div class="box right">
				<a href="ip-ad/index.html">iPhone/Androidで背景色が変わる</a>
			</div>
		</div>

		<h2 class="naviTitle">縦のときだけ表示されるテキスト</h2>
		<p class="image">
			サンプルテキストサンプルテキストサンプルテキストサンプルテキストサンプルテキストサンプルテキスト
			<br />
			<br />
			<a href="ui/dialog/index.html">dialog</a>
			</p>
	</div>
</div>	

</body>
</html>
