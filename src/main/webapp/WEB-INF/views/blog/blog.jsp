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
			<h1>Blog管理&nbsp;&nbsp;
			<a href="${ctxPath }/blog/add.html">创建Blog</a>
			</h1>
			<div class="table_box">
				<table class="list">
					<tbody>
						<tr>
							<th width="4%">id</th>
							<th width="35%">标题</th>
							<th width="12%">操作</th>
						</tr>
						<c:forEach items="${page.dataList}" var="x">
						<tr>
							<td style="text-align:left;"><c:out value="${x.id}" default=""/></td>
							<td style="text-align:left;">${x.title}</td>
							<td style="text-align:left;">
								&nbsp;&nbsp;<a href="${ctxPath }/blog/delete/${x.id}">删除</a>
								&nbsp;&nbsp;<a href="${ctxPath }/blog/edit/${x.id}">修改</a>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<c:set var="currentPage" value="${page.pageNo}" />
				<c:set var="totalPage" value="${page.totalPages}" />
				<c:set var="actionUrl" value="${ctxPath }/blog/" />
				<c:set var="urlParas" value="" />
				<%@ include file="/common/_paginate.jsp"%>
			</div>
		</div>
	</div>
</body>
</html>