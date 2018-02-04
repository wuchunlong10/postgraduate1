<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息修改</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <form action="update.html" method="post">
   <input name="userid" type="hidden"value="${student.userid}"></input></br>
姓&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp名：<input name="username" value="${student.username}"></input></br>
年&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp龄：<input name="age"value="${student.age}"></input></br>
性&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别：<input name="sex"value="${student.sex}"></input></br>
出生日期：<input name="birth"value="${student.birth}"></input></br>
民&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp族：<input name="nation"value="${student.nation}"></input></br>
学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp院：<input name="collage"value="${student.collage}"></input></br>
班&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp级：<input name="classname"value="${student.classname}"></input></br>
专&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp业：<input name="major"value="${student.major}"></input></br>
入学时间：<input name="intake"></input></br>
<input  type="submit" value="保存"></input>
<input type="reset" value="重置"></input>
<a href="<c:url value="index.html"></c:url>"><input type="button" value="返回"/></a>

 
 </form>
   
  </body>
</html>
