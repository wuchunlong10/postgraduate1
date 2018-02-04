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
      margin:50px auto;
      border-collapse: collapse;
    }
    th,td{
     border: 1px solid black;
     width:50px;
    
    }
    input{
      text-align: center;
      font-size: 18px;
      width:105px ;
    }
  </style>
</head>
<body >
   <center>
   <table >
      <tr>
         <th>课程编号</th>
         <th>课程名称</th>
         <th>上课时间</th>
         <th>上课地点</th>
         <th>教师姓名</th>
         <th>目前报选人数</th>
         <th>开课人数上限</th>
         <th>选课起始时间</th>
         <th>选课结束时间</th>
         <th>课时</th>
         <th>学院名称</th>
         <th></th>
      </tr>
      <c:forEach items="${CourseOpenInfor }" var="courseopeninfor" varStatus="status">
           
         <form action="InsertOpenCourse.html" method="post">
          <tr style="width:100%">
         	<td><input type="text" name="CourseId" value="${courseopeninfor.courseId}" readonly="readonly"></td>
         	<td><input type="text" name="SubjectName" value="${courseopeninfor.subjectName}" readonly="readonly"></td>
            <td><input type="text" name="Time" value="${courseopeninfor.time}" readonly="readonly"></td>
            <td><input type="text" name="Place" value="${courseopeninfor.place}" readonly="readonly"></td>
            <td><input type="text" name="TeacherName" value="${courseopeninfor.teacherName}" readonly="readonly"></td>
            <td><input type="text" name="CurrentNumber" value="${courseopeninfor.currentNumber}" readonly="readonly"></td>
            <td><input type="text" name="TotleNumber" value="${courseopeninfor.totleNumber}" readonly="readonly"></td>
            <td><input type="text" name="StartTime" value="${courseopeninfor.startTime}" readonly="readonly"></td>
            <td><input type="text" name="EndTime" value="${courseopeninfor.endTime}" readonly="readonly"></td>
            <td><input type="text" name="CourseTime" value="${courseopeninfor.courseTime}" readonly="readonly"></td>
            <td><input type="text" name="Academy" value="${courseopeninfor.academy}" readonly="readonly"></td>
            <td><input type="submit" value="开放"/></td>
            
        </tr>
         </form>
         
      </c:forEach>
   </table>
        <a href="getSelectCourseInfor.html">查看学生可选课程</a>     <a href="InsertOpenCourseText.jsp">增加要开放的选课</a>  
   </center>
</body>
</html>