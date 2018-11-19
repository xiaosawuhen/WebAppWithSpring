<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- CSS Start -->
<style type="text/css">
/* 盒模型 */
.nameArare{
	position:relative;
	background-color: green;
	width: 50%;
	margin: auto;
	padding: inherit;
	border: thin;
}
</style>
<link>
<!-- CSS End -->
</head>
<body>

	<div>
		Jsp->html: <br /> tag: prefix="c"
		uri="http://java.sun.com/jsp/jstl/core" <br />
		<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
		<%-- <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> --%>
		<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> --%>
		<div class="nameArare">
			name:<input value="${name}">
		</div>
		<div class="listArea">
			<c:forEach var="value" items="${vaueList}">
				Value: <c:out value="${value}"></c:out>
				<br />
			</c:forEach>
		</div>
	</div>

<script type="text/javascript">
	var listDiv = document.getElementsByClassName("listArea");
	listDiv.innerHTML="我的第一段 JavaScript";
</script>
</body>
</html>