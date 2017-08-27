var delUrl = "load/delete";
var listUrl = "list";
$(document).ready(function(){
	$(".deletebtn").click(function(){
		 var id= $(this).attr("myid");
		  $(".deleteOK").click(id,function(){
			  debugger
			  var url = delUrl + "?id=" + id;
			  $.post(url,{
				  id:id
				});
			  location.reload([true]);
		  });
		
	});
	
	$(".cancelbtn").click(function(){
		debugger
		 window.location.href= listUrl;
	});
});
