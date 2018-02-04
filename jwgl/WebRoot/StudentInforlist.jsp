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
	      margin:100px auto;
	      border-collapse: collapse;
      }
      td{
	       width:150px;
	       border: 1px solid black;
	       height:40px;
	       text-align:center;
	       font-size: 20px;
      }
      a{
       	text-decoration: none;
      }
  </style>
</head>
<body>
   <table>
   <c:forEach items="${StudentInforlist}" var="studentinfor" varStatus="status">
	  <tr>
	    <td>
        <a href="getStudentInfor.html?StudentId=${studentinfor.studentId}&studentName=${studentinfor.studentName}">${studentinfor.studentId} 
         ${studentinfor.studentName}</a>
        </td>
     </tr>
   </c:forEach>
    </table>


</body>
</html>