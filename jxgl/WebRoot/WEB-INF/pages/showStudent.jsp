<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>学生列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<p style="red">${requestScope.tip }</p>
<script type="text/javascript">
function chk_dl(){
	if (confirm('确定要删除这条数据吗？')) {
return true;
	}else {
	return false;
 }
	}

</script>
</head>

<body>
	<form action="query.html" method="post">
		学号：<input id="userid" name="userid"></input>姓名：<input id="username"
			name="username"></input></br> <input type="submit" value="查询"><a
			href="<c:url value="addStudent.html"></c:url>"><input
			type="button" value="添加学生">
		</a>
	</form>
	<table border="1" cellpadding="2" cellspacing="1" style="text-align:center">
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
