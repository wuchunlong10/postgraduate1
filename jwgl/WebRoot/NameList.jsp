
<%@page import="java.util.ArrayList"%>
<%@page import="Entity.ClassInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function submit() {
		alert("test");
		   var items = document.getElementsByTagName("input");
		 alert(items.length);
		   for(var i = 0;i < items.length;i ++) {
			   alert(items[i].value);
		   }
		 	alert("end");
	}
	
</script>
	<style type="text/css">

	</style>
</head>
<body>
<br>
   <center>
	<h3>添加学生成绩</h3>
   </center>
<center>

<form action = "test.html">
	<table border="1" cellpadding="0" cellspacing="0">	
					<tr>
							<th>学号</th><th>姓名</th><th>科目</th><th>班级号</th><th>分数</th>
					</tr>	
					<%
						List<ClassInfo> studentList = (List<ClassInfo>)request.getSession().getAttribute("Namelist");
						List<ClassInfo> ScoreList = new ArrayList<ClassInfo>();
						for(int i = 0;i < studentList.size();i ++) {
							final ClassInfo classInfo = new ClassInfo();
							%>
							<tr>
							<td><%=studentList.get(i).getStudentId()%></td>
							<td><%=studentList.get(i).getName()%></td>
							<td><%=studentList.get(i).getSubjectName()%></td>
							<td>${Class }</td>
							<td><input name = "Score" id="score" type = "text"></td>
							<br>
							</tr>
							<%
							classInfo.setStudentId(studentList.get(i).getStudentId());
							classInfo.setSubjectName(studentList.get(i).getSubjectName());
							ScoreList.add(classInfo);
						}
						session.setAttribute("ScoreList",ScoreList);
					%>
							
	 			</table>
				<input name ="submit" type = "submit"  onclick = "submit()" >
</form>
</center>
</body>
</html>