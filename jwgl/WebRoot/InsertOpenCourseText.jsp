<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <script type="text/javascript">
    function check_legal(form){
        if(form.CourseId.value==""){
			alert("课程编号不能 为空！");
			return false;
		}
		if(form.CourseName.value==""){
			alert("课程名称不能 为空！");
			return false;
		}
		if(form.Time.value==""){
			alert("上课时间不能 为空！");
			return false;
		}
		if(form.Place.value==""){
			alert("上课地点不能 为空！");
			return false;
		}
		if(form.TeacherName.value==""){
			alert("教师姓名不能 为空！");
			return false;
		}
		if(form.CurrentNumber.value==""){
			alert("目前报选人数不能 为空！");
			return false;
		}
		if(form.TotleNumber.value==""){
			alert("开课人数上限不能 为空！");
			return false;
		}
			if(form.StartTime.value==""){
			alert("选课起始时间不能 为空！");
			return false;
		}
			if(form.EndTime.value==""){
			alert("选课结束时间不能 为空！");
			return false;
		}
		if(form.CourseTime.value==""){
			alert("课时不能 为空！");
			return false;
		}
		if(form.Academy.value==""){
			alert("学院名称不能 为空！");
			return false;
		}
    }
  </script>
  <style type="text/css">
    table{
      border-collapse: collapse;
    }
    th,td{
      border:1px solid black ;
      height: 30px;
      font-size: 18px;
      width:170px;
      text-align: center;
    
    }
    input{
     height:30px ;
     outline:none;
    }
  </style>
  
</head>
<body>
  <center>
	<form action="InsertCourse.html" method="post" onsubmit="return check_legal(this)">
	   <table> 
	     <tr>
	       <th>课程编号：</th>
	       <td><input type="text" name="CourseId"/></td>
	     </tr>  
	     <tr>
	       <th>课程名称：</th>
	       <td><input type="text" name="SubjectName"/></td>
	     </tr>  
	     <tr>
	       <th>上课时间：</th>
	       <td><input type="text" name="Time"/></td>
	     </tr>  
	     <tr>
	       <th>上课地点：</th>
	       <td><input type="text" name="Place"/></td>
	     </tr>  
	     <tr>
	       <th>教师姓名：</th>
	       <td><input type="text" name="TeacherName"/></td>
	     </tr>  
	     <tr>
	       <th>目前报选人数</th>
	       <td><input type="text" name="CurrentNumber"/></td>
	     </tr>  
	     <tr>
	       <th>开课人数上限</th>
	       <td><input type="text" name="TotleNumber"/></td>
	     </tr>  
	     <tr>
	       <th>选课起始时间：</th>
	       <td><input type="text" name="StartTime"/></td>
	     </tr>  
	     <tr>
	       <th>选课结束时间</th>
	       <td><input type="text" name="EndTime"/></td>
	     </tr>  
	     <tr>
	       <th>课时：</th>
	       <td><input type="text" name="CourseTime"/></td>
	     </tr>  
	     <tr>
	       <th>学院名称</th>
	       <td><input type="text" name="Academy"/></td>
	     </tr>  
	     <tr>
	       <td colspan="2" align="center"><input type="submit" value="增加要开放的选课"/></td>
	     </tr>  
	  </table> 
  </form>
 </center>
</body>
</html>