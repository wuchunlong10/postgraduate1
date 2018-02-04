<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>showallpage</title>
</head>
<body>
	<h1>全部教师信息</h1>
	<table width="100%" border=1>
	<form action="<c:url value="accurate.html"/>" method="post" align="center">
	<input type="text" name="Tname" placeholder="输入用户名"><input type="submit" value="精确查询">
</form>

		<tr>
			<td>教师编号</td>
			<td>教师姓名</td>
			<td>电话</td>
			<td>邮箱</td>
			<td>所在部门</td>
			<td>年龄</td>
			<td>性别</td>
			<td>家庭住址</td>
			
			<td align="center">操作</td>
		</tr>
		<c:forEach items="${forums}" var="teacher">
			<tr>
				<td>${teacher.tid }</td>
				<td>${teacher.tname }</td>
				<td>${teacher.tel}</td>
				<td>${teacher.mail}</td>
				<td>${teacher.dpn }</td>
				<td>${teacher.age }</td>
				<td>${teacher.sex }</td>
				<td>${teacher.address }</td>
				<td>
					<form action="<c:url value="deleteTeacherByID.html"/>"
						method="post">
						<input id="tid" type="hidden" name="tid" value="${teacher.tid }" />
						<input type="submit" id="delete" value="删除" />
					</form>
				</td>
				<td>
					<form action="<c:url value="modify1.html"/>" method="post">
						<input id="tid" type="hidden" name="tid" value="${teacher.tid}" />
						<input type="submit" id="modify" value="修改" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>