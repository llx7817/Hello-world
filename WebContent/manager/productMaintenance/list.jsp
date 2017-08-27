<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>产品类型维护</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>

</head>

<body>
	<div class="main-body-position">
<%-- 	<form id="form0"  method="post" action="${contextPath}/manager/productMaintenance/list"> --%>
		<div class="position-for-head2 thick ">产品类型维护</div>
		<div class="container-position">
				<div class="mydiv gray-background" >产品类型
				<button type="button" class="btn btn-link pull-right addbtn">+添加新类型</button> 
				</div> 
				<c:forEach var="types" items="${typesList}" varStatus="status">
				<div class="mydiv"  myid="${types.tid }">${types.tname }
						<button type="button" myid="${types.tid }" class="btn btn-link pull-right deletebtn" data-toggle="modal" data-target="#myModal">删除</button> 
						<button type="button" myid="${types.tid }" class="btn btn-link pull-right addbtn">编辑</button> 
				</div>
				  </c:forEach>
				<script type="text/javascript">
// 				$(".addbtn").click(function(){
// 					var a="123";
// 					console.log("123");
// 				});
				</script>
				<br>
		</div>
<!-- 		</form> -->
	</div>
	<!-- 按钮触发模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content" style=" width: 65%;">
						<div class="mydiv gray-background "  style="width: 100%;">
							产品类型维护  
						</div>
						<div class="mydiv  text-center" style=" height: 130px; width: 100%;">
							您确定需要删除这个类型吗？ 
						<div  style="padding: 28px;    text-align: right;">
							<button type="submit" class="btn btn-primary  deleteOK">确定</button>
							<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
						</div>
						</div>
				</div>
				</div>
			</div>
<script type="text/javascript" src="${contextPath}/js/manager/productMaintenance/list.js"></script>
</body>

</html>
