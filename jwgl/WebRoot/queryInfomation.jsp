<%@page import="Entity.teacherDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>个人信息查询</h2>
	</center>
<br>
<center>
			<%
				teacherDao teacher = (teacherDao) session.getAttribute("teacher");
				String name = teacher.getName();
				String sex = teacher.getSex();
				String address = teacher.getAddress();
				String education = teacher.getEducation();
				String nation = teacher.getNation();
				String nativePlace = teacher.getNativePlace();
				String phone = teacher.getPhone();
				String politicalStatus = teacher.getPoliticalStatus();
				String prize = teacher.getPrize();
				String idCard = teacher.getIdCard();
				String idNumber = teacher.getIdNumber();
			%>
			<table border = "1" align ="center">
			<tr>
				<td>姓名：</td>
				<td><%=name%></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><%=sex%></td>
			</tr>
			<tr>
				<td>民族：</td>
				<td><%=nation%></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><%=address%></td>
			</tr>
			<tr>
				<td>教育情况：</td>
				<td><%=education%></td>
			</tr>
			<tr>
				<td>籍贯：</td>
				<td><%=nativePlace%></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><%=phone%></td>
			</tr>
			<tr>
				<td>政治面貌：</td>
				<td><%=politicalStatus%></td>
			</tr>
			<tr>
				<td>获奖情况：</td>
				<td><%=prize%></td>
			</tr>
			<tr>
				<td>身份证号：</td>
				<td><%=idCard%></td>
			</tr>
			<tr>
				<td>教职工号：</td>
				<td><%=idNumber%></td>
			</tr>
			</table>
			</center>
</body>
</html>