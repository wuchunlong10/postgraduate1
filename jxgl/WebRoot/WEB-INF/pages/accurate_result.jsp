<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<center>精确查询结果</center>
	<table style="font-family: 微软雅黑" border="1" align="center">
		<tr>
			<th>教师编号</th>
			<th>教师姓名</th>
			<th>电话</th>
			<th>邮箱</th>
			<th>所在部门</th>
			<th>年龄</th>
			<th>性别</th>
			<th>家庭住址</th>
			<th>操作</th>
		</tr>
		<tr>
			<td>${useraccurate.tid}</td>
			<td>${useraccurate.tname}</td>
			<td>${useraccurate.tel}</td>
			<td>${useraccurate.mail}</td>
			<td>${useraccurate.dpn}</td>
			<td>${useraccurate.age}</td>
			<td>${useraccurate.sex}</td>
			<td>${useraccurate.address}</td>
			
			<td>
			<form action="<c:url value="modify1.html"/>" method="post">
					<input type="hidden" name="Tid" value="${useraccurate.tid}"/>
					<input type="submit" value="修改" />
			</form>
			<form action="<c:url value="deleteTeacherByID.html"/>" method="post">
					<input type="hidden" name="Tid" value="${useraccurate.tid}"/>
					<input type="submit" value="删除" />
			</form>
			</td>
		</tr>
	</table>

</body>
</html>