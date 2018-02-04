<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

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
	  <table cellpadding="1" cellspacing="1" border="1">
	  	<thead>您的个人信息为</thead>
		  	<tr>
			  	<th>学号</th>
			  	<th>姓名</th>
			  	<th>性别</th>
			  	<th>年龄</th>
			  	<th>找回密码口令</th>
		  	</tr>
		  	<tr>
		  		<td>${student.userid }</td>
		  		<td>${student.username }</td>
		  		<td>${student.sex }</td>
		  		<td>${student.age }</td>
		  		<td>${student.word }</td>
		  	</tr>
	  </table>
  <body>
    
  </body>
</html>
