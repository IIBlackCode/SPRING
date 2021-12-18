<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제2장 HTML에서 텍스트 표현</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>	
	
	<!-- 
		주석을 사용하면 차후에 코드의 이해 및 유지 보수 등이 용이해진다.
	 -->
	
		<a href="/"> 
			<span><h4>제2장 HTML에서 텍스트 표현</h4></span>
		</a>
		<ul class="treeview-menu">
			<li><a href="/ucampus/example02/example02_1"></i><h5>2.1 HTML 주석</h5></a></li>
			<li><a href="/ucampus/example02/example02_2"></i><h5>2.2 텍스트 표현</h5></a></li>
			<li><a href="/ucampus/example02/example02_3"></i><h5>2.3 글자 스타일 지정</h5></a></li>
			<li><a href="/ucampus/example02/example02_4"></i><h5>2.4 목록 지정</h5></a></li>
			<li><a href="/ucampus/example02/example02_5"></i><h5>2.5 콘텐츠 그룹핑</h5></a></li>
		</ul>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>