<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<div class='searchType'>
	<option value="n" <c:out value="${criteria.searchType == null ? 'selected':''}"/>> --</option>
</div>

<%@ include file="../include/footer.jsp" %>




