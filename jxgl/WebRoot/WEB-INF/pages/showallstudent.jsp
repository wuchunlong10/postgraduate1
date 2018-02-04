<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="query.html" method="post">
		学号：<input id="userid" name="userid"></input>姓名：<input id="username"
			name="username"></input></br> <input type="submit" value="查询">
			<a href="<c:url value="addStudent.html"></c:url>"><input type="button" value="添加学生"></a>
	</form>
	<table style="text-align:center" border="1" cellpadding="2" cellspacing="1" >
		<tr class="title">
			<td>学号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>民族</td>
			<td>出生日期</td>
			<td>年龄</td>
			<td>学院</td>
			<td>专业</td>
			<td>班级</td>
			<td>入学时间</td>
		</tr>
		<c:forEach items="${list}" var="student">
			<tr class="title">
				<td>${student.userid}</td>
				<td>${student.username}</td>
				<td>${student.sex}</td>
				<td>${student.nation}</td>
				<td>${student.birth}</td>
				<td>${student.age}</td>
				<td>${student.collage}</td>
				<td>${student.major}</td>
				<td>${student.classname}</td>
				<td>${student.intake}</td>
				<td><a onclick="return chk_dl()"
					href="<c:url value="delete.html"></c:url>?userid=${student.userid}"><input
						type="button" value="删除">
				</a></td>
				<td><a
					href="<c:url value="toUapdate.html"></c:url>?userid=${student.userid}"><input
						type="button" value="修改">
				</a></td>
			</tr>

		</c:forEach>
	</table>
</body>
</html>