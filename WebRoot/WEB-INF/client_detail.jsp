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
						<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#"><span class="nav-header">LKC_CRM</span></a>
						<div class="nav-collapse">
						  <ul class="nav">
								<li>
									<a href="index.html">Dashboard</a>
								</li>
								<li>
									<a href="settings.htm">Account Settings</a>
								</li>
								<li>
									<a href="help.htm">Help</a>
								</li>
								<li class="dropdown">
									<a href="help.htm" class="dropdown-toggle" data-toggle="dropdown">Tours <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li>
											<a href="help.htm">Introduction Tour</a>
										</li>
										<li>
											<a href="help.htm">Project Organisation</a>
										</li>
										<li>
											<a href="help.htm">Task Assignment</a>
										</li>
										<li>
											<a href="help.htm">Access Permissions</a>
										</li>
										<li class="divider">
										</li>
										<li class="nav-header">
											Files
										</li>
										<li>
											<a href="help.htm">How to upload multiple files</a>
										</li>
										<li>
											<a href="help.htm">Using file version</a>
										</li>
									</ul>
								</li>
							</ul>
							<form class="navbar-search pull-left" action="">
								<input type="text" class="search-query span2" placeholder="Search" />
							</form>
							<ul class="nav pull-right">
								<li>
									<a href="#">管理员${sessionScope.id},欢迎您！</a>
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
							<li class="nav-header">LKC_CRM</li>
							<li class="active">
								<a href="${pageContext.request.contextPath}/servlet/client_Admin_Servlet"><i class="icon-home"></i>客户资料</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/servlet/my_linkman_servlet"><i class="icon-file"></i> 联系人资料</a>
							</li>
							<li>
								<a href="tasks.htm"><i class="icon-check"></i> 联系记录</a>
							</li>
							<li>
								<a href="messages.htm"><i class="icon-envelope"></i> 客户反馈</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/servlet/UploadUIServlet"><i class="icon-folder-open"></i>相关文档</a>
							</li>
							<li>
								<a href="activity.htm"><i class="icon-white icon-list-alt"></i>客户分析</a>
							</li>

							<li class="divider">
							</li>
							<li>
								<a href="help.htm"><i class="icon-info-sign"></i> Help</a>
							</li>
							<li class="nav-header">
								Bonus Templates
							</li>
							<li>
								<a href="gallery.htm"><i class="icon-picture"></i> Gallery</a>
							</li>
							<li>
								<a href="blank.htm"><i class="icon-stop"></i> Blank Slate</a>
							</li>
						</ul>
					</div>
				</div>
				<div class="span9">
					<h1>
						客户详细资料：
					</h1>
                    <form action="${pageContext.request.contextPath}/servlet/client_Admin_updata_servlet" method="post" onsubmit="return validator() ">
                    <table>
                    <tr><td>客户编号:<input type="text" name="client_id" value="${client_Basic.client_id}" readonly="readonly" /></td><td>客户姓名:<input type="text" name="client_name" value="${client_Basic.client_name }"/></td></tr>
                    <tr><td>法人代表:<input type="text" name="legal_represent" value="${client_Basic.legal_represent}"/></td><td>电子邮件:<input type="text" id="email" name="e_mail" value="${client_Basic.e_mail}"/></td></tr>                   
                    <tr><td>传&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;真:<input type="text" name="fax" value="${client_Basic.fax}"/></td><td>电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话:<input id="phone" type="text" name="telephone" value="${client_Basic.telephone}"/></td></tr>
                    <tr><td>登记时间:<input type="text" name="registration_time" value="${client_Basic.registration_time}"/></td><td>跟踪曲线:<input type="text" name="track_route" value="${client_Basic.track_route}"/></td></tr>
                    
                    <tr><td>客户等级:<input type="text" name="client_grade" value="${client_Basic.client_grade}"/></td><td>客户来源:<input type="text" name="client_type" value="${client_Basic.client_type}"/></td></tr>
                    <tr><td>所属行业:<input type="text" name="client_industry" value="${client_Basic.client_industry}"/></td><td>客户性质:<input type="text" name="client_property" value="${client_Basic.client_property}"/></td></tr>
                    <tr><td>区&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;域:<input type="text" name="district" value="${client_Basic.district}"/></td><td>城&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;市:<input type="text" name="city" value="${client_Basic.city}"/></td></tr>
                    <tr><td>省&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;份:<input type="text" name="province" value="${client_Basic.province}"/></td><td>银行帐号:<input type="text" id="bank" name="bank_account" value="${client_Basic.bank_account}"/></td></tr>
                    <tr><td>开&nbsp;户&nbsp;行:&nbsp;<input type="text" name="bank" value="${client_Basic.bank }"/></td><td>信&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用:<input type="text" name="credit" value="${client_Basic.credit}"/></td></tr>
                    <tr><td>备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注:<input type="text" name="remark" value="${client_Basic.remark}"/></td><td></td></tr>
					</table>
                    
                    <input type="submit" class="btn btn-primary" name="" value="提交"/>
                    <input type="reset" id="res" class="btn btn-primary" value="重置"/>
                    <a href="${pageContext.request.contextPath}/servlet/client_Admin_Servlet">
                    <input type="button" class="btn btn-primary" value="返回"/></a>
                    
                    <a onclick="return del()" href="${pageContext.request.contextPath}/servlet/client_Admin_delete_servlet?id=${client_Basic.client_id}">
                    <input type="button" class="btn btn-primary" value="删除信息"/></a>
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
