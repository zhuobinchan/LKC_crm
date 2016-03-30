<%@ page language="java" import="java.util.*" pageEncoding="utf-8"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<meta charset="utf-8">
		<title>Login - Akira</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/site.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	</head>
	<body>
		<div id="login-page" class="container">
			<form id="login-form" class="well" action="${pageContext.request.contextPath}/servlet/loginServlet" method="post">
			<label><font size="6" color="blue"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;管理员登录</b></font></label>
			用户名<input type="text" class="span2" placeholder="Id" name="id"/><br />
			&nbsp;密&nbsp;码&nbsp;&nbsp;<input type="password" class="span2" placeholder="Password" name="password"/><br />
			管理员<select name="admin" class="span2"> 
			<option value="client_admin">客户管理员</option> 
			<option value="system_admin">系统管理员</option>
			<option value="goods_admin">商品管理员</option> 
			</select> <br />
			<button type="submit" class="btn btn-primary">登录</button>
			<button type="reset" class="btn">重置</button></br></br>
			<font size="4" color="red">${message}</font>
		</form>	
		</div>
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/site.js"></script>
	</body>
</html>