<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
						<form class="navbar-search pull-left"
							action="${pageContext.request.contextPath}/servlet/client_Admin_Servlet?message=search"
							method="post">
							<input type="text" class="search-query span2" placeholder="搜索联系人"
								name="id" />
						</form>
						<ul class="nav pull-right">
							<li><a>管理员${sessionScope.id},欢迎您！</a></li>
							<li><a
								href="${pageContext.request.contextPath }/servlet/delete_sessionServlet">注销</a>
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
						<li class="active"><a href="#"><i class="icon-home"></i>客户资料</a>
						</li>
						<li><a
							href="${pageContext.request.contextPath}/servlet/my_linkman_servlet"><i
								class="icon-file"></i> 联系人资料</a></li>
						<li><a
							href="${pageContext.request.contextPath}/servlet/linkrecordServlet"><i
								class="icon-check"></i> 联系记录</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/feedbackUIServlet"><i
								class="icon-envelope"></i> 客户反馈</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/UploadUIServlet"><i
								class="icon-folder-open"></i>相关文档</a></li>
						<li><a
							href="${pageContext.request.contextPath }/servlet/client_analyse_servlet"><i
								class="icon-white icon-list-alt"></i>客户分析</a></li>
								
						<li><a
							href="${pageContext.request.contextPath }/servlet/Upload_contract_servlet"><i
								class="icon-white icon-list-alt"></i>合同查看</a></li>

						<li class="divider"></li>
						<li><a href="help.htm"><i class="icon-info-sign"></i>
								Help</a></li>
					</ul>
				</div>
			</div>
			<div class="span9">
				<h1>客户列表：</h1>
				<table class="table table-bordered table-striped">
					<thead>
						<tr>

							<th width="18%">客户编码</th>
							<th width="15%">客户名称</th>
							<th width="15%">法人代表</th>
							<th width="15%">联系人</th>
							<th width="23%">联系电话</th>
							<th width="14%">详细资料</th>
						</tr>
					</thead>

					<tbody id="itemContainer">
						<c:forEach var="client" items="${client}">
							<tr>
								<td>${client.client_id}</td>
								<td>${client.client_name}</td>
								<td>${client.legal_represent}</td>
								<c:if test="${client.link_man==null}">
									<td><a
										href="${pageContext.request.contextPath}/servlet/client_linkman_detail_servlet?id=${client.client_id}">添加联系人</a></td>
								</c:if>
								<c:if test="${client.link_man!=null}">
									<td><a
										href="${pageContext.request.contextPath}/servlet/client_linkman_detail_servlet?id=${client.client_id}">${client.link_man}</a></td>
								</c:if>

								<td>${client.telephone}</td>
								<td><a
									href="${pageContext.request.contextPath }/servlet/client_detail_servlet?client_id=${client.client_id}"
									class="view-link">显示</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="holder"></div>
				<div>
					<a class="toggle-link" href="#new-project"><i class="icon-plus"></i>添加新客户</a>
					<form onsubmit="return validator()" id="new-project"
						class="form-horizontal hidden"
						action="${pageContext.request.contextPath}/servlet/client_Admin_add_servlet"
						method="post">
						<fieldset>
							<legend>客户基本资料</legend>
							<div class="control-group">
								<label class="control-label" for="input01">客户编码</label>
								<div class="controls">
									<input type="text" class="required" id="username"
										name="client_id" id="clientId" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">客户名称</label>
								<div class="controls">
									<input type="text" class="required" id="username"
										name="client_name" id="clientId" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">法人代表</label>
								<div class="controls">
									<input type="text" class="required" id="username"
										name="legal_represent" id="clientId" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">电话</label>
								<div class="controls">
									<input type="text" class="required" id="phone" name="telephone"
										id="clientId" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">电子邮件</label>
								<div class="controls">
									<input type="text" class="required" id="email" name="e_mail" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">传真</label>
								<div class="controls">
									<input type="text" class="input-xlarge" name="fax"
										style="width:207px" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">登记时间</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="date"
										name="registration_time" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">跟踪曲线</label>
								<div class="controls">
									<input type="text" class="input-xlarge" name="track_route"
										style="width:207px" />
								</div>
							</div>

							<div class="form-actions">
								<button type="submit" id="send" class="btn btn-primary">添加</button>
								<input class="btn" type="reset" id="res" value="重置">
							</div>
						</fieldset>
					</form>
				</div>
				
				<div class="holder1"></div>

				<a class="toggle-link" href="#new-file"><i class="icon-plus"></i>
					从Excel导入客户信息</a>
				<form id="new-file" class="form-horizontal hidden"
					action="${pageContext.request.contextPath }/servlet/inExcelServlet"
					method="post" enctype="multipart/form-data">
					<fieldset>
						<legend>选择Excel</legend>
						<div class="control-group">
							<label class="control-label" for="fileInput">File</label>
							<div class="controls">
								<input  type="file"	name="fileupload" />
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary" name="submit"
								value="上传">上传</button>
						</div>
					</fieldset>
				</form>
				<div>
				<a href="${pageContext.request.contextPath }/servlet/ExportExcelServlet">以Excel导出客户信息</a>
			</div>		
			</div>		
			
				
				
				
			</div>
		</div>
	</div>


	<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/site.js"></script>
	<script src="${pageContext.request.contextPath }/js/form.js"></script>

	<script
		src="${pageContext.request.contextPath }/js/jquery-1.8.2.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/jPages.js"></script>




	<script type="text/javascript">
		/* when document is ready */
		$(function() {
			/* initiate plugin */
			$("div.holder").jPages({
				containerID : "itemContainer",
				previous : "←",
				next : "→",
				perPage : 5,
				delay : 20
			});
		});
	</script>



</body>
</html>
