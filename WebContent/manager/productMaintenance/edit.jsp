<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../../common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑新类型</title>
<style type="text/css">
</style>

</head>

<body >
<div class="main-body-position">
<div id="div2"></div>
	<div class="position-for-head2 thick">产品类型维护>
	        	<c:if test="${empty item.tid }">
	        		添加新类型
	        	</c:if>
	        	<c:if test="${not empty item.tid }">
	        		编辑产品
	        	</c:if>
	</div>
	<div class="container-position " >
<!-- 	<div class="mydiv"style=" width: initial;"> -->
			<ul id="myTab" class="nav nav-tabs">
				<li class="active">
					<a href="#home" data-toggle="tab">产品基本信息	</a>
				</li>
				<li ><a href="#myTab1" data-toggle="tab">底层案例库</a></li>
				<li ><a href="#myTab2" data-toggle="tab">编码案例库</a></li>
				<li ><a href="#myTab3" data-toggle="tab">新造型库</a></li>
				<li ><a href="#myTab4" data-toggle="tab">参数设置</a></li>
				<li ><a href="#myTab5" data-toggle="tab">造型生成</a></li>
				<li ><a href="#myTab6" data-toggle="tab">造型调整</a></li>
			</ul>
	<div class="mydiv"style=" width: initial;height: initial;">
			<div id="myTabContent" class="tab-content">
				<div class="tab-pane fade in active" id="home">
					<form:form id="editForm0"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post">
					<form:hidden path="tid" />
<%-- 					<form:hidden path="tname" /> --%>
<%-- 					<form:hidden path="talgorithm" /> --%>
<%-- 					<form:hidden path="twordtype" /> --%>
<%-- 					<form:hidden path="tyuyi" /> --%>
					<form:hidden path="tanli" />
					<form:hidden path="tbianma" />
					<form:hidden path="tzaoxing" />
					<form:hidden path="tcanshu" />
					<form:hidden path="tshengcheng" />
					<form:hidden path="ttiaozheng" />
<%-- 					<form:hidden path="ticon" /> --%>
						<br>
						<div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">产品名称</span></label>
								  <div class="my-no-br-right" >
								  <form:input path="tname"   class="form-control "  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
								  <label for="product_ico"><span class="thick label-name">产品图标</span></label>
								  <div class="my-no-br-right" >
								  <!-- 									  		<a href="#">浏览上传</a>  -->
<%-- 								  <form:input path="tico"   class="form-control " size="10"/> --%>
								  		<input type="file" class="form-control " id="tico"  size="10"/>
								  </div>
						</div> 
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
							  <div class="my-no-br-right" >
							  		 <form:textarea  class="form-control textarea-size" path="tyuyi"  />
							  </div>
						</div> 	
						 <br>
				        <span class="thick ">产品降维词汇</span>
				        <p class=" blank-left">
				          	<label>词汇组织方式 </label>
				          	<span  >
				          		<button type="button" class="btn btn-default "  id="cihui" data="1">词汇</button>
				          		<button type="button" class="btn btn-default"  id="cidui" data="2">词对</button>
				          		<form:input path="twordtype"   class="form-control " size="10"  type="hidden"/>
				          	</span>
				        </p>
				        <p>
					        <label class="thick">算法选择</label>
					        	<span >
				          		<button type="button" class="btn btn-default "  id="gaojiaobei" data="111">高脚杯算法</button>
				          		<button type="button" class="btn btn-default"  id="youting"   data="444">游艇算法</button>
				          		<button type="button" class="btn btn-default "  id="zhiwu"  data="333">织物算法</button>
				          		<button type="button" class="btn btn-default"  id="meiqizao"   data="222">煤气灶算法</button>
				          		<form:input path="talgorithm"   class="form-control " size="10" type="hidden"/>
				          	</span>
					     </p>
				        <br><br>
				       <div class=" text-center">
							<button type="submit" class="btn btn-primary savebtn" id="submit0">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
							<script type="text/javascript">
