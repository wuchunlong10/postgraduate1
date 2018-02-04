<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
	<script src="Js/jquery1.4.4.min.js"></script>
    <script>
        $(function () {
            $(".aaa").hide();
            $("label").click(function () {
                $(".aaa").hide();
                var theI = $(this).index();
                $(".aaa").eq(theI).show();
            })
        })
    </script>
    <script type="text/javascript">
    	function check_legal(form){
    		if(form.Topic1.value==""){
    			alert("授课方式不能为空！");
    			return false;
    		}
    		if(form.Topic2.value==""){
    			alert("课堂氛围不能为空！");
    			return false;
    		}
    		if(form.Topic3.value==""){
    			alert("课下与学生交流情况不能为空！");
    			return false;
    		}
    		if(form.Topic4.value==""){
    			alert("作业批改况不能为空！");
    			return false;
    		}
    		if(form.Mark.value==""){
    			alert("评分不能为空！");
    			return false;
    		}
    		if(form.Mark.value>100||form.Mark.value<0){
    			alert("分数在0~100之间！");
    			return false;
    		}
    		if(form.Comment.value==""){
    			alert("评语不能为空！");
    			return false;
    		}
    	}
    </script>
    <style>
        .aaa {display:none; }
        #input1{
        	width:99%;
        }
    </style>
</head>
<body>
	<center>
	<c:forEach items="${stutealist}" var="stutea" varStatus="status">
	    <label><input type="radio" name="sets" value="${stutea.teacherName}" />${stutea.teacherName} ${stutea.subjectName} ${stutea.academy}</label>
	 </c:forEach>
	 </center>
	 <c:forEach items="${stutealist}" var="stutea" varStatus="status">
	  <form action="<c:url value="evaluation.html"/>" method="post" onsubmit="return check_legal(this)">
	    <div class="aaa">
	    <table border="1" align="center">
	    	<tr>
	    	<th colspan="5">
	    		<input type="text" name="TeacherName" value="${stutea.teacherName}" readonly="readonly" style="border:none;">
	    		<input type="text" name="SubjectName" value="${stutea.subjectName}" readonly="readonly" style="border:none;">
	    		<input type="text" name="Academy" value="${stutea.academy}" readonly="readonly" style="border:none;">
	    	</th>
	    	</tr>
			<tr>
				<th>题目</th>
				<th colspan="4">选项</th>
			</tr>
			<tr>
				<td><input type="text" name="Topic1" value="授课方式" readonly="readonly" style="border:none;"/></td>
				<td><input type="radio" name="Option1" value="A 非常好"/>A 非常好</td>
				<td><input type="radio" name="Option1" value="B 好"/>B 好</td>
				<td><input type="radio" name="Option1" value="C 一般"/>C 一般</td>
				<td><input type="radio" name="Option1" value="D 差"/>D 差</td>
			</tr>
			<tr>
				<td><input type="text" name="Topic2" value="课堂氛围" readonly="readonly" style="border:none;"/></td>
				<td><input type="radio" name="Option2" value="A 非常活跃"/>A 非常活跃</td>
				<td><input type="radio" name="Option2" value="B 活跃"/>B 活跃</td>
				<td><input type="radio" name="Option2" value="C 一般"/>C 一般</td>
				<td><input type="radio" name="Option2" value="D 差"/>D 差</td>
			</tr>
			<tr>
				<td><input type="text" name="Topic3" value="课下与学生交流情况" readonly="readonly" style="border:none;"/></td>
				<td><input type="radio" name="Option3" value="A 非常好"/>A 非常好</td>
				<td><input type="radio" name="Option3" value="B 好"/>B 好</td>
				<td><input type="radio" name="Option3" value="C 一般"/>C 一般</td>
				<td><input type="radio" name="Option3" value="D 差"/>D 差</td>
			</tr>
			<tr>
				<td><input type="text" name="Topic4" value="作业批改" readonly="readonly" style="border:none;"/></td>
				<td><input type="radio" name="Option4" value="A 非常好"/>A 非常好</td>
				<td><input type="radio" name="Option4" value="B 好"/>B 好</td>
				<td><input type="radio" name="Option4" value="C 一般"/>C 一般</td>
				<td><input type="radio" name="Option4" value="D 差"/>D 差</td>
			</tr>
			<tr>
				<td>评分</td>
				<td colspan="4"><input type="text" style="width:50px;" maxlength="3" id="input1" name="Mark" placeholder="评分">&nbsp;<font style="font-size:12px;">评分在0~100之间</font></td>
			</tr>
			<tr>
			<td>意见</td>
			<td colspan="4">
			    <textarea name="Comment" rows="5"  maxlength="100" style="width:520px;outline:none;"  placeholder="字数不超过100字" ></textarea>
			</td>
			</tr>
	    </table>
	    <center>
	    <input type="hidden" name="StudentId" value="${user.studentId}">
	    <input type="submit" name="submit" value="提交">
	    </center>
	    </div>
	    </form>
	 </c:forEach>
	
</body>
</html>