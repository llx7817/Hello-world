<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>

<script type="text/javascript">
   /* function loginCheck(){
        var account = document.getElementById("account");
        var password = document.getElementById("password");
        if(account.value==""){
            alert("请输入账号");
            return false;
        }else if(password.value==""){
            alert("请输入密码");
            return false;
        }
    }*/
</script>

</head>
<body>
<h2>管理员登录</h2>
${status }${errorMessage }
<form action="managerLogin" method="post"
			>

账号：<input type="text" class="txt" id="account" name="account"
						placeholder="账号" /><br>
密码：<input type="password" class="txt" id="password" name="password"
						placeholder="密码" />
<button type="submit" id="loginbtn">登录</button>
</from>				
</body>
</html>