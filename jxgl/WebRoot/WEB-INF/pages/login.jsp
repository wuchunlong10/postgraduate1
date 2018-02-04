<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<link type="image/x-icon" rel="shortcut icon" href="./img/favicon.ico" />
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>欢迎登录</title>
    <style>
	    body {
	    	margin: 0 auto;
	    }
	    a{
	    	text-decoration: none;	
	    	color: black;
	    }
	    a:hover {
	    	text-decoration:underline;
	    	color: red;
	    }
	    .all{
	    	margin: 0 auto;
	    	outline: 0px solid red;
	    	//width: 1080px;
	    	height: 650px;
	    	position: relative;
	    }
	    .top{
	    	width: 1080px;
	    	margin: 0 auto;
	    	text-align: center;
	    	height: 100px;
	   		//background-color: #607d8b;
	    }
	    .top img{
	    	width: 200px;
	    	height: 100px;
	    	display: block;
	    }
	    .top p{
	    	position: absolute;
	    	top: -34px;
    		left: 300px;
	    	line-height: 100px;
	    	text-align: center;
	    	text-shadow: 5px 5px 5px #FF0000; 
	    	font-size: 48px;
	    }
	    #search{
    	    display: block;
		    width: 85px;
		    height: 30px;
		    position: absolute;
		    top: 76px;
		    right: 220px;
		    font-size: 16px;
		    
	    }
	    #search a{
	    	color: #999;
	    }
	    #search a:hover{
	    	color: red;
	    }
	    .flow{
	    	position: absolute;
	    	top: 100px;
	    	left: 0px;
	    	//background-color: yellow;
	    	height: 33px;
	    	width: 100%;
	    	font-size: 22px;
	    }
	    .flow .sp{
	    	font-size: 22px;
	    	line-height: 33px;
	    	text-align: center;
	    }
	    .main{
	    	//width: 1080px;
	    	height: 450px;
	    	background-image: url(./img/bg.png);
	    	background-size: 100% 100%;
	    	background-repeat: no-repeat;
	    }
        .box{
            width:600px;
            height: 400px;
            outline:2px solid #a98888;
            position: absolute;
            overflow: hidden;
            top: 135px;
            left: 155px;            
        }
        .content{
            width: 400%;
            height: 100%;
            position:absolute;
        }
        .content>img{
            width: 600px;
            height: 100%;
            float:left;
        }
		.login{
			width: 310px;
			height: 350px;
			background: #f8f8f8;
			//background-color: white;
			position: absolute;
			top: 138px;
			left: 800px;

		}
		.login .log{
			font-size: 28px;
			color: #71B40F;
		}
		.login .yzm{
			width: 70px;
		}
		.login #zc{
			font-size: 14px;
		}
		.login #msg{
			color: red;
		}
		#checkCode{
			width:120px;
			height:28px;
			cursor:pointer;
			position: absolute;
    		top: 112px;
    		right: 26px;
		}
		#sub{
			border: 1px solid #7BE69E;
    		display: block;
	    	width: 250px;
		    background: #5FC840;
		    height: 31px;
		    line-height: 31px;
		    color: #fff;
		    font-size: 20px;
		    cursor: pointer;
		    font-family: 'Microsoft YaHei';
		}
		.footer{
			margin: 0 auto;
			position: absolute;
			width: 100%;
			height: 120px;
			top: 550px;
			text-align: center;
			background-color: #112233;
		}
		#foot_content{
			text-align: center;
			line-height: 70px;
			font-size: 20px;
			color: #8a8c19;
		}
    </style>
