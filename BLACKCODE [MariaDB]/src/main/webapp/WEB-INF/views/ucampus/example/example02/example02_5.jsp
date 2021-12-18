<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2.3 글자 스타일 지정</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>	
	
	<span><h5>[예제 2-14] 인라인 요소와 블록 요소</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>순서 없는 목록을 지정하는 ul 태그</title>
			</head>
			<body>
				<div style="background-color: lightblue;">
					<h4>div 태그의 특징 1</h4>
					<p>한 줄 공간을 제공</p>
				</div>
				<div style="background-color: orange; height: 100px">
					<h4>div 태그의 특징 2</h4>
					<p>앞뒤로 자동으로 줄바꿈이 수행됨</p>
				</div>
				<p>span 태그는 <span style="background-color: orange">
				줄바꿈이 없어서 앞뒤 내용이 이어져서 나타난다.</span></p>
			</body>
			</html>
		</textarea>
	</div><!-- The end of Source -->
	
	<div style="background-color: #fffaaf; height: 300px;">
		<div style="background-color: lightblue;">
			<h4>div 태그의 특징 1</h4>
			<p>한 줄 공간을 제공</p>
		</div>
		<div style="background-color: orange; height: 100px">
			<h4>div 태그의 특징 2</h4>
			<p>앞뒤로 자동으로 줄바꿈이 수행됨</p>
		</div>
		<p>span 태그는 <span style="background-color: orange">
		줄바꿈이 없어서 앞뒤 내용이 이어져서 나타난다.</span></p>
	</div>

	<hr style="background-color: gray; height: 2px;">
	
	<%@ include file="../../link/example02.jsp" %>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>