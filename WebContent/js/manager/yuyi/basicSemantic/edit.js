
var listUrl = "list";
var toEditUrl ="edit";
$(".cancelbtn").click(function(){
		debugger
		 window.location.href= listUrl;
	});
$("#editForm").submit(function() { 
    $(this).ajaxSubmit(function() {   
    		}); 
       return false; //阻止表单默认提交
});
	$(".savebtn").click(function(){
		debugger
		 window.location.href= listUrl;
//		 $(this).parents(".editForm").submit(function() { 
//		        $(this).ajaxSubmit(function() {   
//		        		}); 
//		           return false; //阻止表单默认提交
//			});
//		 location.reload([true]);
	});