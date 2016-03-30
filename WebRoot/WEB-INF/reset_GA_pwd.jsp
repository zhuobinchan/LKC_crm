<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>添加管理员</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/css/site.css"
	rel="stylesheet">
<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->



</head>
<body>

	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span></a> <a
					class="brand" href="#">系统管理员系统</a>
				<div class="nav-collapse">
					<form class="navbar-search pull-left" action="">
						<input type="text" class="search-query span2" placeholder="Search">
					</form>
					<ul class="nav pull-right">
						<li><a>管理员:${sessionScope.id},欢迎您!</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/delete_sessionServlet">注销</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="span3">
		<div class="well" style="padding: 8px 0;">
			<ul class="nav nav-list">
							<li class="nav-header">
								系统管理员：</li>
                            
             
						
							<li>
								<a href="${pageContext.request.contextPath }/servlet/reset_SApswUIServlet"><i class="icon-file"></i> 重置自己的密码</a>
							</li>
                            
                            <li class="divider">
							</li>
                            
							<li class="active">
								<a href="${pageContext.request.contextPath }/servlet/system_adminServlet"><i class="icon-user"></i> 客户管理员</a>
							</li>
							
							<li>
								<a href="${pageContext.request.contextPath }/servlet/add_Admin_UIServlet?message=addCA"><i class="icon-cog"></i>添加客户管理员</a>
							</li>
							<li class="divider">
							</li>
                            
                            <li class="active">
								<a href="${pageContext.request.contextPath }/servlet/system_adminServlet?message=good"><i class="icon-user"></i> 商品管理员</a>
							</li>
							
							<li>
								<a href="${pageContext.request.contextPath }/servlet/add_Admin_UIServlet?message=addGA"><i class="icon-cog"></i>添加商品管理员</a>
							</li>
							
						</ul>
		</div>
	</div>

	<div class="span9">
		<h1>重置密码</h1>
		
		<form id="edit-profile" class="form-horizontal"
			action="${pageContext.request.contextPath }/servlet/reset_CA_GA_Servlet?id=${GAId}"
			method="post" onsubmit="return validator()">
			<fieldset>
				
				<div class="control-group">
					<label class="control-label" for="input01" >客户管理员编号</label>
					<div class="controls">
						<input type="text" class="input-xlarge" id="input01" name="SApwd" value="${GAId}">
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="input01" >请输入密码</label>
					<div class="controls">
						<input type="password" class="input-xlarge" id="input01" name="SApwd">
					</div>
				</div>

				<div class="control-group">
					<label class="control-label" for="input01">再次输入密码</label>
					<div class="controls">
						<input type="password" class="input-xlarge" id="input01"
							name="SApwd_confirm">
					</div>
				</div>
				<br>
				<c:choose>
				<c:when test="${param.message==2}">
				<p style="color:red">密码修改成功</p>
				</c:when>
				<c:when test="${param.message==0}">
				<p style="color:red">两次输入不相同</p>
				</c:when>
				<c:when test="${param.message==1}">
				<p style="color:red">密码输入不能为空</p>
				</c:when>
				</c:choose>
				
				<div class="form-actions">
					<button type="submit" class="btn btn-primary">提交</button>
					<button class="btn">重置</button>
				</div>
			</fieldset>
		</form>
		
		
		
	</div>
</body>
</html>
