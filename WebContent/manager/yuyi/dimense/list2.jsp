<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>降维词汇库</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>

<body>
	<div class="main-body-position">
	<form id="form0"  method="post" action="${contextPath}/manager/dimense">
		<div class="position-for-head2 thick ">语义库管理>降维词汇库</div>
		<div class="container-position">
		
				<div class="mydiv gray-background" >降维词汇库</div> 
				<div class="mydiv">
				组织形式
						<button type="button" class="btn btn-link " >词汇</button> 
						<button type="button" class="btn btn-link ">词对</button> 
				</div>
		<br>
				<div class="mydiv gray-background" >降维词汇库
				<button type="button" class="btn btn-link pull-right addbtn">+添加新词汇</button> 
				<button type="button" class="btn btn-link pull-right deletebtn" >删除</button> 
				</div> 
				<c:forEach var="types" items="${typesList}" varStatus="status">
				<div class="mydiv">${types.tname }
						<button type="button" class="btn btn-link pull-right deletebtn" data-toggle="modal" data-target="#myModal">删除</button> 
						<button type="button" class="btn btn-link pull-right addbtn">编辑</button> 
				</div>
				  </c:forEach>
				
				<br>
		</div>
		</form>
	</div>

</body>
<script type="text/javascript" src="${contextPath}/js/manager/dimense/list.js"></script>
</html>
