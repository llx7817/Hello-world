var listUrl = "list";
//var toEditUrl = "${contextPath}/manager/basicSemantic/edit";
var toEditUrl ="edit";
$(document).ready(function(){
	
	debugger
	$(".btn").click(function(){
		debugger
		var data= $(this).attr("data");
		$(this).parent().find('button').removeClass('btn-primary');
		$(this).addClass('btn-primary');
		$(this).parent().find('input').val(data);
	});
	
	
	if(twordtype==1){
		$("#cihui").addClass('btn-primary');
	}
	if(twordtype==2){
			$("#cidui").addClass('btn-primary');
		}
	if(talgorithm==111){
		$("#gaojiaobei").addClass('btn-primary');
	}
	if(talgorithm==222){
			$("#meiqizao").addClass('btn-primary');
		}
	if(talgorithm==333){
		$("#zhiwu").addClass('btn-primary');
	}
	if(talgorithm==444){
		$("#youting").addClass('btn-primary');
	}
	$(".cancelbtn").click(function(){
		debugger
		 window.location.href= listUrl;
	});
	
	/**
	 * 提交保存
	 */
//	$("#submit0").click(function(){
//		debugger
//		 var form = $("#editForm0");
//		var action = form.attr("action");
//		$.post(action,item, function(data) {
//		});
//	});
	
//	$("#submit0").click(function(){
//		debugger;
//		var form = $("#editForm0");
//		var action = form.attr("action");
//        var options = {
//            url: action,
//            target: "#div2",
//            success: function () {
//                alert("ajax请求成功");
//            }
//        };
//        $("#editForm0").ajaxForm(options);
//    });
//	 $("#editForm0").submit(function() { 
//	        $(this).ajaxSubmit(function() {   
////	                $('#output').html("提交成功").show();    
//	        		}); 
//	           return false; //阻止表单默认提交
//		});
	$(".savebtn").click(function(){
		debugger;
		 window.location.href= listUrl;
		 $(this).parents(".editForm").submit(function() { 
		        $(this).ajaxSubmit(function() {   
		        		}); 
		           return false; //阻止表单默认提交
			});
//		var form = $("#editForm0");
//		var action = form.attr("action");
//		 location.reload([true]);
	});
});
