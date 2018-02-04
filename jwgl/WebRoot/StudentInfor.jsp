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
    #rd{
    	ouline:none;
    }
    th{
     width:100px;
     border: 1px solid  black;
     font-size: 18px;
     height:20px;
    }
    input{
      height:100%;
    }
  
  </style>
</head>
<body>
  <form action="StudentInforAlter.html" method="post">
     <table>
        <tr>
          <th>学号</th>
          <th><input id="rd" type="text" name="StudentId"  value="${StudentInfor.studentId}" readonly="readonly" /></th>
        </tr>
        <tr>
		  <th>姓名</th>
		  <th><input id="rd" type="text" name="StudentName" value="${StudentInfor.studentName }" readonly="readonly"></th>
		</tr>
		 <tr>
		  <th>班级</th>
		  <th><input type="text" name="Class1" value="${StudentInfor.class1 }"></th>
		</tr>
		<tr>
		  <th>密码</th>
		  <th><input type="text" name="PassWord" value="${StudentInfor.passWord }"></th>
		</tr>
		<tr>
		  <th>手机号</th>
		  <th><input type="text" name="Phone" value="${StudentInfor.phone }"></th>
		</tr>
	    <tr>
		  <th>邮箱</th>
		  <th><input type="text" name="Email" value="${StudentInfor.email }"></th>
		</tr>
		<tr>
		  <th>父亲</th>
		  <th><input type="text" name="FatherName" value="${StudentInfor.fatherName }"></th>
		</tr>
		<tr>
		  <th>父亲联系方式</th>
		  <th><input type="text" name="FatherPhone" value="${StudentInfor.fatherPhone }"></th>
	    </tr>
		<tr>
		  <th>身份证</th>
		  <th><input id="rd" type="text" name="IdCard" value="${StudentInfor.idCard }" readonly="readonly" ></th>
		</tr>
		<tr>
		  <th>银行卡号</th>
		  <th><input type="text" name="BankNumber" value="${StudentInfor.bankNumber }" ></th>
		</tr>
		<tr>
		  <th>学籍状态</th>
		  <th><input id="rd" type="text" name="Status" value="${StudentInfor.status }" readonly="readonly" ></th>
		</tr>
		<tr>
		  <th>学习形式</th>
		  <th><input type="text" name="Shape" value="${StudentInfor.shape }" ></th>
		</tr>
		<tr>
		  <th>学历类别</th>
		  <th><input type="text" name="Education" value="${StudentInfor.education }" ></th>
		</tr><tr>
		  <th>学制</th>
		  <th><input id="rd" type="text" name="StudySystem" value="${StudentInfor.studySystem }" readonly="readonly" ></th>
		</tr>
		<tr>
		  <th colspan="2" align="center"><input type="submit" value="提交"></th>
		</tr>
     
     </table>
  
  </form>

</body>
</html>