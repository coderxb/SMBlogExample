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
			<div class="manage_logo"><a href="http://www.jfinal.com">JFinal web framework</a></div>
			<div id="nav">
				<ul>
					<li><a href="${ctxPath }/index.html"><b>首页</b></a></li>
					<li><a href="${ctxPath }/blog.html"><b>Blog管理</b></a></li>
				</ul>
			</div>
		</div>
		<div class="main">
	        <h1>Blog管理 ---&gt; 修改Blog</h1>
			<div class="form_box">
				<form action="${ctxPath }/blog/update" method="post">
				<%@ include file="_form.jsp"%>
				</form>
			</div>
		</div>
	</div>
</body>
</html>

