<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mainpage3</title>
</head>
<body>
	<h1>您好,您可执行以下操作</h1>
	<table>
		<tr>
		<c:url value=""></c:url>
			<td><a href="<c:url value="showallteacher.html"></c:url>">显示全部教师信息</a></td>
		</tr>
		<tr>
			<td><a href="<c:url value="add.html"></c:url>">添加教师</a></td>
		</tr>
		
		<tr>
			<td><a href="<c:url value="Logout.html"></c:url>">退出</a></td>
		</tr>
	</table>
</body>
</html>