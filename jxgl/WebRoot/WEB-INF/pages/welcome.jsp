<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>您好${manager.name }<br>选择您要操作的对象</h1>
	<table>
		<tr>
		
			<td><a href="<c:url value="main.html"></c:url>">教职工</a></td>
		</tr>
		<tr>
			<td><a href="<c:url value="main3.html"></c:url>">学生</a></td>
		</tr>
		<tr>
			<td><a href="<c:url value="Change.html"></c:url>">修改密码</a></td>
		</tr>

</body>
</html>