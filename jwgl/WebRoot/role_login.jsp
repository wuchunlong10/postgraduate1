<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>教务管理系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	

  

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="images/logo.ico">

	<!--<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	
	--><link rel="stylesheet" href="css1/bootstrap.min.css">
	<link rel="stylesheet" href="css1/animate.css">
	<link rel="stylesheet" href="css1/style.css">
	
	<script type="text/javascript" src="js1/jquery.js"></script>
	<script type="text/javascript" src="js1/jquery.beattext.js"></script>
	<script type="text/javascript" src="js1/easying.js"></script>
	<script src="js1/role_login.js"></script>
	<script src="layer-v2.3/layer/layer.js"></script>
	<script src="laypage-v1.3/laypage/laypage.js"></script>
	<script type="text/javascript">
	</script>
	<!-- Modernizr JS -->
	<script src="js1/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js1/respond.min.js"></script>
	<![endif]-->
	
<script src="assets/js/jquery-1.10.2.js"></script>
<style>
	/*下面两个是核心样式*/
	.beat-char {
	    line-height: 3.4em;
	    position: relative;
		display: inline-block;
		background: transparent;
	
	}
	
	.rotate{
		transform:rotate(360deg) ;
		-ms-transform:rotate(360deg); 	/* IE 9 */
		-moz-transform:rotate(360deg); 	/* Firefox */
		-webkit-transform:rotate(360deg); /* Safari 和 Chrome */
		-o-transform:rotate(360deg);
		-webkit-transition-duration: 0.7s;
	
	}
</style>
	</head>
	<body class="style-3" onload="load()">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<ul class="menu">
						
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 col-md-push-8">
					<!-- Start Sign In Form -->
					<form action="<c:url value="loginCheck.html"/>" class="fh5co-form animate-box" data-animate-effect="fadeInRight" method="post">
						<h2>log In</h2>
							<p id="error">
								<c:if test="${!empty error}">
							        <font color="red"><c:out value="${error}" /></font>
								</c:if> 
							</p>
						<div class="form-group">
							<input type="text" class="form-control" name="StudentId" id="StudentId" placeholder="账号"  >
						</div>
						<div class="form-group">
							<input type="password" class="form-control"  name="PassWord" id="PassWord" placeholder="密码"  >
						</div>
						<div class="form-group">
							<input type="radio" name="userStatus" id="remember" value="student" checked="true">学生&nbsp;&nbsp;
							<input type="radio" name="userStatus" id="remember" value="teacher"> 教师&nbsp;&nbsp;
							<input type="radio" name="userStatus" id="remember" value="manager"> 管理员</label>
						</div>
						<div class="form-group">
							<input type="radio" name="loc" id="remember" value="loc1" checked="true">呼和浩特&nbsp;&nbsp;
							<input type="radio" name="loc" id="remember" value="loc2"> 满洲里&nbsp;&nbsp;
							<input type="radio" name="loc" id="remember" value="loc3"> 鄂尔多斯</label>
						</div>
						<div class="form-group">
							<p>忘记密码? <a href="mailto:chengpeng_wf@126.com">联系管理员</a></p>
						</div>
						<div class="form-group">
							<button value="Log In" name="btn" class="btn btn-primary" id="check" onclick="check();">Log In</button>
						</div>
					</form>
					<!-- END Sign In Form -->
				</div>
			</div>
		</div>
	
	<!-- jQuery -->
	<script src="js1/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js1/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js1/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js1/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js1/main.js"></script>
	</body>
</html>

