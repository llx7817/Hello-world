<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>语义库</title>

</head>

<body>
	<div class="main-body-position">
			<div class="position-for-head2 thick ">语义库管理>基础意象语义库>首字母分类</div>
			
			<div class="container-position">
			<div class="table-responsive">          
			       	<table class="table table-striped table-bordered">
					<thead>
						<tr>
								<th  style="width: 80px;">
									<span class="my-no-br-right" style="display: inline-block; padding-bottom: 7px; "> 
											首字母
									</span>
								</th>
								<th>
									<span class="my-no-br-right" style="display: inline-block; padding-top: 7px; "> 
											已有词汇
									</span>
									
<!-- 									<button type="button" class="btn btn-link pull-right addbtn">编辑</button>  -->
<!-- 									 <a href="javascript:void(0)" hidefocus="true" class="btn btn-link pull-right addbtn" id="addBtn">+添加新词汇</a> -->
									<button type="button" class="btn btn-link pull-right deletebtn" >删除</button> 
									<button type="button" class="btn btn-link pull-right addbtn" >+添加新词汇</button>
								</th>
						</tr>
					</thead>
		         	<tbody>
					<tr>
	             		<td>A</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'A'}">
									<span class="my-left"> 
										<button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button>
									</span>
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>B</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'B'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>C</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'C'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>D</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'D'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>E</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'E'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>F</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'F'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>G</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'G'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>H</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'H'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>I</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'I'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>J</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'J'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>K</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'K'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>L</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'L'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>M</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'M'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>N</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'N'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>O</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'O'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>P</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'P'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>Q</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'Q'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr><tr>
	             		<td>R</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'R'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>S</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'S'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>T</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'T'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>U</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'U'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr><tr>
	             		<td>V</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'V'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>W</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'W'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	
		           	<tr>
	             		<td>X</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'X'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>Y</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'Y'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		           	<tr>
	             		<td>Z</td>
						<td>
							 <c:forEach var="item" items="${wordList}" varStatus="status">	
								<c:if test="${item.wfirstchar eq 'Z'}">
									<span class="my-left"> <button type="button" class="btn btn-link pull-right addbtn" style="line-height: 0.25;" myid="${item.wid}">${item.wword} </button></span> 
								</c:if>
							</c:forEach>
						</td>
		           	</tr>
		         	</tbody>
			       	</table>
			</div>
				
  </div>
<%-- 		</form:form>	 --%>
	</div>
	<!-- 按钮触发模态框 -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content" style=" width: 65%;">
						<div class="mydiv gray-background "  style="width: 100%;">
							语义库  
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
<script type="text/javascript" src="${contextPath}/js/manager/yuyi/basicSemantic/list.js"></script>
</body>
</html>
