<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
</head>

<frameset rows="11.5%,*" cols="*" frameborder="no" border="0" framespacing="0" >

    <frame src="top.jsp" name="topFrame" noresize="noresize" id="topFrame" title="topFrame" />
    
    <frameset name="main_frm" id="main_frm" cols="177,*" frameborder="no" border="0" framespacing="0">
    
        <frame src="Left.jsp" name="leftFrame" id="leftFrame" noresize="noresize" title="leftFrame"  />
        
        <frameset name="mainFrame" id="mainFrame" cols="8,*" frameborder="no" border="0" framespacing="0">
        
              <frame src="border.jsp" name="oc" frameborder="no" scrolling="no" noresize="noresize" id="oc" title="mainFrame" />
              
              <frame src="main.jsp" name="mainFrame" frameborder="no" scrolling="yes" id="mainFrame" title="mainFrame" />
              
        </frameset>
        
     </frameset>
     
</frameset>

<noframes>
<body>
</body>
</noframes>              
</html>