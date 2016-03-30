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
		<link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/graph.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	</head>
	<body>
		<div class="container">
			<div class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#"><span class="nav-header">LKC_CRM</span></a>
						
							<ul class="nav pull-right">
								<li>
									<a>管理员${sessionScope.id},欢迎您!</a>
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
							<li class="nav-header">LKC_CRM</li>
							<li>
								<a href="${pageContext.request.contextPath}/servlet/client_Admin_Servlet"><i class="icon-home"></i>客户资料</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/servlet/my_linkman_servlet"><i class="icon-file"></i>联系人资料</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/servlet/linkrecordServlet"><i class="icon-check"></i>联系记录</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/servlet/feedbackUIServlet"><i class="icon-envelope"></i>客户反馈</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath }/servlet/UploadUIServlet"><i class="icon-folder-open"></i>相关文档</a>
							</li>
							<li  class="active">
								<a href="${pageContext.request.contextPath }/servlet/client_analyse_servlet"><i class="icon-white icon-list-alt"></i>客户分析</a>
							</li>

							<li><a
							href="${pageContext.request.contextPath }/servlet/Upload_contract_servlet"><i
								class="icon-white icon-list-alt"></i>合同查看</a></li>
							<li>
								<a href="help.htm"><i class="icon-info-sign"></i> Help</a>
							</li>
						</ul>
					</div>
				</div>
				<div class="span11">
					<h1>
						客户分析
					</h1>
                    <div class="container">

    <section class="main">
        
        <span class="button-label"><font color="blue">大小:</font></span>
        <input type="radio" name="resize-graph" id="graph-small" /><label for="graph-small">小</label>
        <input type="radio" name="resize-graph" id="graph-normal" checked="checked" /><label for="graph-normal">普通</label>
        <input type="radio" name="resize-graph" id="graph-large" /><label for="graph-large">大</label>   

        <span class="button-label"><font color="green">颜色:</font></span>
        <input type="radio" name="paint-graph" id="graph-blue" checked="checked" /><label for="graph-blue">蓝色</label>
        <input type="radio" name="paint-graph" id="graph-green" /><label for="graph-green">绿色</label>
        <input type="radio" name="paint-graph" id="graph-rainbow" /><label for="graph-rainbow">彩色</label>

        <span class="button-label"><font color="red">客户等级:</font></span>
        <input type="radio" name="fill-graph" id="f-none" /><label for="f-none">None</label>
        <input type="radio" name="fill-graph" id="f-product1" checked="checked" /><label for="f-product1">等级1</label>
        <input type="radio" name="fill-graph" id="f-product2" /><label for="f-product2">等级2</label>
        <input type="radio" name="fill-graph" id="f-product3" /><label for="f-product3">等级3</label>

        <ul class="graph-container">
            <li>
                <span>饮食行业</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">25</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>教育行业</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">50</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>医疗行业</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">75</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>科技行业</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">100</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>服务行业</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">50</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <ul class="graph-marker-container">
                    <li style="bottom:25%;"><span>25%</span></li>
                    <li style="bottom:50%;"><span>50%</span></li>
                    <li style="bottom:75%;"><span>75%</span></li>
                    <li style="bottom:100%;"><span>100%</span></li>
                </ul>
            </li>
        </ul>

    </section>

</div>
				</div>
			</div>
		</div>

		<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/site.js"></script>
		<script src="${pageContext.request.contextPath }/js/form.js"></script>
		<script src="${pageContext.request.contextPath }/js/modernizr.custom.04022.js"></script>
	</body>
</html>
