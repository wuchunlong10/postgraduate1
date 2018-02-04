<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加学生</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<p>添加学生</p>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>


<body>
	<form action="<c:url value="save.html"></c:url>" method="post">
		姓&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp名：<input name="username"></input></br>
		年&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp龄：<input name="age"></input></br>
		性&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别：<input name="sex"></input></br>
		出生日期：<input name="birth"></input></br>
		民&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp族：<input name="nation"></input></br>
		学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp院：<input name="collage"></input></br>
		班&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp级：<input name="classname"></input></br>
		专&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp业：<input name="major"></input></br>
		入学时间：
		<input name="intake"></input></br> 
		<input type="submit" value="保存"></input>
	</form>
		<input type="reset" value="重置"></input> 
		<a href="<c:url value="show.html"></c:url>">
			<input type="button" value="返回" />
		</a>

</body>
</html>
