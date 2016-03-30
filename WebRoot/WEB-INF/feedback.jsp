<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/findNameTags" prefix="find"%>
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
<title>Messages - Akira</title>
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
							<li><a>管理员${sessionScope.id},欢迎您！</a></li>
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
							href="${pageContext.request.contextPath }/servlet/linkrecordServlet"><i
								class="icon-check"></i> 联系记录</a></li>
						<li class="active"><a
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
								
						<li><a href="help.htm"><i class="icon-info-sign"></i>
								Help</a></li>
					</ul>


				</div>
			</div>

			<div class="span9">
				<h1>客户反馈</h1>
				<h2></h2>


				<ul class="messages" id="itemContainer">





					<c:forEach items="${allFeedBacks }" var="allFeedBacks">


						<li class="well">
							<p class="message">
								<find:Name id="${allFeedBacks.clientId }" type="Client" />
								的客户反馈: <br> 标题：${allFeedBacks.fBtitle } <br>
								${allFeedBacks.fBremack }

							</p> <span class="meta">Written <em>调查时间：${allFeedBacks.fBsearch_date }</em>
								by <em><find:Name id="${allFeedBacks.myLMid }"
										type="MyLinkman" /></em>
						</span> <span class="meta">Written <em>反馈时间：${allFeedBacks.fBback_date }</em>
								by <em><find:Name id="${allFeedBacks.cLMid }"
										type="Client_Linkman" /></em> <br> <a style="color:red"
								href="${pageContext.request.contextPath }/servlet/delete_feedbackServlet?fBid=${allFeedBacks.fBid}">删除</a>
						</li>

					</c:forEach>

				</ul>
				<div class="holder"></div>

				<a class="toggle-link" href="#message-reply"><i
					class="icon-plus"></i> 添加客户反馈</a>
				<form id="message-reply" class="form-horizontal hidden"
					action="${pageContext.request.contextPath }/servlet/add_feedbackServlet"
					method="post">
					<fieldset>
						<legend>添加客户反馈</legend>


						<div class="control-group">
							<label class="control-label" for="input01">反馈主题</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01"
									name="fBtitle" />
							</div>
						</div>


						<div class="control-group">
							<label class="control-label" for="input01">反馈类型</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01"
									name="fBtype" />
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="input01">调查日期</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01"
									name="fBsearch_date" />

							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">反馈日期</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01"
									name="fBback_date" />

							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="select01">客户联系人</label>
							<div class="controls">
								<select id="select02" name="cLMid">
									<option>-- Select client --</option>
									<c:forEach items="${ACL}" var="ACL">

										<option value="${ACL.cLMid}" abc="${ACL.clientId}">${ACL.cLMname}</option>

									</c:forEach>
								</select>
							</div>
						</div>


						<div class="control-group">
							<label class="control-label" for="select01">客户</label>
							<div class="controls">
								<select id="select01" name="clientId">
									<option>-- Select client --</option>
									<c:forEach items="${ACB}" var="ACB">

										<option value="${ACB.client_id}">${ACB.client_name}</option>

									</c:forEach>
								</select>
							</div>
						</div>



						<div class="control-group">
							<label class="control-label" for="select01">我的联系人</label>
							<div class="controls">
								<select id="select04" name="myLMid">
									<option>-- Select client --</option>
									<c:forEach items="${AML}" var="AML">

										<option value="${AML.myLMid}">${AML.myLMname}</option>

									</c:forEach>
								</select>
							</div>
						</div>

						<div class="control-group">
							<label class="control-label" for="textarea">反馈信息</label>
							<div class="controls">
								<textarea class="input-xlarge" id="textarea" rows="4"
									name="fBremack"></textarea>
							</div>
						</div>


						<div class="form-actions">
							<button type="submit" class="btn btn-primary">Create</button>
							<button class="btn">Cancel</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/site.js"></script>


	<script src="${pageContext.request.contextPath }/js/page.js"
		type="text/javascript"></script>
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
				perPage : 3
			});
		});
	</script>

	<script type="text/javascript">
		$(document).ready(
				function() {
					$("#select02").change(
							function() {

								$("#select01").val(
										$(this).find("option:selected").attr(
												"abc"));
							});

				});
	</script>

</body>
</html>
