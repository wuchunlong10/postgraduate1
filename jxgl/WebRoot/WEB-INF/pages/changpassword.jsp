<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>changepassword1</title>
</head>
<body>
<div>${manager.name}</div>
<div>密码修改为：<form action="Changepassword.html"><input type="hidden" name="name" value="${manager.name}"><input type="text" name="password"><input type="submit" value="确定"></form></div>
</body>
</html>