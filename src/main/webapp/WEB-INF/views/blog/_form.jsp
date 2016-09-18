<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<%@ include file="/common/global.jsp" %>
<fieldset class="solid">
	<legend>创建Blog</legend>
	<input type="hidden" name="id" value="${blog.id}" />
	<div>
		<label>标题</label>
		<input type="text" name="title" value="${blog.title}" />${titleMsg}
	</div>
	<div>
		<label>内容</label>
		<textarea name="content" cols="80" rows="10">${blog.content}</textarea>${contentMsg}
	</div>
	<div>
		<label>&nbsp;</label>
		<input value="提交" type="submit">
	</div>
</fieldset>