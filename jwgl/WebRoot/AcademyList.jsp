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
      td {
       	   width:150px;
	       border: 1px solid black;
	       height:45px;
	       text-align:center;
      }
    
      .input1{
      width:100%;
     height:45px;
      }
  </style>
</head>
<body>
  <div style="height:50px;"></div>
   <center>
    <table>
   <c:forEach items="${AcademyList }" var="academylist" varStatus="status">
	  <tr>
	    <td>
	    <form action="getPingGuInfor.html" method="post">
	    	<input type="hidden" name="Academy" value="${academylist.academy }">
	    	<input class="input1" type="submit" value="${academylist.academy }">
	    </form>
        </td>
     </tr>
   </c:forEach>
    </table>
    </center>
</body>
</html>