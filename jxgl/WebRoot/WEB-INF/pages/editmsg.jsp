<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>修改留言</title>
</head>
<body>

<form method = "POST" action = "editmsgdo.html"> 
<table>
    <tr>
        <td>主题：  <input type = "text" name = "title" value ="${msg.title}"></td>
    </tr>
    <tr>
        <td>修改内容：  <input type = "text" name = "context" value ="${msg.context}"></td>
    </tr>
    <tr>
    <%-- <input type = "text" name = "lefttime" value ="${msg.lefttime}"> --%>
        <td>日期：  <span>${msg.lefttime }</span></td>    
    </tr>
    <%-- <input type = "text" name = "wholeft" value ="${msg.wholeft}"readonly="readonly"> --%>
    <tr>
        <td>留言人：<span>${msg.wholeft}</span></td>
    </tr>
    <%-- <input type ="text" name = "messageid" value = "${msg.messageid }" readonly="readonly"> --%>
    <tr>
        <td>留言id：<input type ="text" name = "messageid" value = "${msg.messageid }" readonly="readonly"></td>        
    </tr>
    <tr>
    <td>
    <td><input type = "submit" value = "提交"></td>    
    <td><input type = "reset" value = "重置"></td>
    </tr>

</table>
</form>
</body>
</html>

