<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2.1 HTML 주석</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>
	
	<span><h5>2.1 HTML 주석</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>Insert title here</title>
			</head>
			<body>
				<!-- 
					주석을 사용하면 차후에 코드의 이해 및 유지 보수 등이 용이해진다.
	 			-->
			</body>
			</html>
		</textarea>
	</div><!-- The end of Source -->
	
	<hr style="color: black;">
	
	<div style="background-color: #fffaaf; height: 100px;" >
		<!-- 
			주석을 사용하면 차후에 코드의 이해 및 유지 보수 등이 용이해진다.
	 	-->
	</div>

	<hr style="color: black;">
	
	<%@ include file="../../link/example02.jsp" %>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>