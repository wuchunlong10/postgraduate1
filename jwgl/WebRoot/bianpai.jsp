<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <style type="text/css">
   a{
    text-decoration: none;
   }
 </style>
<%request.setCharacterEncoding("UTF-8");
 
String name=request.getParameter("ExamPlace");%>
 <script type="text/javascript">
   function check_legal(form){
     if(form.StudentId.value==""){
      alert("学生学号不能为空");
      return false;
     }
     if(form.StudentName.value==""){
      alert("学生姓名不能为空");
      return false;
     }
     if(form.ExamSeats.value==""){
      alert("座位号不能为空");
      return false;
     }
   }
 </script>
  <style type="text/css">
    table{
      margin:50px auto;
      border-collapse: collapse;
       height:40px;
    }
    th,td{
     border:1px solid black ;
     height:25px;
     text-align: center;
    }
    .input1{
      width:80px;
      font-size: 18px;
      text-align: center;
      height: 30px;
    }
    input{
      height:25px;
    }
  </style>
</head>
<body>
  <center>
  <form action="bianpai.html" method="post" onsubmit="return check_legal(this)">
  		<table>
  		<tr>
  			<td>学生学号</td>
  			<td>学生姓名</td>
  			<td>座位号</td>
  		</tr>
  		<tr>
  		<input type="hidden" name="ExamPlace" value="<%=name %>">
  		<td><input type="text" name="StudentId" ></td>
  		<td><input type="text" name="StudentName"></td>
  		<td><input type="text" name="ExamSeats"></td>
  		</tr>
  		</table>
  		<input type="submit" name="submit" value="提交" class="input1">
  </form>
  </center>
</body>
</html>