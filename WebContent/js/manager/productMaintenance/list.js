var delUrl = "load/delete";
//var listUrl = "list";
//var contextPath="${contextPath}";
var toEditUrl ="edit";
$(document).ready(function(){
//	 location.reload([true]);
	$(".deletebtn").click(function(){
		 var id= $(this).attr("myid");
		  $(".deleteOK").click(id,function(){
			  debugger
			  var url = delUrl + "?id=" + id;
			  $.post(url,id);
			  location.reload([true]);
		  });
	});
	$(".addbtn").click(function(){
		var id= $(this).attr("myid");
		 var url = toEditUrl + "?tt=" + Math.random(0, 100);
	        debugger;
	        if(id != null){
	        	 url += "&id=" + id;
	        }
	        window.location.href= url;
	});
});