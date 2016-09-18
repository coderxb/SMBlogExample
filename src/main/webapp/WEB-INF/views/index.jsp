<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/common/global.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta content="charset=UTF-8" />
<link href="${ctxPath }/resources/css/manage.css" media="screen" rel="stylesheet" type="text/css" />
<script src="${ctxPath }/resources/js/jquery-1.4.4.min.js" type="text/javascript" ></script>
</head>
<body>
	<div class="manage_container">
		<div class="manage_head">
			<div class="manage_logo"><a href="http://www.jfinal.com">Spring Mybatis Blog Example web framework</a></div>
			<div id="nav">
				<ul>
					<li><a href="${ctxPath }/index.html"><b>首页</b></a></li>
					<li><a href="${ctxPath }/blog.html"><b>Blog管理</b></a></li>
				</ul>
			</div>
		</div>
		<div class="main">
<h1>Demo项目首页</h1>
<div class="table_box">
	<p>欢迎来到 Spring Mybatis Blog Example！</p>
	<br><br><br>
	本Demo采用JSP 作为视图文件，您还可以使用FreeMarker、Velocity或自定义类型视图。
	点击<a href="${ctxPath }/blog.html"><b>此处</b></a>开始试用Demo。
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
</div>
		</div>
	</div>
</body>
</html>
