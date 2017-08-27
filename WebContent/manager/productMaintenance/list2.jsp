<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>产品类型维护</title>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
</head>

<body>
	<div class="main-body-position">
		<div class="position-for-head2 thick ">产品类型维护</div>
		<div class="container-position">
				<div class="mydiv gray-background" >产品类型<a href="edit.jsp" class="blue_right  addnew" >+添加新类型</a></div>
				
				<div class="mydiv">游艇
					<span class="blue_right">
						<a  href="javascript:void(0)"  class="blue deletebtn" data-toggle="modal" data-target="#myModal">删除 </a>
							&nbsp;&nbsp;&nbsp;&nbsp;
						<span  class="blue editbtn" >
							<a href="javascript:void(0)" class="blue" >编辑</a>
						</span>
					</span>
				</div>
				
		</div>
		
		
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
							<button type="button" class="btn btn-primary">确定</button>
							<button type="button" class="btn btn-primary" data-dismiss="modal">取消</button>
						</div>
						</div>
				</div>
				</div>
			</div>

</body>
<script type="text/javascript" src="${contextPath}/js/manager/productMaintenance/list.js"></script>
</html>
