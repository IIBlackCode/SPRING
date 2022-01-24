<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box">
				<div class="box-header with-border">

<h3 class="box-title">LIST ALL PAGE</h3>

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

				</div>
			</div>
		</div><!-- The end of col-md-12 -->
	</div><!-- The end of row -->
</section><!-- The end of Content -->

<%@ include file="script/listAll.jsp" %>
<%@ include file="../include/footer.jsp" %>




