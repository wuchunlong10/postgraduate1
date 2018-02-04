<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addpage</title>
<style type="text/css">

 </style>

</head>
<body>
	<form action="addTeacher.html" method="post">
		<h1>增加教师信息</h1>
		：
		<table width="100%" border=1 >
		<tr>
				<td>教师编号</td>
				<td><input type="text" name="tid" /></td>
			</tr>
			<tr>
				<td>教师姓名</td>
				<td><input type="text" name="tname" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="tpassword" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="tel" /></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="mail" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="radio" checked name="sex" value="男">男
			    <input type="radio" name="sex" value="女">女</td>
			</tr>
			<tr>
				<td>家庭住址</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>所在部门</td>
				<td><input type="text" name="dpn" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>