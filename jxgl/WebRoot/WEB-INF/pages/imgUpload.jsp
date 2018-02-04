<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>图片上传</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%--<script src="../js/img.js" type="text/javascript"></script>
<script src="..js/ext-all.js" type="text/javascript"></script>
  --%>
 </head>
  
  <body>
  <h2>只能上传单张10M以下的 PNG、JPG、GIF、JPEG 格式的图片</h2>
   <form method="post" action="<c:url value="uploadImg.html"></c:url>" enctype="multipart/form-data">
    		<!-- <input type="text" name="name" placeholder="请填写文件名"> -->
    		<input type="file" name="file">
    		<input type="submit" value="上传">
    </form>
    <c:if test="${!empty succ}">
		<font color="green"><c:out value="${succ }"></c:out></font>
	</c:if>
	 <c:if test="${!empty fault}">
		<font color="red"><c:out value="${fault }"></c:out></font>
	</c:if>
	<br>
	<img src="${imgPath}" >		    			
  </body>
</html>
