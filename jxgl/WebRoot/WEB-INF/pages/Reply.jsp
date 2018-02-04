<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%--<%@page import="com.chat.dao.UserDao" %>
--%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>回复页面</title>
</head>
<body>

	<form method = "POST" action = "addreply.html">
	内容：<input type = "text" name = "context">
	<input type = "text" name = "messageid" value="${messageid}">
	<input type = "submit" value = "提交">
	<input type = "reset" value ="重置">
	</form>
</body>
</html>
