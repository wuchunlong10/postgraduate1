<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>请选择需要为${SubjectName }录入成绩的班级</h2>
	</center>
		<center>		
		<c:forEach items="${Classlist}" var="Classlist" varStatus="status">
		<a href="queryName.html?classInfo=${Classlist.classInfo}&SubjectName=${SubjectName }">${Classlist.classInfo}</a>
			<br>
	 	</c:forEach>
	 	</center>
</body>
</html>