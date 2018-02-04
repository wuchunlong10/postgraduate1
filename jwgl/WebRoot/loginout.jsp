<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
</head>
<body>
<%
	session.invalidate();
	response.setHeader("Refresh","0;URL=role_login.jsp");
%>
</body>
</html>
