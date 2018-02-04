<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <style type="text/css">
    table{
     margin:70px auto;
     border-collapse: collapse;
    }
    th,td{
     border:1px solid black ;
      height: 40px;
      font-size: 18px;
      width:200px;
      text-align: center;
      font-size: 20px;
    }
  </style>
</head>
<body>
<center>
  <table>
   <tr>
    <th>考场地点</th>
    <th>考生学号</th>
    <th>考生姓名</th>
    <th>座位号</th>
    </tr>
    <c:forEach items="${ExamStudentInfor }" var="examstudentinfor" varStatus="status">
      <tr>
       <td>${examstudentinfor.examPlace }</td>
       <td>${examstudentinfor.studentId }</td>
       <td>${examstudentinfor.studentName}</td>
       <td>${examstudentinfor.examSeats }</td>
      
      </tr>
     
    </c:forEach>
  </table>
</center>
</body>
</html>