<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>发布公告</title>
		<link rel="stylesheet" type="text/css" href="css/main.css" />  
	    <script  src="Js/jquery3.js"></script>
	    <script  src="Js/colResizable-1.3.min.js"></script>
	<script type="text/javascript">

	$(function(){	

		var onSampleResized = function(e){

			var columns = $(e.currentTarget).find("th");

			var msg = "columns widths: ";

			columns.each(function(){ msg += $(this).width() + "px; "; })

			$("#sample2Txt").html(msg);

			

		};	

	

		$("#sample2").colResizable({

			liveDrag:true, 

			gripInnerHtml:"<div class='grip'></div>", 

			draggingClass:"dragging", 

			onResize:onSampleResized});

		

	});	

  </script>
	</head>
	<body>
	 <table id="sample2" width="100%"  border="1" cellpadding="0" cellspacing="0">
			<tr >
				<th>课程编号</th>
				<th>课程名称</th>
				<th>授课教师</th>
				<th>上课时间</th>
				<th>上课地点</th>
				<th>课时</th>
				<th>开课学院</th>
				<th>已选人数/可选人数</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${selectcourselist}" var="selectcourse" varStatus="status">
			<tr height="70px">
				<td >${selectcourse.courseId}</td>
				<td>${selectcourse.subjectName}</td>
				<td >${selectcourse.teacherName}</td>
				<td >${selectcourse.time}</td>
				<td >${selectcourse.place}</td>
				<td>${selectcourse.courseTime }</td>
				<td>${selectcourse.academy}</td>
				<td >${selectcourse.currentNumber}/${selectcourse.totleNumber}</td>
				<td >
					<a href="selectcourse.html?studentId=${user.studentId}&courseId=${selectcourse.courseId}&subjectName=${selectcourse.subjectName}&time=${selectcourse.time}&place=${selectcourse.place}&teacherName=${selectcourse.teacherName}&currentNumber=${selectcourse.currentNumber}&totleNumber=${selectcourse.totleNumber}&courseTime=${selectcourse.courseTime}&academy=${selectcourse.academy}" onclick="return confirm('确定选修？')">选课</a>|
					<a href="quitcourse.html?studentId=${user.studentId}&courseId=${selectcourse.courseId}&subjectName=${selectcourse.subjectName}&time=${selectcourse.time}&place=${selectcourse.place}&teacherName=${selectcourse.teacherName}&currentNumber=${selectcourse.currentNumber}&totleNumber=${selectcourse.totleNumber}&courseTime=${selectcourse.courseTime}&academy=${selectcourse.academy}" onclick="return confirm('确定退选？')">退选</a>
				</td>
			</tr>
			</c:forEach>
	</table>
	<span style="color:red">注意：上课时间中第一位数代表第几节，第二位数代表周几，例如：12，代表周二的第一节</span>
	</body>
</html>
