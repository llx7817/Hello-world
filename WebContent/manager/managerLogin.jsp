<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<%@ include file="../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登陆</title>
</head>
<body>
<p>&nbsp;</p>
<%-- <form:form  id="login_form" action="${contextPath}/manager/managerLogin.do"  method="post" commandName="user" > --%>
<form  id="login_form" action="${contextPath}/manager/managerLogin"  method="post"  >
<table width="80%" align="center">
  <tr>
    <td width="35%" align="right" valign="middle" class="main_title">意象映射平台</td>
    <td width="50%" height="500"><table width="74%">
      <tr>
        <td height="5%" colspan="3" align="center" valign="middle" class="leftblank"><span class="word_style">后台管理登录</span></td>
      </tr>
      <tr>
        <td height="5%" colspan="3" align="center" valign="middle" class="leftblank">&nbsp;</td>
      </tr>
      <tr>
        <td width="34%" align="right" valign="middle" class="thick"><span class="word_style2">用户名：</span></td>
        <td colspan="2" align="left" valign="middle">
          <input  name="account" type="text" class="form-control x319 in "   />
        </td>
      </tr>
      <tr>
        <td align="right" valign="middle" class="thick"><span class="word_style2">密码：</span></td>
        <td colspan="2" align="left" valign="middle">
          <input  name="password" type="text" class="form-control x319 in " />
        </td>
      </tr>
      <tr>
        <td valign="middle">&nbsp;</td>
        <td width="13%" align="left" valign="middle">
<!--           <input type="submit" name="loginbtn" id="loginbtn" value="登录" /> -->
          <button type="submit" class="btn btn-default">登录</button>
        </td>
        <td width="53%" align="left" valign="middle">
        <span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
        <button type="reset" class="btn btn-default">重置</button>
      </tr>
    </table></td>
  </tr>
</table>
</form>
<p>&nbsp;</p>
</body>
</html>