// 							var item=${item};
//  										var twordtype=${item.twordtype };
//  										var talgorithm=${item.talgorithm };
						</script> 
				      </form:form>
				
				</div>
				<div class="tab-pane fade" id="myTab1">
						<form:form id="editForm1" class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post"> 
						<form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
<%-- 						<form:hidden path="tanli" /> --%>
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
						  <br> 
						  <div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">产品介绍</strong></label>
							  <div class="my-no-br-right" >
							  		<form:textarea  class="form-control textarea-size" path="tanli"  />
							  </div>
						</div> 
						  <br>
						  
				        <div id="addtype">
						  <div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">类型1</span></label>
								  <div class="my-no-br-right" >
<%-- 								  		<form:input path="type1"   class="form-control " size="10"/> --%>
<!-- 								  		<input type="text" class="form-control " id="type1"   value="阔口型" size="10"/> -->
								  </div>
						</div> 
						  <div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">类型2</span></label>
								  <div class="my-no-br-right" >
<%-- 								  		<form:input path="type2"   class="form-control " size="10"/> --%>
<!-- 								  		<input type="text" class="form-control " id="type2"   value="收口型" size="10"/> -->
								  </div>
						</div> 
						  <div class="input-title-position">
								  <label for="product_name"><span class="thick label-name">类型3</span></label>
								  <div class="my-no-br-right" >
<%-- 								  		<form:input path="type3"   class="form-control " size="10"/> --%>
<!-- 								  		<input type="text" class="form-control " id="type3"  size="10"/> -->
								  </div>
						</div> 
					        <p>
						        <span class="thick">
						        <a href="javascript:void(0)" class="blue" id="add" >+添加新类型
						        </a> 
						        </span>
					        </p>
				        </div>
				       <br><br>
						<div class=" text-center">
							<button type="submit" class="btn btn-primary savebtn"  id="submit1">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
			</form:form>
				</div>
				<div class="tab-pane fade" id="myTab2">
					 	<form:form id="editForm2"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post">
					 	<form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
					 	<br>
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
							  <div class="my-no-br-right" >
							  		<form:textarea  class="form-control textarea-size" path="tbianma"  />
							  </div>
						</div> 	
				        <p>&nbsp;</p>
				        <p class="thick">轮廓编码</p>
				        <table width="85%" border="0">
				          <tr>
				            <td width="20%">收口形轮廓编码</td>
				            <td width="20%">外扩型轮廓编码</td>
				            <td width="20%" class="juzhong_for_new">&nbsp;</td>
				            <td width="20%">&nbsp;</td>
				            <td>&nbsp;</td>
				          </tr>
				        </table>
				        <p class="blue">+添加新类型</p>
				        <p>&nbsp;</p>
				        <p class="thick">部件编码</p>
				        <table width="85%" border="0">
				          <tr>
				            <td width="20%" height="45">杯柄部件编码</td>
				            <td width="20%">杯肚部件编码</td>
				            <td width="20%">&nbsp;</td>
				            <td width="20%">&nbsp;</td>
				            <td width="20%">&nbsp;</td>
				          </tr>
				        </table>
				        <p><span class="blue">+添加新类型</span></p>
				        <p>&nbsp;</p>
				        <p class="thick">色彩编码</p>
				        <table width="85%" border="0">
				          <tr>
				            <td width="20%">暖色系编码</td>
				            <td width="20%">冷色系编码</td>
				            <td width="20%">&nbsp;</td>
				            <td width="20%">&nbsp;</td>
				            <td width="20%">&nbsp;</td>
				          </tr>
				        </table>
				        <p><span class="blue">+添加新类型</span></p>
				        <p>&nbsp;</p>
				        <p class="thick">材质编码</p>
				        <p><span class="blue">+添加新类型</span></p>
				        
				        <br><br>
						<div class=" text-center">
							<button type="submit" class="btn btn-primary savebtn"  id="submit2">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
				</form:form>
				</div>
				<div class="tab-pane fade" id="myTab3">
					<form:form id="editForm3"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post"> 
					        <form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
					        <br>
							<div class="input-title-position">
								  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
								  <div class="my-no-br-right" >
								  		<form:textarea  class="form-control textarea-size" path="tzaoxing"  />
								  </div>
							</div> 	
				       	 <br><br>
						 <div class=" text-center">
							<button type="submit" class="btn btn-primary savebtn"  id="submit3">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						 </div>
						 <br>
					</form:form>

				</div>
				<div class="tab-pane fade" id="myTab4">
				     	<form:form id="editForm4"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
					commandName="item" methodParam="post"> 
					      <br>
				          <form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
						<div class="input-title-position">
							  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
							  <div class="my-no-br-right" >
							  		<form:textarea  class="form-control textarea-size" path="tcanshu"  />
							  </div>
						</div> 	
				        <br>
				        <div>
							<label for="questionarylink"><span class="thick">用户选择调查说明链接</span></label>
							<div class="my-no-br-right"  style="padding-right: 690px;">
