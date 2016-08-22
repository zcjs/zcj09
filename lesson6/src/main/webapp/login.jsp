<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css " rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.css " rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/jquery-1.4.3.js"></script>
<style type="text/css">
	body
	{
		padding-top: 200px;
		padding-bottom: 40px;
		background-image: url("./images/cg.jpg");
		background-position: center;
		background-repeat: no-repeat;
		
	}
	.form-signin-heading
	{
		text-align: center;
	}
	.input-block-level{
		width: 240px;
		height: auto;
	}
	.me
	{
		margin-top:-150px;
		margin-left:200px;
	}
	.container
	{
		margin-top: 200px;
	}
</style>
</head>
<body>
<div class="me">
<h1>10914 朱春杰</h1>
</div>
<div class="container">
		<form action="login" class="form-signin-heading" >
		<h1>电影租赁管理系统</h1>
		<input type="text" name="uname" id="uname" class="input-block-level" placeholder="请输入用户名..."><br/>
		<input type="password" name="pwd" id="pwd" class="input-block-level" placeholder="请输入密码..."><br/>
		<br/>
		<button class="btn btn-large btn-primary" type="submit">登录</button>
	</form>
	</div>

</body>
</html>