<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mainpage</title>
</head>
<body>
	<h1>您好，教师${teacher.tname }<br>您可执行以下操作</h1>
	<table>
		<tr>
			<td><a href="<c:url value="showallstudent.html"></c:url>">显示全部学生信息</a></td>
		</tr>
		<tr>
			<td><%--<a href="<c:url value="liuyanban.html"></c:url>">查看留言板</a>	--%>
			<form action="ShowMessage.html" method="post"></form>
				<input  type="button" id="List" value="显示全部留言"  onclick="ShowMessage()"/>
				<script type="text/javascript">
				function ShowMessage() {
					 window.location.href="ShowMessage.html";
				}

				</script>
			
			</td>
		</tr>
		<tr><td><a href="<c:url value="ZWTupLoadForTeacher.html"></c:url>">老师文件上传</a></td></tr>
		<tr><td><a href="<c:url value="ZWTshowListForTeacher.html"></c:url>">老师显示文件列表</a></td></tr>
		<tr>
			<td><a href="<c:url value="Change2.html"></c:url>">修改密码</a></td>
		</tr>
		<tr>
			<td><a href="<c:url value="Logout.html"></c:url>">退出</a></td>
		</tr>
	</table>
</body>
</html>