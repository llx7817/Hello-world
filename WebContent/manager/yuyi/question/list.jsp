<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>问卷调查与检验</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
</style>

</head>

<body>
	<div class="main-body-position">
	<form:form id="editForm"  method="post"  action="${contextPath}/manager/question/load/eidt"
					commandName="survey" methodParam="post">
<%-- 					<form:hidden path="tid" /> --%>
<%-- 					<form:hidden path="sid" /> --%>
		<div class="position-for-head2 thick ">语义库管理>问卷调查与检验</div>
		<div class="container-position">
				<div class="mydiv gray-background" >问卷调查与检验</div> 
				<div class="mydiv"  id="producttype">产品类型
						<c:forEach var="type" items="${typeList}" varStatus="status">	
									<button type="button" class="btn btn-link chooseTypebtn" myid="${type.tid }" >${type.tname }</button>  
						</c:forEach>
				</div>
				<div class="mydiv"  id="SurveyType">调查类型
						<button type="button" class="btn btn-link orange choosebtn" myname="意象词汇降维调查" >意象词汇降维调查</button>  
						<button type="button" class="btn btn-link choosebtn" myname="词汇降维调查结果" >词汇降维调查结果</button>  
						<button type="button" class="btn btn-link choosebtn" myname="意象造型关联" >意象造型关联</button>  
						<button type="button" class="btn btn-link  choosebtn" myname="造型关联调查结果" >造型关联调查结果</button>  
						<button type="button" class="btn btn-link choosebtn" myname="意象造型关联算法" >意象造型关联算法</button>  
						<button type="button" class="btn btn-link choosebtn" myname="检查匹配率" >检查匹配率</button>  
				</div>
				<br>
				<div class="mydiv gray-background"  id="questionTitle">意象词汇降维调查	</div> 
				<div class="mydiv"  id="SurveyDetial" style=" width: initial;height: initial;" >
						<br>
						<form:input path="tid"   class="form-control " />
						<form:input path="sid"   class="form-control " />
<%-- 						<form:input path="type3"   class="form-control " size="10"/> --%>
						<br>
						<div class=" text-center">
									<button type="submit" class="btn btn-primary savebtn">添加</button>
									<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>	
				</div>
				
				<br>
		</div>
		<script type="text/javascript">
		debugger
			var contextPath='${contextPath}';
			var tid='${tid}';
			var sid='${sid}';
		</script>
		</form:form>
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
<script type="text/javascript" src="${contextPath}/js/manager/yuyi/question/list.js"></script>

</body>

</html>
