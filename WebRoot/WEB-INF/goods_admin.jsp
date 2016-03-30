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
							<li class="nav-header">商品管理</li>
							<li class="active">
								<a href="projects.htm"><i class="icon-folder-open"></i> 商品资料</a>
							</li>
                            <li class="nav-header">
								采购管理
							</li>
							
							<li>
								<a href="files.htm"><i class="icon-file"></i>采购分析</a>
							</li>
                            <li class="nav-header">
								销售管理
							</li>
							<li>
								<a href="activity.htm"><i class="icon-white icon-list-alt"></i>销售分析</a>
							</li>
							
							
							
						</ul>
					</div>
				</div>
				<div class="span9">
					<h1>
						商品列表</h1>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									商品编号
								</th>
								<th>
									商品名称
								</th>
								<th>
									商品价格
								</th>
                                <th>
									修改
								</th>
                                <th>
									删除
								</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="goods" items="${goods}">
							<tr>
								<td>
									${goods.gid}
								</td>
								<td>
									${goods.gname}
								</td>
								<td>
									${goods.gprice}
								</td>
								<td>
									<a href="${pageContext.request.contextPath }/servlet/goods_search_servlet?gid=${goods.gid}" class="view-link">修改</a>
								</td>
                                <td>
									<a onclick="return del()" href="${pageContext.request.contextPath }/servlet/goods_delete_servlet?gid=${goods.gid}" class="view-link">删除</a>
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
                    <div>
                            <a class="toggle-link" href="#new-project"><i class="icon-plus"></i>添加新商品</a>
					<form id="new-project" class="form-horizontal hidden" action="${pageContext.request.contextPath}/servlet/goods_add_servlet" method="post">
						<fieldset>
							<legend>商品基本资料</legend>
							<div class="control-group">
								<label class="control-label" for="input01">商品编码</label>
								<div class="controls">
									<input type="text" class="input-xlarge" name="gid" id=goodsId" />
								</div>
							</div>

   							<div class="control-group">
								<label class="control-label" for="input01">商品名称</label>
								<div class="controls">
									<input type="text" class="input-xlarge" name="gname" id="goodsId" />
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="input01">商品价格</label>
								<div class="controls">
									<input type="text" class="input-xlarge" name="gprice" id="goodsId" />
								</div>
							</div>

							<div class="form-actions">
								<button type="submit" class="btn btn-primary">添加</button> 
								<a href="${pageContext.request.contextPath}/servlet/goods_Admin_Servlet">
                    <input type="button" class="btn" value="取消"/></a>
							</div>
						</fieldset>
					</form>
                    </div>
				</div>
			</div>
		</div>
		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/site.js"></script>
		<script src="${pageContext.request.contextPath }/js/form.js"></script>	
	</body>
</html>
