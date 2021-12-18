<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제3장 HTML에서 텍스트 표현</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>	
	
	<!-- 
		주석을 사용하면 차후에 코드의 이해 및 유지 보수 등이 용이해진다.
	 -->
	
		<a href="/"> 
			<span><h4>제3장 HTML에서 텍스트 표현</h4></span>
		</a>
		<ul class="treeview-menu">
			<li><a href="/ucampus/example03/example03_1"></i><h5> 3.1 이미지 삽입</h5></a></li>
			<li><a href="/ucampus/example03/example03_2"></i><h5> 3.2 하이퍼링크 삽입</h5></a></li>
		</ul>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>