<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<meta charset="utf-8">
		<title>Activity - Akira</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/site.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	</head>
	<body>
		<div class="container">
			<div class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#">LKC_crm</a>
						<div class="nav-collapse">
						  <form class="navbar-search pull-left" action="">
							  <input type="text" class="search-query span2" placeholder="Search" />
						  </form>
							<ul class="nav pull-right">
								<li>
									<a><font color="black">管理员${sessionScope.id},您好!</font></a>
								</li>
								<li>
									<a href="login.htm">注销</a>
								</li>
							</ul>
					  </div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="span3">
					<div class="well" style="padding: 8px 0;">
						<ul class="nav nav-list">
							<li class="nav-header">商品管理</li>
							<li class="active">
								<a href="projects.htm"><i class="icon-folder-open"></i> 商品资料</a>
							</li>
                            <li class="nav-header">
								采购管理
							</li>
							<li>
								<a href="tasks.htm"><i class="icon-check"></i> 采购询价单</a>
							</li>
							<li>
								<a href="messages.htm"><i class="icon-envelope"></i>采购单管理</a>
							</li>
							<li>
								<a href="files.htm"><i class="icon-file"></i>采购分析</a>
							</li>
                            <li class="nav-header">
								销售管理
							</li>
							<li>
								<a href="activity.htm"><i class="icon-white icon-list-alt"></i> 销售报价单</a>
							</li>
							
							<li>
								<a href="profile.htm"><i class="icon-user"></i> 销售单管理</a>
							</li>
							<li>
								<a href="settings.htm"><i class="icon-cog"></i> 销售分析</a>
							</li>
							<li></li>
						</ul>
					</div>
				</div>
			
				<div class="span9">
					<h1>
						商品资料
                    </h1>
					<form action="${pageContext.request.contextPath}/servlet/goods_update_servlet" method="post" onsubmit="return validator() ">
                    <table>
                    <tr><td>商品编号:<input type="text" name="gid" value="${goods.gid}" readonly="readonly" /></td><td>&nbsp;</td></tr>
                    <tr><td>商品名称:<input type="text" name="gname" value="${goods.gname}"/></td><td>&nbsp;</td></tr>                   
                    <tr><td>商品价格:<input type="text" name="gprice" value="${goods.gprice}"/></td><td>&nbsp;</td></tr>
                    </table>
                    
                    <input type="submit" class="btn btn-primary" value="提交"/>
                    <input type="reset" class="btn btn-primary" value="重置"/>
                    <a href="${pageContext.request.contextPath}/servlet/goods_Admin_Servlet">
                    <input type="button" class="btn" value="返回"/></a>
                  	</form>
				</div>
			</div>
		</div>
		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/site.js"></script>
		<script src="${pageContext.request.contextPath }/js/form.js"></script>
	</body>
</html>
