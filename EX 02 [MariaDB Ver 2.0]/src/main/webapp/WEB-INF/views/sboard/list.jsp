<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>

<%@ include file="../include/header.jsp" %>

<from id="jobForm">
	<input type='hidden' name="page" value=${pageMaker.cri.perPageNum}>
	<input type='hidden' name="perPageNum" value=${pageMaker.cri.perPageNum}>
</from>

<div class='box-body'>
	<select name="searchType">
		<option value="n"
			<c:out value="${cri.searchType == null ? 'selected' : '' }"/>>
			---</option>
		<option value="t"
			<c:out value="${cri.searchType eq 't' ? 'selected' : '' }"/>>
			Title</option>
		<option value="c"
			<c:out value="${cri.searchType eq 'c' ? 'selected' : '' }"/>>
			Content</option>
		<option value="w"
			<c:out value="${cri.searchType eq 'w' ? 'selected' : '' }"/>>
			Writer</option>
		<option value="tc"
			<c:out value="${cri.searchType eq 'tc' ? 'selected' : '' }"/>>
			Title OR Content</option>
		<option value="cw"
			<c:out value="${cri.searchType eq 'cw' ? 'selected' : '' }"/>>
			Content OR Writer</option>
		<option value="tcw"
			<c:out value="${cri.searchType eq 'tcw' ? 'selected' : '' }"/>>
			Title OR Content OR Writer</option>
	</select>
	<!-- 검색 키워드 (keyowrd) 입력 부분 -->
	<input type="text" name="keyword" id="keywordInput"
		value="${cri.keyword }" />
	<button id="searchBtn">Search</button>
	<button id='newBtn'>New Board</button>
</div>

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
			<td><a href='/web/sboard/readPage${pageMaker.makeSearch(pageMaker.cri.page)}&bno=${boardVO.bno}'>${boardVO.title}</a></td>
			<td>${boardVO.writer}</td>
			<td>${boardVO.ip}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}" /></td>
			<td><span class="badge bg-red">${boardVO.viewcnt}</span></td>
		</tr>
	</c:forEach>
</table>

<div class = "text-center">
	<ul class="pagination">
		
		<c:if test="${pageMaker.prev}">
			<li><a href="list${pageMaker.makeSearch(pageMaker.startPage -1)}">&laquo;</a></li>
		</c:if>
		
		<c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
            <li <c:out value="${pageMaker.cri.page == idx?'class = active':''}"/>>
              	<!-- <a href="listPage?page=${idx}">${idx}</a> -->
              	<a href="list${pageMaker.makeSearch(idx)}">${idx}</a>
        	</li>
		</c:forEach>
		
		<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
			<li><a href="list${pageMaker.makeSearch(pageMaker.endPage +1)}">&raquo;</a></li>
		</c:if>
		
	</ul>
</div>

<script>
var result = '${msg}';
if(result == 'SUCCESS'){
	alert("처리 완료");
}
$(document).ready(function(){
	$('#searchBtn').on("click",function(event){
		self.location = "list"
			+ '${pageMaker.makeQuery(1)}'
			+ "&searchType="
			+ $("select option:selected").val()
			+ "&keyword=" + encodeURIComponent($('#keywordInput').val());
	});
	
	$('#newBtn').on("click",function(evt){
		self.location="register";
	});
});
</script>

<%@ include file="../include/footer.jsp" %>
