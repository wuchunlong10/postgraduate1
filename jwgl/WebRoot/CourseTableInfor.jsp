<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <style type="text/css">
        table{
         margin: 50px auto;
         border-collapse: collapse;
        }
        th,td{
         border: 1px solid black;
         width:150px;
         height:40px;
         font-size: 18px;
         text-align: center;
        }
    
    </style>
</head>
<body>
  <center>
   <h2>已经排好的课程信息为：</h2>
  <table>
     <tr>
        <th>学年学期</th>
        <th>教职工号</th>
        <th>科目</th>
        <th>课时</th>
        <th>上课时间</th>
        <th>上课地点</th>
        <th>教师姓名</th>
     </tr>
   <c:forEach items="${CourseTableInfor }" var="coursetableinfor" varStatus="status">
     <tr>
       <td>${coursetableinfor.term}</td>
       <td>${coursetableinfor.idNumber}</td>
       <td>${coursetableinfor.subjectName}</td>
       <td>${coursetableinfor.courseNumber}</td>
       <td>${coursetableinfor.time}</td>
       <td>${coursetableinfor.place}</td>
       <td>${coursetableinfor.teacherName}</td>
     </tr>
   </c:forEach>
  </table>
  </center>
</body>
</html>