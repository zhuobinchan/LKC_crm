<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Activity - Akira</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath }/css/site.css"
	rel="stylesheet">
	
<link href="${pageContext.request.contextPath }/css/page.css"
	rel="stylesheet">
<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>
<body>
	<div class="container">
		<div class="navbar">
			<div class="navbar-inner">
				<div class="container">
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span>
					</a> <a class="brand" href="#"><span class="nav-header">LKC_CRM</span></a>
					<div class="nav-collapse">

						<ul class="nav pull-right">
							<li><a>管理员${sessionScope.id},欢迎您!</a></li>
							<li><a
								href="${pageContext.request.contextPath }/servlet/delete_sessionServlet">注销</a></li>
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
						<li><a
							href="${pageContext.request.contextPath}/servlet/client_Admin_Servlet"><i
								class="icon-home"></i>客户资料</a></li>
						<li><a
							href="${pageContext.request.contextPath}/servlet/my_linkman_servlet"><i
								class="icon-file"></i> 联系人资料</a></li>
						<li><a
							href="${pageContext.request.contextPath}/servlet/linkrecordServlet"><i
								class="icon-check"></i> 联系记录</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/feedbackUIServlet"><i
								class="icon-envelope"></i> 客户反馈</a></li>
						<li class="active"><a
							href="${pageContext.request.contextPath }/servlet/UploadUIServlet"><i
								class="icon-folder-open"></i>相关文档</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/client_analyse_servlet"><i
								class="icon-white icon-list-alt"></i>客户分析</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/Upload_contract_servlet"><i
								class="icon-white icon-list-alt"></i>合同查看</a></li>
						
						<li><a href="help.htm"><i class="icon-info-sign"></i>
								Help</a></li>

					</ul>
				</div>
			</div>

			<div class="span9">
				<h1>文件上传下载</h1>
				<ul class="files zebra-list" id="itemContainer">
					<c:forEach items="${allfile }" var="allfile">
						<li><i class="icon-file"></i> <a class="title"
							href="${pageContext.request.contextPath }/servlet/downloadFileServlet?filename=${allfile.upFileName }">${allfile.upFileName}</a>
							<span class="meta">Uploaded <em>${allfile.upDate }</em> by
								<em>${allfile.upUserName}</em></span></li>
					</c:forEach>
				</ul>
				<div class="holder"></div>

				<a class="toggle-link" href="#new-file"><i class="icon-plus"></i>
					添加文件</a>
				<form id="new-file" class="form-horizontal hidden"
					action="${pageContext.request.contextPath }/servlet/updateFileServlet"
					method="post" enctype="multipart/form-data">
					<fieldset>
						<legend>添加文件</legend>
						<div class="control-group">
							<label class="control-label" for="fileInput">File</label>
							<div class="controls">
								<input class="input-file" id="fileInput" type="file"
									name="fileupload" />
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary" name="submit"
								value="上传">上传</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/site.js"></script>
	
	<script
		src="${pageContext.request.contextPath }/js/jquery-1.8.2.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/jPages.js"></script>

	
	<script type="text/javascript">
		/* when document is ready */
		$(function() {
			/* initiate plugin */
			$("div.holder").jPages({
				containerID : "itemContainer",
				keyBrowse : true,
				perPage : 6
			});
		});
	</script>
	
	
</body>
</html>
