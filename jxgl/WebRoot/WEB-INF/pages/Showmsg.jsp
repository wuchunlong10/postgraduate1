<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言板</title>
</head>
<body>

<div class="list_div" style="height: 87%">
        <table border="1" align="center" cellspacing="0" class="list_table"
            id="senfe" style='width: 80%'>
            <thead>
                <tr>
                    <th width="10%"height="30"><span style="font-weight: 10">留言序号</span></th>
                    <th width="10%"height="30"><span style="font-weight: 10">留言ID</span></th>
                    <th width="10%"height="30"><span style="font-weight:20">留言人</span></th>
                    <th width="10%"height="30"><span style="font-weight: 10">主题</span></th>  
                      
                    <th width="25%"height="30"><span style="font-weight: 10">留言内容</span></th>    
                     <th width="25%" height="30"><span style="font-weight: 10"> 回复内容</span></th> 
                    <th width="20%"height="30"><span style="font-weight: 20">操作</span></th>                            
                </tr>
            </thead>
            <tbody>                        
                 <c:forEach var="msg"  items="${msgList}" varStatus="status">
                    <tr>                        
                        <td align="center">${status.count }</td>
                        <td align="center">${msg.messageid}</td>    
                        <td align="center">${msg.wholeft}</td>    
                        <td align="center">${msg.title}</td>                
                        <td align="center">${msg.context}</td>    
                        <td align="center">${msg.reply}</td>                              
                        <td align="center">
                        <%--
	                        <a href="Reply?messageid=${msg.messageid}">回复</a>
	                        <a href="editmsg?messageid=${msg.messageid}">编辑</a>
	                        <a href="delmsg?messageid=${msg.messageid}">删除</a> 
                        --%>
                        <a href="<c:url value="Reply.html"></c:url>?messageid=${msg.messageid}">回复</a>
                        <a href="<c:url value="editmsg.html"></c:url>?messageid=${msg.messageid}">编辑</a>
                        <a href="<c:url value="delmsg.html"></c:url>?messageid=${msg.messageid}">删除</a> 
                        <a href="<c:url value="message.html"></c:url>">返回留言</a>                                               
                        </td>                        
                    </tr>                    
                </c:forEach>                
            </tbody>
           
        </table>
        </div>  
    
</body>
</html>

