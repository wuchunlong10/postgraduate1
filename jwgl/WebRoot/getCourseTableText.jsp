<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function check_legal(form){
	   if(form.Term.value==""){
			alert("学年学期不能 为空！");
			return false;
		}
		 if(form.idNumber.value==""){
			alert("教职工号不能 为空！");
			return false;
		}
		if(form.SubjectName.value==""){
			alert("科目不能 为空！");
			return false;
		}
		if(form.CourseNumber.value==""){
			alert("课时不能 为空！");
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
		
	}
</script>
<style type="text/css">
    table{
      margin:50px auto;
      border-collapse: collapse;
    }
    th,td{
         border: 1px solid black;
         width:150px;
         height:40px;
         font-size: 18px;
         text-align: center;
    }
    input{
        height:100%;
    }
    .input1{
       width: 100px;
       font-size: 25px;
    }
  </style>

</head>
<body>
<center>
  <form action="getCourseTable.html" method="post" onsubmit="return check_legal(this)">
    <table> 
      <tr>
         <th>学年学期：</th>
         <td><input type="text" name="Term" /></td>
      </tr>  
       <tr>
         <th>教职工号:</th>
         <td><input type="text" name="idNumber"/></td>
      </tr>      
       <tr>
         <th>科目:</th>
         <td><input type="text" name="SubjectName"/></td>
      </tr>      
       <tr>
         <th>课时:</th>
         <td><input type="text" name="CourseNumber"/></td>
      </tr>      
       <tr>
         <th>上课时间:</th>
         <td><input type="text" name="Time"/></td>
      </tr>      
       <tr>
         <th>上课地点:</th>
         <td><input type="text" name="Place"/></td>
      </tr>      
       <tr>
         <th>教师姓名:</th>
         <td><input type="text" name="TeacherName"/></td>
      </tr>      
      <tr>
         <td colspan="2" align="center"><input type="submit"  value="排课" class="input1"/></td>
      </tr>
    </table> 
  </form>
  </center>

</body>
</html>