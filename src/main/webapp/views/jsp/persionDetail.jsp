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
<base href="<%=basePath%>" >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="static/css/bootstrap.css" rel="stylesheet" type="text/css" /> 
<link href="static/css/lightbox.css" rel="stylesheet" type="text/css" /> 
<link href="static/css/style.css" rel="stylesheet" type="text/css" /> 

<script type="text/javascript" src="static/js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="static/js/bootstrap.js"></script>
<script type="text/javascript" src="static/js/lightbox-plus-jquery.min.js"></script>
<script type="text/javascript" src="static/js/responsiveslides.min.js"></script>
<script type="text/javascript" src="static/js/common.js"></script>
</head>
<body>
	<div class="container">
		<div class="insertArea">
			<form action="persion/update" method="post">
			  <div class="form-group">
			    <label for="exampleInputEmail1">ID</label>
			    <input name="id" type="text" class="form-control" readonly="readonly" id="exampleInputEmail1" value="${persion.id}">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail1">姓名</label>
			    <input name="name" type="text" class="form-control" id="exampleInputEmail1" placeholder="姓名" value="${persion.name}">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">电话</label>
			    <input name="phone" type="text" class="form-control" id="exampleInputEmail1" placeholder="电话" value="${persion.phone}">
			  </div>
			  <button id="addBtn" type="submit" class="btn btn-default">更新</button>
			</form>
		</div>
</body>
</html>