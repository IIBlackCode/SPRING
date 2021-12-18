<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3.2 하이퍼링크 삽입</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>	
	
	<span><h5>[예제 3-3] 하이퍼링크 삽입</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>하이퍼링크 a 태그</title>
			</head>
			<body>
				<a href="http://www.knou.ac.kr">한국방송통신대학교</a><br/><br/>
				<a href="http://www.knou.ac.kr">한국방송통신대학교</a><br/><br/>
			</body>
			</html>
			
		</textarea>
	</div><!-- The end of Source -->
	
	<div style="background-color: #fffaaf; height: 300px;">
		<!-- (1) HTML 문서와 같은 폴더에 있는 경우 -->
		<img src="/resources/ucampus/images/cat.jpg"  alt="고양이" style="height: 100px; width: 100px" />
		<!-- 
			(2) 절대경로의 경우 
			(3) 상대경로의 경우 
		-->	
	</div>

	<hr style="background-color: gray; height: 2px;">
	
	<span><h5>[예제 3-2] img 태그의 width, height, alt 속성</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>img 태그의 width, height, alt 속성</title>
			</head>
			<body>
			<!-- (1) HTML 문서와 같은 폴더에 있는 경우 -->
			<img src="/resources/ucampus/images/cat.jpg" border="1" /><br/>
			<img src="/resources/ucampus/images/cat.jpg" width="100" height="100" border="1" />
			<img src="/resources/ucampus/images/cat.jpg" width="100" border="1" />
			<img src="/resources/ucampus/images/cat.jpg" width="20%" border="1" /><br/>
			<img src="/resources/ucampus/images/cat.jpg0" alt="이미지가 없을 경우 텍스트로 대체" border="1" />
			</body>
			</html>
			
		</textarea>
	</div><!-- The end of Source -->
	
	<div style="background-color: #fffaaf; height: 1000px;">
		<img src="/resources/ucampus/images/cat.jpg" border="1" /><br/>
		<img src="/resources/ucampus/images/cat.jpg" width="100" height="100" border="1" />
		<img src="/resources/ucampus/images/cat.jpg" width="100" border="1" />
		<img src="/resources/ucampus/images/cat.jpg" width="20%" border="1" /><br/>
		<img src="/resources/ucampus/images/cat.jpg0" alt="이미지가 없을 경우 텍스트로 대체" border="1" />
	</div>
	<%@ include file="../../link/example03.jsp" %>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>