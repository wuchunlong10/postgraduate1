<%@page import="java.util.ArrayList"%>
<%@page import="Entity.Evaluate"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h2>评教结果</h2>
		<table id="sample2"   border="1" cellpadding="0" cellspacing="0">
			<tr >
						<th>序号</th><th>分数</th><th>授课方式</th><th>课堂氛围</th><th>交流情况</th><th>作业批改</th><th>评语</th>
			</tr>
			<%
							List<Evaluate> elist = (List<Evaluate>) request.getSession().getAttribute("elist");
							for(int i = 0;i < elist.size();i ++)
							{		
					  			%>
					  			<tr>
					  				<td><%=i + 1%></td>
									<td><%=elist.get(i).getMark()%></td>
									<td><%=elist.get(i).getOption1()%></td>
									<td><%=elist.get(i).getOption2()%></td>
									<td><%=elist.get(i).getOption3()%></td>
									<td><%=elist.get(i).getOption4()%></td>
									<td><%=	elist.get(i).getComment()%></td>
									<br/>
									</tr>
									<%
							}
							%>
	</table>
	</center>
</body>
</html>