<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- <!DOCTYPE html> -->
<c:set value="${pageContext.request.contextPath}" var="contextPath" />

<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<!-- CSS -->
<link type="text/css" rel="stylesheet" href="${contextPath}/css/basic_style.css"/>
<link type="text/css" rel="stylesheet" href="${contextPath}/css/style.css"/>
<link type="text/css" rel="stylesheet" href="${contextPath}/lib/bootstrap3/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<%-- <link type="text/css" rel="stylesheet" href="${contextPath}/lib/bootstrap3/css/bootstrap-theme.min.css"> --%>

<link rel="stylesheet" href="${contextPath}/js/lib/SpryAssets/SpryTabbedPanels.css" />
<link rel="stylesheet" href="${contextPath}/js/lib/SpryAssets/SpryCollapsiblePanel.css" />

<%-- <script type="text/javascript" src="${contextPath}/js/lib/jquery.js"></script> --%>
<script type="text/javascript" src="${contextPath}/js/lib/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/lib/jquery.form.js"></script>
<script type="text/javascript" src="${contextPath}/lib/bootstrap3/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${contextPath}/js/lib/SpryAssets/SpryCollapsiblePanel.js"></script>
<script type="text/javascript" src="${contextPath}/js/lib/SpryAssets/SpryTabbedPanels.js"></script>
