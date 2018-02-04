<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Evaluate"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>请选择要查看的课程</h2>
	</center>
	<center>
	<table>
		<c:forEach items="${Clist}" var="Clist" varStatus="status">
	    	<a href = "queryPingJiao.html?subjectName=${Clist.subjectName }">${Clist.subjectName }</a>
	    	<br>
	    </label>
	 </c:forEach>
	 </center>
</body>
</html>