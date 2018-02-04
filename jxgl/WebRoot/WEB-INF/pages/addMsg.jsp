<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>留言板</title>
</head>
<body>
	<form method="POST" action="addMsg.html">
	
		<div>留言人：<input type="text" name="wholeft"> </div>
		<div>留言主题：<input type="text" name="title" /></div>
		
		 留言内容：<textarea name="context" rows="6" cols="30" wrap="hard"></textarea>
			<input type="submit" value="留言" /> 
			<input type="reset" value="重置" />
	</form>
</body>
</html>

