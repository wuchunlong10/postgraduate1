<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<script type="text/javascript">
			function check_legai(form){
				if(form.PassWord.value==""){
					alert("密码不能为空！");
					return false;
				}
				if(form.Phone.value==""){
					alert("电话不能为空！");
					return false;
				}
				if(form.PassWord.value==""){
					alert("密码不能为空！");
					return false;
				}
				if(form.Email.value==""){
					alert("密码不能为空！");
					return false;
				}
				if(form.FatherName.value==""){
					alert("家长名不能为空！");
					return false;
				}
				if(form.FatherPhone.value==""){
					alert("家长联系方式不能为空！");
					return false;
				}
				if(form.FatherName.value==""){
					alert("家长名不能为空！");
					return false;
				}
				if(form.IdCard.value==""){
					alert("身份证号不能为空！");
					return false;
				}
				if(form.BankNumber.value==""){
					alert("银行卡号不能为空！");
					return false;
				}
			}
		</script>
	</head>
	<body>
		<form action="<c:url value="personalmodify.html"/>" method="post" onsubmit="return check_legal(this)">
			<table border="1" align="center">
				<tr>
					<th>学号</th>
					<th><input type="text" name="StudentId" value="${personalinfor.studentId }" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>姓名</th>
					<th><input type="text" name="StudentName" value="${personalinfor.studentName }" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>班级</th>
					<th><input type="text" name="Class1" value="${personalinfor.class1 }" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>密码</th>
					<th><input type="text" name="PassWord" value="${personalinfor.passWord }"></th>
				</tr>
				<tr>
					<th>手机号</th>
					<th><input type="text" name="Phone" value="${personalinfor.phone }"></th>
				</tr>
				<tr>
					<th>邮箱</th>
					<th><input type="text" name="Email" value="${personalinfor.email }"></th>
				</tr>
				<tr>
					<th>父亲</th>
					<th><input type="text" name="FatherName" value="${personalinfor.fatherName }"></th>
				</tr>
				<tr>
					<th>父亲联系方式</th>
					<th><input type="text" name="FatherPhone" value="${personalinfor.fatherPhone }"></th>
				</tr>
				<tr>
					<th>身份证</th>
					<th><input type="text" name="IdCard" value="${personalinfor.idCard }" ></th>
				</tr>
				<tr>
					<th>银行卡号</th>
					<th><input type="text" name="BankNumber" value="${personalinfor.bankNumber }" ></th>
				</tr>
				<tr>
					<th>学籍状态</th>
					<th><input type="text" name="Status" value="${personalinfor.status }" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>学习形式</th>
					<th><input type="text" name="Shape" value="${personalinfor.shape }" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>学历</th>
					<th><input type="text" name="Education" value="${personalinfor.education }"  readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
				<th>学制</th>
					<th><input type="text" name="StudySystem" value="${personalinfor.studySystem }"  readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th colspan="2" align="center"><input type="submit" value="提交"></th>
				</tr>
			</table>
		</form>
	</body>
</html>