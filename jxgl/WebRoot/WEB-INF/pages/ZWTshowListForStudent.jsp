<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ZWTshowListForStudent.html" method="post">
		<select name="select">
			<option value="1">文件名</option>
			<option value="2">课程名</option>
			<option value="3">三天之内</option>
		</select> <input type="text" name="input"  />
		<button type="submit">搜索</button>
	</form>
	<table>
		<tr>
			<th>文件名</th>
			<th>文件大小</th>
			<th>描述</th>
			<th>课程</th>
			<th>发布人</th>
			<th>上传时间</th>
			<th>操作</th>
		</tr>


		<c:forEach items="${fileList}" var="file">
			<tr>
				<td>${file.fileName }</td>
				<td>${file.fileid}K</td>
				<td>${file.fileDesc }</td>
				<td>${file.fileType }</td>
				<td>${file.fileOwnerName }</td>
				<td>${file.fileuploadDate}</td>
				<td>
					<form action="ZWTdownload.html">
						<input id="fileid" type="hidden" name="fileid"
							value="${file.fileid}" /><input type="submit" value="下载" />
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>