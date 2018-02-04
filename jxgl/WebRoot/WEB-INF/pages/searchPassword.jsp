<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link type="image/x-icon" rel="shortcut icon" href="./img/favicon.ico" />
    <title>找回密码</title>
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
	    #login{
    	    display: block;
		    width: 160px;
		    height: 30px;
		    position: absolute;
		    top: 76px;
		    right: 220px;
		    font-size: 16px;
		    
	    }
	    #login a{
	    	color: #999;
	    }
	    #login a:hover{
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
	    	position: absolute;
	    	top: 137px;
   			left: 0px;
	    	height: 400px;
	    	width: 100%;
	    	outline: 2px solid red;
	    }
	    .regist{
	    	width: 350px;
	    	height: 200px;
	    	position: absolute;
   			left: 200px;
	    }
	    #sub{
    		margin: 0 auto;
   			width: 99%;			
    		display: block;
	    	width: 250px;		      
		    cursor: pointer;
		    font-family: 'Microsoft YaHei';
		    border: 1px solid #e85356;
		    display: block;
		    background: #e4393c;
		    height: 31px;
		    line-height: 31px;
		    color: #fff;
		    font-size: 20px;
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
		}
    </style>
</head>
<body>
	<div class="all">
		<div class="top">
			<img src="./img/logo.png" alt="logo">
			<p class="head">教学管理系统</p>
			<span id="login"><a href="./login.jsp">已有账号，立即登录</a></span>
		</div>
		<div class="flow">
		</div>
		<div class="main">
		    <div class="regist">
			    <form method="post" action="<c:url value="lookForPassword.html"></c:url>" onsubmit="return checkSearchPwdForm(this)">
			    	<table cellpadding="1" cellspacing="1">
			    		<tr><td colspan="3" align="center"><span class="log">找回密码</span></td></tr>
			    		<tr><td><span id="msg"></span></td></tr>
			    		<tr>
			    			<td align="right">用户名：</td>
			    			<td><input type="text" id="username" name="username"></td>
			    		</tr>
			    		<tr></tr>
			    		<tr><td align="right">性别：</td>
			    			<td><input type="radio" name="sex" value="男" checked="checked">男
			    			<input type="radio" value="女" name="sex">女</td>
			    		</tr>
			    		<tr></tr>
			    		<tr>
			    			<td align="right">口令：</td>
			    			<td><input type="text" placeholder="请填写注册时口令" id="word" name="word"></td>
			    		</tr>
			    		<tr>
			    			<td align="right">密码：</td>
			    			<td><input type="text" placeholder="请填写新密码" id="password" name="password"></td>
			    		</tr>
			    		<tr>
			    			<td align="right">再次输入密码：</td>
			    			<td><input type="text" placeholder="请再次输入密码" id="repassword" name="repassword"></td>
			    		</tr>
			    		<tr></tr>
			    		<tr>
			    			<td colspan="3" align="right"><input id="sub" type="submit" value="立即找回"></td>
			    		</tr>
			    		
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
	
    function checkSearchPwdForm(){
	// 校验用户名:
	// 获得用户名文本框的值:
	var username = document.getElementById("username").value;
	if(username == null || username == ''){
		alert("用户名不能为空!");
		return false;
	}
	var yzm = document.getElementById("yzm").value;
	if(yzm == null || yzm == ''){
		alert("验证码不能为空!");
		return false;
	}
	var word = document.getElementById("word").value;
	if(word == null || word == ''){
		alert("口令不能为空!");
		return false;
	}
	var password = document.getElementById("password").value;
	if(password == null || password == ''){
		alert("密码不能为空!");
		return false;
	}
	var repassword = document.getElementById("repassword").value;
	if(password != repassword){
		alert("两次输入的密码不一致!");
		return false;
	}
}
</script>
</html>
