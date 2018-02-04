<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>title</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    欢迎您：<font>${student.username }</font>
<%--     欢迎您：<font style="display:inline-block;width:60px;height:25px;text-align:center;font-size:18px;color:white;background-color:blue;">${student.username }</font> --%>
    当前时间为：${date }
    性别：${student.sex }<br><br>
    <a href="imgUpload.html">上传图片</a>
    <a href="searchStudentInfo.html">查看信息</a>
    <a href="lookAlbum.html">查看相册</a>
    <a href="message.html">留言</a>
    <a href="<c:url value="ZWTshowListForStudent.html"></c:url>">学生显示文件列表</a>
  </body>
</html>