</head>
<body>
	<div class="all">
		<div class="top">
			<img src="./img/logo.png" alt="logo">
			<p class="head">教学管理系统 </p>
			<span id="search"><a href="#">问卷调查</a></span>
		</div>
		<div class="flow">
			<marquee behavior="scroll"><font class="sp">欢迎您使用教学管理系统</font></marquee>
		</div>
		<div class="main">
		    <div class="box">
		        <div class="content">
		            <img src="./img/1.png" alt=""/>
		            <img src="./img/2.png" alt=""/>
		            <img src="./img/3.png" alt=""/>
		            <img src="./img/1.png" alt=""/>
		        </div>
		    </div>
		    <div class="login">
			    <form method="post" action="<c:url value="/loginCheck.html"></c:url>" onsubmit="return checkForm(this)">
			    	<table cellpadding="1" cellspacing="1">
			    		<tr><td colspan="3" align="center"><span class="log">登录</span></td></tr>
			    		<tr>
			    			<td colspan="3" align="center">
			    			<span id="msg">${message }</span>
			    			<c:if test="${!empty error}">
 			 					<font color="red"><c:out value="${error}"></c:out></font>
							</c:if>
			    			</td>
			    		</tr>
			    		<tr><td align="right"><label for="username">账号:</label></td><td><input type="text" id="username" name="username" placeholder="用户名/编号"></td></tr>
			    		<tr></tr>
			    		<tr><td align="right"><label for="password">密码:</label></td><td><input type="password" id="password" name="password"></td></tr>
			    		<tr>
			    			<td align="right">登陆身份:</td>
			    			<td>
			    				<select name="loginType">
									<option value="student">学生</option>
									<option value="teacher">教师</option>
									<option value="admin">管理员</option>
								</select>
							</td>
						</tr>
			    		<tr>
			    			<td align="right"><label for="yzm">验证码:</label></td>
			    			<td><input type="text" maxlength="4" style="width:60px;" class="yzm" id="yzm" name="yzm"></td><td>
			    			<img id="checkCode" src="checkImgCode.html" onclick="changeImg()" title="点击更换验证码"/></td>
			    		</tr>
			    		<%-- <tr><td>${session.checkcode }</td></tr> --%>
			    		<tr>
			    			<td align="right">
			    				<input type="checkbox" id="radio">
			    				<label for="radio">记住密码</label>
			    			</td>
			    			<td colspan="2" align="right">
			    				<a href="searchPassword.html"><span><i id="search zz">忘记密码</i></span></a>
			    			</td>
			    		</tr>
			    		<tr><td colspan="3" align="right"><input id="sub" type="submit" value="立即登录"></td></tr>
			    		<tr><td align="right"><a href="regist.html"><i id="zc" id="search">立即注册</i></a></td></tr>
			    	</table>
		    	</form>	
		    </div>
		</div>	
	    <div class="footer">
	    	<p id="foot_content">小组成员：吴春龙、魏志超、吕强、。。。。。</p>
	    </div>
	</div>
</body>
<script>
    var box = document.querySelector(".box");
    var content = document.querySelector(".content");
    var x = 0;

    function scroll() {
        x -= 2;

		//900是3张图片的宽度
        if(x == (-1800)){
            x = 0;
        }
        content.style.left = x + "px";
		//300 是图片宽度
        if( x % 600 == 0){
            clearInterval(timer);
			//图片停留时间1500毫秒
            setTimeout(timerFunc,1500);
        }
    }
    var timer;
    function timerFunc() {
	//速度10毫秒2像素，( 上方 x -=2 )
        timer = setInterval(scroll,10);
    }
    timerFunc();

	function changeImg(){
		var img = document.getElementById("checkCode");
		img.src="checkImgCode.html?t="+new Date().getTime();
	}
    function checkForm(){
	// 校验用户名:
	// 获得用户名文本框的值:
	var msg = document.getElementById("msg");
	var username = document.getElementById("username").value;
	if(username == null || username == ''){
		//alert("用户名不能为空!");
		msg.innerHTML='用户名不能为空!';
		return false;
	}
	// 校验密码:
	// 获得密码框的值:
	var password = document.getElementById("password").value;
	if(password == null || password == ''){
		msg.innerHTML='密码不能为空!';
		alert("密码不能为空!");
		return false;
	}
	var yzm = document.getElementById("yzm").value;
	if(yzm == null || yzm == ''){
		msg.innerHTML='验证码不能为空!';
		alert("验证码不能为空!");
		return false;
	}
}
</script>
</html>