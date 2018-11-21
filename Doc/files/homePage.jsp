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
</head>
<body>
	<div class="container">
		<div class="insertArea">
			<form action="persion/insert" method="post">
			  <div class="form-group">
			    <label for="exampleInputEmail1">姓名</label>
			    <input name="name" type="text" class="form-control" id="exampleInputEmail1" placeholder="姓名">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">电话</label>
			    <input name="phone" type="text" class="form-control" id="exampleInputEmail1" placeholder="电话">
			  </div>
			  <button id="addBtn" type="submit" class="btn btn-default">添加</button>
			</form>
		</div>
		<div class="showArea">
			<div>用户列表：</div>
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>姓名</th>
						<th>电话</th>
						<th>积分</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="persion" items="${persionList}">
						<tr>
							<td>${persion.id}</td>
							<td>${persion.name}</td>
							<td>${persion.phone}</td>
							<td>${persion.points}</td>
							<td>
							<button id="updateBtn" class="btn btn-default">更新</button>
							<button id="deleteBtn" class="btn btn-default">删除</button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>