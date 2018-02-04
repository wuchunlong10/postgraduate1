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
      margin:50px auto;
      border-collapse: collapse;
    }
    th,td{
      border:1px solid black ;
      height: 40px;
      font-size: 18px;
      width:110px;
      text-align: center;
    }
  </style>
</head>
<body>
   <center>
     <h2>学生可选课程有：</h2>
     <table>
         <tr>
           <th>课程名称</th>
           <th>上课地点</th>
           <th>教师姓名</th>
           <th>目前报选人数</th>
           <th>报选人数上限</th>
         </tr>
        <c:forEach  items="${SelectCourseInfor}" var="selectcourseinfor" varStatus="status">
           <tr>
              <td>${selectcourseinfor.subjectName}</td>
              <td>${selectcourseinfor.place}</td>
              <td>${selectcourseinfor.teacherName}</td>
              <td>${selectcourseinfor.currentNumber}</td>
              <td>${selectcourseinfor.totleNumber}</td>
           </tr>
        </c:forEach>
         
     </table>
   </center>
</body>
</html>