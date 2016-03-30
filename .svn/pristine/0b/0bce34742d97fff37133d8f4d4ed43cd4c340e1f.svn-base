<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<meta charset="utf-8">
		<title>系统管理员</title>
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
						<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#">系统管理员系统</a>
						<div class="nav-collapse">
							<form class="navbar-search pull-left" action="">
								<input type="text" class="search-query span2" placeholder="Search" />
							</form>
							<ul class="nav pull-right">
								<li>
									<a>管理员:${sessionScope.id},欢迎您!</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath }/servlet/delete_sessionServlet">注销</a>
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
				
			<c:choose>
				<c:when test="${message!=null}">
					<h1>
						商品管理员：
					</h1>
				
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									编号
								</th>
								<th>
									管理员姓名
								</th>
								<th>
									性别
								</th>
								<th>
									年龄
								</th>
								<th>
									添加或重置
								</th>
							</tr>
						</thead>
						<tbody>
						
						<c:forEach var="allGood_Admins" items="${allGood_admins}">
							<tr>
								<td>
									${allGood_Admins.GAid}
								</td>
								<td>
									${allGood_Admins.GAname}
								</td>
								<td>
									${allGood_Admins.GAgender}
								</td>
								<td>
									${allGood_Admins.GAage}
								</td>
								<td>
									<a href="${pageContext.request.contextPath }/servlet/reset_CA_GA_UIServlet?GAId=${allGood_Admins.GAid}" class="view-link">重置</a>
									<a href="${pageContext.request.contextPath }/servlet/delete_Admin_Servlet?GAId=${allGood_Admins.GAid}"class="view-link"style="color:red"   onclick="return validator()"  >删除</a>
									
								</td>
							</tr>
							</c:forEach>
							
						
					
						</tbody>
					</table>				
					<div class="pagination">
						<ul>
							<li class="disabled">
								<a href="#">&laquo;</a>
							</li>
							<li class="active">
								<a href="#">1</a>
							</li>
							<li>
								<a href="#">2</a>
							</li>
							<li>
								<a href="#">3</a>
							</li>
							<li>
								<a href="#">4</a>
							</li>
							<li>
								<a href="#">&raquo;</a>
							</li>
						</ul>
					</div>
					</c:when>
					
			
				<c:otherwise>
					<h1>
						客户管理员：
					</h1>
				
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									编号
								</th>
								<th>
									管理员姓名
								</th>
								
								<th>
									添加重置
								</th>
							</tr>
						</thead>
						<tbody>
						
						<c:forEach var="allClient_Admins" items="${allClient_Admins}">
							<tr>
								<td>
									${allClient_Admins.client_admin_id}
								</td>
								<td>
									${allClient_Admins.client_admin_name}
								</td>
								
								<td>
									<a href="${pageContext.request.contextPath }/servlet/reset_CA_GA_UIServlet?CAId=${allClient_Admins.client_admin_id}" class="view-link">重置</a>
									<a href="${pageContext.request.contextPath }/servlet/delete_Admin_Servlet?CAId=${allClient_Admins.client_admin_id}" class="view-link"style="color:red" onclick="return validator()">删除</a>
								</td>
							</tr>
							</c:forEach>
							
						
					
						</tbody>
					</table>				
					<div class="pagination">
						<ul>
							<li class="disabled">
								<a href="#">&laquo;</a>
							</li>
							<li class="active">
								<a href="#">1</a>
							</li>
							<li>
								<a href="#">2</a>
							</li>
							<li>
								<a href="#">3</a>
							</li>
							<li>
								<a href="#">4</a>
							</li>
							<li>
								<a href="#">&raquo;</a>
							</li>
						</ul>
					</div>
					
					</c:otherwise>
					</c:choose>
				</div>
				
			</div>
		</div>
		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/site.js"></script>
		<script src="${pageContext.request.contextPath }/js/form.js"type="text/javascript"></script>
	</body>
</html>
