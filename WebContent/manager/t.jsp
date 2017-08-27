<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ include file="../../../common.jsp"%> --%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- <title>语义库</title> -->
<!-- <style type="text/css"> -->
<!-- </style> -->
<%-- <script type="text/javascript" src="${contextPath}/js/lib/jquery-3.2.1.min.js"></script> --%>
<%-- <script type="text/javascript" src="${contextPath}/js/manager/yuyi/basicSemantic/listForEdit.js"></script> --%>


<script type="text/javascript">
$(document).ready(function(){
  $("#hide").click(function(){
    $("#hide1").hide();
  });
});
</script>
<!-- </head> -->

<!-- <body> -->
<p id="hide1">如果你点击“隐藏” 按钮，我将会消失。</p>
									<button id="hide">隐藏</button>
<!-- </body> -->
