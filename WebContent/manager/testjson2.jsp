<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试返回json格式的数据</title>
<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="../js/json2.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	alert("jjjj22222");
	testRequestBody();
	
});
function testRequestBody(){
	alert(111);
	$.post("${pageContext.request.contextPath}/json/testRequestBody3",null,function(data){
		$.each(data,function(){
			var tr = $("<tr align='center'/>");
			$("<td/>").html(this.uid).appendTo(tr);
			$("<td/>").html(this.uname).appendTo(tr);
			$("<td/>").html(this.upassword).appendTo(tr);
			$("<td/>").html(this.uemail).appendTo(tr);
			$("#usertable").append(tr);
		})
	},"json");
}
</script>
</head>
<body>
<table id="usertable" border="1" style="border-collapse:collapse;">
	<tr align="center">
		<th>编号：</th>
		<th>姓名：</th>
		<th>密码：</th>
		<th>邮箱：</th>
	</tr>
</table>
</body>
</html>