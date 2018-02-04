<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<link type="image/x-icon" rel="shortcut icon" href="./img/favicon.ico" />
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>注册</title>
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
		    height: 210px;
		    position: absolute;
		    left: 200px;
		    background: #f8f8f8;
	    }
	    #msg{ color:red;}
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
			<span id="login"><a href="./login.jsp">已有账号?立即登录</a></span>
		</div>
		<div class="flow">
		</div>
		<div class="main">
		    <div class="regist">
		   		<form method="post" action="<c:url value="/registStudent.html"></c:url>" onsubmit="return checkRegistForm(this)">
			    	<table cellpadding="1" cellspacing="1">
			    		<tr><td colspan="3" align="center"><span class="log">学生注册</span></td></tr>
			    		<tr><td colspan="3" align="center"><span id="msg"></span></td></tr>
			    		<tr><td colspan="3" align="center">
			    				<c:if test="${!empty error}">
 			 					<font color="red"><c:out value="${error}"></c:out></font>
							</c:if>
			    			</td></tr>
			    		<tr>
			    			<td align="right">姓名：</td>
			    			<td>
			    				<input type="text" id="username" name="username">
			    			</td>
			    		</tr>
			    		<tr></tr>
			    		<tr>
			    			<td align="right">密码：</td>
			    			<td>
			    				<input type="password" id="password" name="password">
			    			</td>
			    		</tr>
			    		<tr>
			    			<td align="right">性别：</td>
			    			<td>
					    		<input type="radio" name="sex" value="男" checked="checked">男
					    		<input type="radio" name="sex" value="女">女
			    			</td>
			    		</tr>
			    		<tr></tr>
			    		<tr>
			    			<td align="right">口令：</td>
			    			<td>
			    				<input type="text" placeholder="仅用于找回密码" id="word" name="word">
			    			</td>
			    			</tr>
			    		<tr></tr>
			    		<tr>
			    			<td colspan="3" align="right">
			    				<input id="sub" type="submit" value="立即注册">
			    			</td>
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
	var msg = document.getElementById("msg");
    function checkRegistForm(){
	// 校验姓名:
	var username = document.getElementById("username").value;
	if(username == null || username == ''){
		alert("姓名不能为空!");
		msg.innerHTML="姓名不能为空";
		return false;
	}
	// 校验密码:
	// 获得密码框的值:
	var password = document.getElementById("password").value;
	if(password == null || password == ''){
		msg.innerHTML="密码不能为空";
		return false;
	}
	// 校验口令:
	// 获得口令值:
	var word = document.getElementById("word").value;
	if(word == null || word == ''){
		alert("口令不能为空!");
		msg.innerHTML="口令不能为空";
		return false;
	}
	//检验验证码是否为空
	var yzm = document.getElementById("yzm").value;
	if(yzm == null || yzm == ''){
		alert("验证码不能为空!");
		return false;
	}
	
	//ajax 检验用户名是否存在
	var xmlHttpRequest;
	function createXmlHttpRequest()
	{
		if(window.ActiveXObject)
		{
			return new ActiveXObject("Microsoft.XMLHTTP");
		}else if(window.XMLHttpRequest)
		{
			return new XMLHttpRequest();
		}
	}
	xmlHttpRequest=createXmlHttpRequest();
	
	function checkUserExists()
	{
		var username=document.getElementById("username");
		if(username.value==""||username.value==null)
		{
			msg.innerHTML="用户名不能为空";
			username.focus();
			return false;
		}
		var url="CheckUserServlet";
		var param="username="+encodeURIComponent(username.value);
		
		xmlHttpRequest.onreadystatechange=callBack;
		xmlHttpRequest.open("POST",url,true);
		xmlHttpRequest.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		xmlHttpRequest.send(param);	
			
	}
	function callBack()
	{
		msg.innerHTML="callBack";
		if(xmlHttpRequest.readyState==4 && xmlHttpRequest.status==200)
		{
			var data=xmlHttpRequest.responseText;
			if(data == "true")
			{
				msg.innerHTML="用户名已存在";
				document.getElementById("username").select();
			}else
			{
				msg.innerHTML="恭喜你，用户名可以注册";
			}
		}else
		{
			msg.innerHTML="请稍等...";
		}
	}
}
</script>
</html>