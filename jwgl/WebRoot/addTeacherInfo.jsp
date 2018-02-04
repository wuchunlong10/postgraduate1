<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import = "Control.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href=" style/AddTeacherInfo.css" rel="stylesheet" type="text/css" media = "all" />
<title>Insert title here</title>
</head>
<body>
	<h2>添加教职工信息</h2>
	<center>
	<form action = "addTeacherInfo.html" method = "post">
	  <table border = "1" align = "center">
		<tr>
			<td>您的教职工号为：</td>
			<td>201703056</td>
		</tr>
		<tr>
			<input name = "idNumber" type = "hidden" value = "201703056">
		</tr>
		<tr>
			<td>请输入姓名:</td>
			<td><input name = "name" type = "text" VALUE = '张鹏' readonly = " readonly"></td>
		</tr>
		<tr>
			<td>性别:</td>
			<td><input name = "sex" type = "radio" value = "男" >男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input name = "sex" type = "radio" value = "女" >女</td>
		</tr>
		<tr>
			<td>民族:</td>
			<td><input name = "nation" type = "text" ></td>
		</tr>
		<tr>
			<td>身份证号:</td>
			<td><input name = "idCard" type = "text" ></td>
		</tr>
		<tr>
			<td>籍贯:</td>
			<td><input name = "nativePlace" type = "text" ></td>
		</tr>
		<tr>
			<td>政治面貌:</td>
			<td><input name = "politicalStatus" type = "text" ></td>
		</tr>
		<tr>
			<td>联系电话:</td>
			<td><input name = "phone" type = "text" ></td>
		</tr>
		<tr>
			<td>教授课程:</td>
			<td><input name = "SubjectName" type = "text" value = "分布式数据库" readonly = "readonly"></td>
		</tr>
		<tr>
			<td>家庭住址:</td>
			<td><input name = "address" type = "text" ></td>
		</tr>
		<tr>
			<td>学历信息:</td>
			<td><input name = "education" type = "text" ></td>
		</tr>
		<tr>
			<td>获奖情况:</td>
			<td><input name = "prize" type = "text" ></td>
		</tr>
	  </table>
	  <br>
	  <tr>
			<input name = "submit" type = "submit" value = "提交" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input name = "reset" type = "reset" value = "重置" >
	</tr>
	</form>
	</center>
</body>
</html>