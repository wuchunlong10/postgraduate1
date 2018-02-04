<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
   <style type="text/css">
     table{
       margin:60px auto;
       border-collapse: collapse;
     }
     th,td{
       border:1px solid black ;
       height:40px;
       width: 250px;
       text-align: center;
       font-size: 20px;
     }
   
   </style>
</head>
<body>
  <center>
  <h2>教师和科目为：</h2>
   <table>
         <tr>
           <th>科目</th>
           <th>教师</th>
         </tr>
  <c:forEach items="${TeacherNameSubjectName}" var="tnsn" varStatus="status">
         <tr>
           <td>${tnsn.subjectName}</td>   
           <td>${tnsn.name}</td>
         </tr>
  </c:forEach>
  </table> 
    <br/>
  <a href="getCourseTableInfor.html" >查看排课成功的信息</a>
  <a href="getCourseTableText.jsp">进行排课</a>
  </center>
</body>
</html>