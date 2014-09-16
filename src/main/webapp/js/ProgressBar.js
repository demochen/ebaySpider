// ----------------------------------------------------------------------------------------------
// -------------------------------------- 进条条遮盖组件 -----------------------------------------
// ----------------------------------------------------------------------------------------------

/**
 * 加载进度条
 */
function doLoading() {
	var imgsrc = "";
	if (window.top == window.self) {// 非框架中打开的
		imgsrc = "../img/loading.gif";
	}
	if (!(window.top == window.self)) {// 框架中打开的
		imgsrc = "../img/loading.gif";
	}
	var isIE = (document.all) ? true : false;
	//var isIE6 = isIE && ([ /MSIE (\d)\.0/i.exec(navigator.userAgent) ][0][1] == 6);
	var layer = document.createElement("div");
	layer.align = "center";
	layer.innerHTML = "<div style=\"position:absolute;top:50%;left:50%;margin:-100px 0 0 -100px;width:200px;height:200px;border:0px solid #008800;\"><img src=\""
			+ imgsrc + "\" title=\"加载中，请稍候...\" width=\"76px\" height=\"76px\" /><br/><br/><div align=\"center\" style=\"color: white;\" id=\"show\">加载中，请稍候..." +
					"</div><button type='button'>Close Me!</button></div>";
	layer.id = "layer";
	layer.style.width = "100%";
	layer.style.height = "100%";
	layer.style.position = "fixed";
	layer.style.top = layer.style.left = 0;
	layer.style.backgroundColor = "#000";
	layer.style.zIndex = "999";
	layer.style.opacity = "0.25";
	document.body.appendChild(layer);
	var sel = document.getElementsByTagName("select");
	for ( var i = 0; i < sel.length; i++) {
		sel[i].style.visibility = "hidden";
	}
	function layer_iestyle() {
		layer.style.width = Math.max(document.documentElement.scrollWidth,
				document.documentElement.clientWidth) + "px";
		layer.style.height = Math.max(document.documentElement.scrollHeight,
				document.documentElement.clientHeight) + "px";
	}
	if (isIE) {
		layer.style.filter = "alpha(opacity=60)";
	}
	close__ = false;
	setInterval(showDateTime, 1000);// 调用计时
	/*
	 * 屏蔽，点击事件，关闭遮盖 layer.onclick = function() { newbox.style.display = "none";
	 * layer.style.display = "none"; for ( var i = 0; i < sel.length; i++) {
	 * sel[i].style.visibility = "visible"; } }
	 */
}

/**
 * 关闭进度条
 */
function doCloseLoading() {
	close__ = true;
	document.getElementById("layer").style.display = "none";
}

var close__ = false;

var hh = 0;
var mi = 0;
var ss = 0;
function showDateTime() {
	if(close__){return;}
	ss++;
	if (ss == 60) {
		mi++;
		ss = 0;
	}
	if (mi == 60) {
		hh++;
		mi = 0;
	}
	var time = "";
	if (hh > 1) {
		time = "可能已经出现错误 已用时 ";
	} else if (mi > 0) {
		if (mi > 1 && mi < 6) {
			time += "请耐心等待  已用时 ";
		} else if (mi > 5 && mi < 31) {
			time += "数据量大 请耐心等待  已用时 ";
		} else if (mi > 30) {
			time += "等待时间过长  已用时 ";
		}
	}
	time += (hh == 0) ? "" : hh + " 小时 ";
	time += (mi == 0) ? "" : (time.length == 0) ? "已用时 " + mi + " 分 " : mi
			+ " 分 ";
	time += (time.length == 0) ? "已用时 " + ss + " 秒 " : ss + " 秒 ";
	document.getElementById("show").innerHTML = time + " ......";
}