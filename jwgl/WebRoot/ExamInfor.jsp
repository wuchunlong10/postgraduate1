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
	.input1{
		width:100%;
		height:40px;
	}
 </style>
</head>
<body>
  <center>
    <table >
     <tr>
       <th>考场地点</th>
       <th>考场人数</th>
       <th>监考教师</th>
       <th>考试科目</th>
     <c:forEach items="${ExamInfor }" var="examinfor" varStatus="status">
       <tr>
       <td>
         <form action="bianpai.jsp" method="post">
           <input type="hidden" name="ExamPlace" value="${examinfor.examPlace }"/>
           <input class="input1" type="submit" value=" ${examinfor.examPlace }"/>
         </form>
       </td>
       <td>${examinfor.examNumber }</td>
       <td>${examinfor.examTeacherList }</td>
       <td>${examinfor.examSubjectName }</td>
       </tr>
     </c:forEach> 
     </table>
  
  </center>

</body>
</html>