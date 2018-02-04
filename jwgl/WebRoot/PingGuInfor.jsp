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
       margin:100px auto;
       border-collapse: collapse;
       
    }
    td,th{
     width:200px;
     height:40px;
     border: 1px solid  black;
     text-align: center;
     font-size: 20px;
    }
  
  </style>
</head>
<body>
   <table>
        <tr>
         <!--  <th>学院平均得分</th> -->
          <th>教师姓名</th>
          <th>得分</th>
        </tr>     
	    <c:forEach items="${PingGuInfor}" var="pinggu" varStatus="status">
	    <tr>
	     <td>${pinggu.teacherName }</td>
	     <td>${pinggu.mark }</td>
	    </tr>
	    </c:forEach>
	
   </table>

</body>
</html>