<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
 <link href="images\edusysten.ico" rel="shortcut icon"/>
<title>教务管理</title>
<link href="css/style1.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
<script type="text/javascript" src="Js/jquery.min.js"></script>
<script type="text/javascript" src="Js/texiao.js"></script>
<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function openurl(url) {
		var rframe = parent.document.getElementById("rightFrame");
		rframe.src = url;
	}
</script>
<style>
	.top{
		position: absolute;
		top: 0px;
		height: 80px;
		width: 100%;
		background-color:#33CCCC;
	}
	.menu{
		position: absolute;
		top: 80px;
		left: 25%;
	}
.right {
	position: absolute;
	top:120px;
	width: 100%;
	height: 100%;
	font-size: 14px;
	text-align: center;
}
.dropdown{
	position: absolute;
	top: 25px;
	right: 20px;
}
h1{
	position: absolute;
	top: 20px;
	left: 125px;
	color: #8a8a8a;
}
img{
	position: absolute;
	top: 20px;
	left: 70px;
}
.user{
	position: absolute;
	top: 29px;
	right: 110px;
</style>
</head>
<body style="overflow:-Scroll;overflow-y:hidden">
	<div class="top">
	<img src="images/logo.png" width="50" height="50">
	<h1>教务管理</h1>
	<h4 class="user">欢迎您</h4>
	 <div class="dropdown">
	    <button type="button" class="btn dropdown-toggle" data-toggle="dropdown">
	      <span>${user.studentName}</span>
	    </button>
	    <div class="dropdown-menu dropdown-menu-right">
	      <a class="dropdown-item" href="javascript:void(0);" onClick="openurl('getpersonalinfor.html?studentId=${user.studentId}');">信息修改</a>
	      <a class="dropdown-item" href="loginout.jsp" align="right">安全退出</a>
	
	    </div>
	</div>
	<div id="menu2" class="menu">
		<ul>
		<li><a class="a" href="javascript:void(0);" onClick="openurl('shouye.html');">首页</a></li>
		<li><a class="a" href="javascript:void(0);" onClick="openurl('queryscore.html?studentId=${user.studentId}');">成绩查询</a></li>
		<li><a class="a" href="javascript:void(0);" onClick="openurl('querycourse.html?studentId=${user.studentId}');">课表查询</a></li>
		<li><a class="a" href="javascript:void(0);" onClick="openurl('getselectcourseinfor.html');">学生选课</a></li>
		<li><a class="a" href="javascript:void(0);" onClick="openurl('getstudentteacherinfor.html?studentId=${user.studentId}');">学生评教</a></li>
		</ul>
	</div>

		<div class="right">
			<iframe id="rightFrame" name="rightFrame" width="100%" height="500px"
				scrolling="auto" marginheight="0" marginwidth="0" align="center"
				style="border: 0px solid red; margin: 0; padding: 0;">
			</iframe>
		</div>

</body>
</html>
