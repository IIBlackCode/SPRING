<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<table class="table table-boardered">
	<tr>
		<th style="width : 10px"> BNO</th>
		<th>Title</th>
		<th>WRITER</th>
		<th>IP</th>
		<th>REGDATE</th>
		<th style="width : 40px">VIECNT</th>
	</tr>	

	<c:forEach items="${list}" var="boardVO">
		<tr>
			<td>${boardVO.bno}</td>
			<td><a href='/web/board/read?bno=${boardVO.bno}'>${boardVO.title}</a></td>
			<td>${boardVO.writer}</td>
			<td>${boardVO.ip}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}" /></td>
			<td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
		</tr>
	</c:forEach>
</table>

<script>
	var result = '${msg}';
	if(result == 'SUCCESS'){
		alert("처리 완료");
	}
</script>

<%@ include file="../include/footer.jsp" %>




