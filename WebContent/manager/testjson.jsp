<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>testreceptdateofJson</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/json2.js"></script>
<script type="text/javascript">
//alert("kkkkkkkk");
/*function load()
{//alert("kkkkkkkk111");
  testRequestBody();

}*/

$(document).ready(function(){
	alert("jjjj22222");
	testRequestBody();
	
});
function testRequestBody(){
	alert(111);
	$.ajax("${pageContext.request.contextPath}/json/testRequestBody2",
	// 发送请求的URL字符串
		{
			dataType : "json", //
			type: "post",      //
			contentType: "application/json",  //
			data: JSON.stringify({uid:9,uname:"好好",upassword:"12356"}),
			async:true,  //
			success: function(data){
				$("#uid").html(data.uid);
				$("#uname").html(data.uname);
				$("#upassword").html(data.upassword);
				$("#uemail").html(data.uemail);
			},
			error: function(){
				alert("数据发送失败");
			}
		});
}
</script>
</head>
<body>
编号： <span id="uid"></span><br>
姓名：<span id="uname"></span><br>
密码： <span id="upassword"></span><br>
邮箱：<span id="uemail"></span><br>
</body>
</html>