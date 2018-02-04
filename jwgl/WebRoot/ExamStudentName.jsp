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
   table{
     margin:90px auto;
     border-collapse: collapse;
   }
   td{
      border:1px solid black ;
      height: 40px;
      font-size: 18px;
      width:300px;
      text-align: center;
   }
  
 </style>

</head>
<body>
  <center>
   <table>
     <tr>
       <td><a href="SetExamText.jsp" class="a1">编排考场信息</a></td>
     </tr>
     <tr>
       <td><a href="getExamInfor.html">查看编排成功的考场信息</a></td>
     </tr>
     <tr>
       <td><a href="getExamStudentInfor.html">查看编排成功的考生信息</a></td>
     </tr>
   </table> 
  </center>
</body>
</html>