<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>modifypage</title>
</head>
<body>
	<form action="<c:url value="modify2.html"/>" method="post">
		<h1>修改教师信息</h1>
		：
		<table width="100%" border=1>
			<tr>
				<td>教师编号</td>
				<td><input type="text" name="tid" value="${teachermodify.tid}" /></td>
			</tr>
			<tr>
				<td>教师姓名</td>
				<td><input type="text" name="tname"
					value="${teachermodify.tname}" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="tel" value="${teachermodify.tel}" /></td>
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="mail"
					value="${teachermodify.mail}" /></td>
			</tr>
			<tr>
				<td>所在部门</td>
				<td><input type="text" name="dpn" value="${teachermodify.dpn}" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" name="age" value="${teachermodify.age}" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="radio" checked name="sex" value="男"
					value="${teachermodify.sex}" />男 <input type="radio" name="sex"
					value="女" value="${teachermodify.sex}" />女</td>
			</tr>
			<tr>
				<td>家庭住址</td>
				<td><input type="text" name="address"
					value="${teachermodify.address}" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>
	</form>

</body>
</html>