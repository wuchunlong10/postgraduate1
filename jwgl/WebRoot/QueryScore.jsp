<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>成绩查询</title>
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
				<th>课程编号</th><th>课程名称</th><th>分数</th><th>绩点</th>
			</tr>
			<c:forEach items="${scorelist}" var="score" varStatus="status">
			<tr height="70px">
				<td >${score.courseId }</td>
				<td>${score.subjectName}</td>
				<td >${score.score}</td>
				<td >${score.gpa}</td>
			</tr>
			</c:forEach>
	</table>
	</body>
</html>
