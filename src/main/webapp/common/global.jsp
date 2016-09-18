<%--标签 --%>
<%@ page language="java" isELIgnored="false"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page session="false" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--本地测试时的path --%>
<c:if test="${pageContext.request.contextPath!='' && pageContext.request.contextPath!='/'}">
    <c:set var="ctxPath" value="${pageContext.request.contextPath}" />
</c:if>