 $("#testploat").click(function(){
    	 var sellername=$("#searchBarMainInput").val();
    		$("#flex1").flexigrid
    		   ({
    		    url: '/selectFeedBack?sellerName='+sellername,
    		    dataType: 'json',
    		    colModel: [
    		                {display: 'Attitude', name : 'attitude', width : 50, sortable : true, align: 'center'},  
    		                {display: 'ItemId', name : 'itemId', width : 180, sortable : true, align: 'left'},  
    		                {display: 'ItemName', name : 'itemName', width : 80, sortable : true, align: 'left'},  
    		                {display: 'Price', name : 'price', width : 80, sortable : true, align: 'left'},  
    		                {display: 'StarLevel', name : 'star', width : 80, sortable : true, align: 'left'}  
    		    ],
    		    sortname: "Unid",
    		    sortorder: "asc",
    		    usepager: true,
    		    striped: true,
    		    title: 'FeedBack',
    		    useRp: false,
    		    rp: 10,
    		    width: 'auto',
    		    height: 255,
    			singleSelect: true,
    			nowrap: true,
    			usepager: true,
    			useRp: true,
    			showTableToggleBtn: false,
    			autoload: true,
    			pagestat: '当前记录:{from}-{to} (共{total}条)',
    			pagetext: '转至',
    			outof: '/',
    			findtext: '查询',
    			procmsg: '正在处理，请稍候...',
    			nomsg: '没有查询结果',
    			errormsg: '查询出错'	,
    			resizable:false,
    			blockOpacity: 0.5
    		});
    	});