<%-- 								<form:input path="choosesurvey"   class="form-control " size="10"/> --%>
							</div>
						</div> 
				        <div>
							<label for="suanfa_link"><span class="thick">算法说明链接</span></label>
							<div class="my-no-br-right" style="padding-right: 690px;">
<%-- 								<form:input path="algorithm"   class="form-control " size="10"/> --%>
							</div>
						</div> 
						<br><br>
						<div class=" text-center">
							<button type="submit" class="btn btn-primary savebtn"  id="submit4">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						</div>
						<br>
				</form:form>
				</div>
				<div class="tab-pane fade" id="myTab5">
					<form:form id="editForm5"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
 					commandName="item" methodParam="post"> 
					        <form:hidden path="tid" />
						<form:hidden path="tid" />
						<form:hidden path="tname" />
						<form:hidden path="talgorithm" />
						<form:hidden path="twordtype" />
						<form:hidden path="tyuyi" />
						<form:hidden path="tanli" />
						<form:hidden path="tbianma" />
						<form:hidden path="tzaoxing" />
						<form:hidden path="tcanshu" />
						<form:hidden path="tshengcheng" />
						<form:hidden path="ttiaozheng" />
						<form:hidden path="ticon" />
					        <br>
							<div class="input-title-position">
								  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
								  <div class="my-no-br-right" >
								  		<form:textarea  class="form-control textarea-size" path="tshengcheng"  />
								  </div>
							</div> 	
				       	 <br><br>
						 <div class=" text-center">
							<button type="submit" class="btn btn-primary savebtn"  id="submit5">保存</button>
							<button type="reset" class="btn btn-primary cancelbtn">取消</button>
						 </div>
						 <br>
					</form:form>
				</div>
				<div class="tab-pane fade" id="myTab6">
						<form:form id="editForm6"  class="editForm"  method="post"  action="${contextPath}/manager/productMaintenance/load/save"
 					commandName="item" methodParam="post"> 
							      	<form:hidden path="tid" />
									<form:hidden path="tid" />
									<form:hidden path="tname" />
									<form:hidden path="talgorithm" />
									<form:hidden path="twordtype" />
									<form:hidden path="tyuyi" />
									<form:hidden path="tanli" />
									<form:hidden path="tbianma" />
									<form:hidden path="tzaoxing" />
									<form:hidden path="tcanshu" />
									<form:hidden path="tshengcheng" />
									<form:hidden path="ttiaozheng" />
									<form:hidden path="ticon" />
							        <br>
									<div class="input-title-position">
										  <label for="product_name " ><strong   class="label-name">介绍</strong></label>
										  <div class="my-no-br-right" >
										  		<form:textarea  class="form-control textarea-size" path="ttiaozheng"  />
										  </div>
									</div> 	
						       	 <br><br>
								 <div class=" text-center">
									<button type="submit" class="btn btn-primary savebtn"  id="submit6">保存</button>
									<button type="reset" class="btn btn-primary cancelbtn">取消</button>
								 </div>
								 <br>
					</form:form>
				</div>
			</div>
		</div>

	</div>

</div>
<script type="text/javascript" src="${contextPath}/js/manager/productMaintenance/edit.js"></script>
</body>
</html>
    