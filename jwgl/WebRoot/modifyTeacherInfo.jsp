<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
	</head>
	<body>
		<form action="<c:url value="modifyInfo3.html"/>" method="post">
			<table border="1" align="center">
				<tr>
					<th>教职工号</th>
					<th><input type="text" name="idNumber" value="${Info.idNumber}" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>姓名</th>
					<th><input type="text" name="name" value="${Info.name}" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>性别</th>
					<th><input type="text" name="sex" value="${Info.sex}" readonly="readonly" style="border:none;"></th>
				</tr>
				<tr>
					<th>身份证</th>
					<th><input type="text" name="idCard" value="${Info.idCard }" readonly="readonly" style="border:none;" ></th>
				</tr>
				<tr>
					<th>籍贯</th>
					<th><input type="text" name="nation" value="${Info.nation }" readonly="readonly" style="border:none;" ></th>
				</tr>
				<tr>
					<th>教授课程</th>
					<th><input type="text" name="SubjectName" value="${Info.subjectName }" readonly="readonly" style="border:none;" ></th>
				</tr>
				<tr>
					<th>手机号</th>
					<th><input type="text" name="phone" value="${Info.phone }"></th>
				</tr>
				<tr>
					<th>地址</th>
					<th><input type="text" name="address" value="${Info.address}"></th>
				</tr>
				<tr>
					<th>教育情况</th>
					<th><input type="text" name="education" value="${Info.education }"></th>
				</tr>
				<tr>
					<th>获奖情况</th>
					<th><input type="text" name="prize" value="${Info.prize }"></th>
				</tr>
				<tr>
					<th colspan="2" align="center"><input type="submit" value="提交"></th>
				</tr>
			</table>
		</form>
	</body>
</html>