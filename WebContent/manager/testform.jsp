<%@page import="cn.art.util.pojo.codecase"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>yuyi</title>
<script type="text/javascript">
 
alert(1);

</script>
</head>
<body>
${codecase }
<form action="${codecase}/confirm" method="post">

产品名称：<input type="text" class="txt" id="TName" name="TName"
						placeholder="产品名称" /></br>
产品图标：<input type="text" class="txt" id="TIcon" name="TIcon"
						placeholder="产品图标" /></br>
语义介绍：<input type="text" class="txt" id="TYuyi" name="TYuyi"
						placeholder="语义介绍" /></br>
词汇词对：<input type="text" class="txt" id="TWordType" name="TWordType"
						placeholder="词汇词对" /></br>
产品算法：<input type="text" class="txt" id="TAlgorithm" name="TAlgorithm"
						placeholder="产品算法" /></br>
<button type="submit" id="save">保存</button>
</body>
</html>