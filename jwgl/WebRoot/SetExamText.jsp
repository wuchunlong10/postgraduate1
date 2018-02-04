<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <script type="text/javascript">
  
    function check(form){
        if(form.ExamPlace.value==""){
			alert("考场地点不能 为空！");
			return false;
		}
		 if(form.ExamNumber.value==""){
			alert("考场人数不能 为空！");
			return false;
		}
		 if(form.ExamTeacherList.value==""){
			alert("监考教师不能 为空！");
			return false;
		}
		 if(form.ExamSubjectName.value==""){
			alert("考试科目不能 为空！");
			return false;
		}
    }
  </script>
    <style type="text/css">
       form{
         margin: 70px auto;
       }
       input{
         width: 150px;
       }
    </style>
</head>
<body>
<center>
  <div style="background-color: rgb(239,239,239); width:400px ;">
  
  <form action="SetExam.html" method="post"  onsubmit="return check(this)"><br/>
            考场地点：<input type="text"  name="ExamPlace"/><br/>
            考场人数：<input type="text"  name="ExamNumber"/><br/>
            监考教师：<input type="text"  name="ExamTeacherList"/><br/>
             考试科目：<input type="text"  name="ExamSubjectName"/><br/>
    <input type="submit"  value="编排"/>
  </form>
  </div>
  </center>

</body>
</html>