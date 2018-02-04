<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>课表查询</title>
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
				<th>节\星期</th><th>周一</th><th>周二</th><th>周三</th><th>周四</th><th>周五</th>
			</tr>
			<tr height="70px">
				<td>第一、二节</td>
				<td>${subjectname11}<br>${teachername11}<br>${place11}</td>
				<td>${subjectname12}<br>${teachername12}<br>${place12}</td>
				<td>${subjectname13}<br>${teachername13}<br>${place13}</td>
				<td>${subjectname14}<br>${teachername14}<br>${place14}</td>
				<td>${subjectname15}<br>${teachername15}<br>${place15}</td>
			</tr>
			<tr height="70px">
				<td>第三、四节</td>
				<td>${subjectname21}<br>${teachername21}<br>${place21}</td>
				<td>${subjectname22}<br>${teachername22}<br>${place22}</td>
				<td>${subjectname23}<br>${teachername23}<br>${place23}</td>
				<td>${subjectname24}<br>${teachername24}<br>${place24}</td>
				<td>${subjectname25}<br>${teachername25}<br>${place25}</td>
			</tr>
			<tr height="70px">
				<td>第五、六节</td>
				<td>${subjectname31}<br>${teachername31}<br>${place31}</td>
				<td>${subjectname32}<br>${teachername32}<br>${place32}</td>
				<td>${subjectname33}<br>${teachername33}<br>${place33}</td>
				<td>${subjectname34}<br>${teachername34}<br>${place34}</td>
				<td>${subjectname35}<br>${teachername35}<br>${place35}</td>
			</tr>
			<tr height="70px">
				<td>第七、八节</td>
				<td>${subjectname41}<br>${teachername41}<br>${place41}</td>
				<td>${subjectname42}<br>${teachername42}<br>${place42}</td>
				<td>${subjectname43}<br>${teachername43}<br>${place43}</td>
				<td>${subjectname44}<br>${teachername44}<br>${place44}</td>
				<td>${subjectname45}<br>${teachername45}<br>${place45}</td>
			</tr>
	</table>
	</body>
</html>
