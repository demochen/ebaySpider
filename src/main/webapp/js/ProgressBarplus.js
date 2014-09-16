// ----------------------------------------------------------------------------------------------
// -------------------------------------- 进条条遮盖组件 -----------------------------------------
// ----------------------------------------------------------------------------------------------

/**
 * 加载进度条
 */
function doLoading() {
	var imgsrc = "";
	if (window.top == window.self) {// 非框架中打开的
		imgsrc = "images/loading.gif";
	}
	if (!(window.top == window.self)) {// 框架中打开的
		imgsrc = "../../images/loading.gif";
	}
	var isIE = (document.all) ? true : false;
	//var isIE6 = isIE && ([ /MSIE (\d)\.0/i.exec(navigator.userAgent) ][0][1] == 6);
	var layer = document.createElement("div");
	layer.align = "center";
	layer.innerHTML = "<div style=\"position:absolute;top:50%;left:50%;margin:-100px 0 0 -100px;width:200px;height:200px;border:0px solid #008800;\"><img src=\""
			+ imgsrc + "\" title=\"加载中，请稍候...\" width=\"76px\" height=\"76px\" /><br/><br/><div align=\"center\" style=\"color: white;\" id=\"show\">加载中，请稍候...</div></div>";
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
	showDateTime_Interval = setInterval(showDateTime, 1000);// 调用计时
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
	clearInterval(showDateTime_Interval);
	var my = document.getElementById("layer");
	my.style.display = "none";
    if (my != null)
        my.parentNode.removeChild(my);
	title_time = "";
	ss_____ = 0;
	hh = 0;
	mi = 0;
	ss = 0;
}

var showDateTime_Interval = null;

var hh = 0;
var mi = 0;
var ss = 0;
var ss_____ = 0;//永久的秒数
var title_time = "";
function showDateTime() {
	ss++;
	ss_____++;
	if (ss == 60) {
		mi++;
		ss = 0;
	}
	if (mi == 60) {
		hh++;
		mi = 0;
	}
	var time = "";
	
	if(ss_____%10==0){
		confirm();
	}
	
	if (hh > 1) {
		doCloseLoading();
		alert("超过系统最大等待时间 1 小时，系统自动离开等待页面", "离开等待页面", "warning");
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
	title_time = (hh == 0) ? "" : hh + " 小时 ";
	time += (mi == 0) ? "" : (time.length == 0) ? "已用时 " + mi + " 分 " : mi + " 分 ";
	title_time += (mi == 0) ? "" : (time.length == 0) ? mi + " 分 " : mi + " 分 ";
	time += (time.length == 0) ? "已用时 " + ss + " 秒 " : ss + " 秒 ";
	title_time += (time.length == 0) ? ss + " 秒 " : ss + " 秒 ";
	document.getElementById("show").innerHTML = time + " ......";
}

function confirm(){
	art.dialog({
	    id: 'testID',
	    title: "系统提示",
	    content: '您已经等待了' + title_time + '  是否继续等待系统响应？',
	    button: [
	        {
	            name: '继续等待',
	            callback: function () {
	                return true;
	            },
	            focus: true
	        },
	        {
	            name: '停止等待',
	            callback: function () {
	            	doCloseLoading();
	            	return true;
	            }
	        }
	    ]
	});
}