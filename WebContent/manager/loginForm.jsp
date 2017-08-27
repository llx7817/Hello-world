<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="POST">
	<table>
		<tr>
			<td><lable>登录名：</lable></td>
			<td><input type="text" id="loginname" name="loginname"></td>
		</tr>
		<tr>
			<td><lable>密码：</lable></td>
			<td><input type="password" id="password" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="注册"></td>
		</tr>
	</table>
</form>
</body>
</html>