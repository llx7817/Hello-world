//var toEditUrl = "${contextPath}/manager/basicSemantic/edit";
var toEditUrl ="edit";
var toDeleteUrl ="todelete";
$(document).ready(function(){
	
	$(".addbtn").click(function(){
		debugger
		 var id= $(this).attr("myid");
		 var url = toEditUrl + "?tt=" + Math.random(0, 100);
	      debugger
	      if(id != undefined){
	      	 url += "&id=" + id;
	      }
	      window.location.href= url;
	});
	$(".deletebtn").click(function(){
	      window.location.href= toDeleteUrl;
	});
	

});
