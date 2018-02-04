<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>留言板</title>
</head>
<body>
<form action="ShowMessage.html" method="post"></form>
留言成功！
<input  type="button" id="List" value="显示全部留言"  onclick="ShowMessage()"/>
<script type="text/javascript">
function ShowMessage() {
	 window.location.href="ShowMessage.html";
}

</script>
</body>
</html>