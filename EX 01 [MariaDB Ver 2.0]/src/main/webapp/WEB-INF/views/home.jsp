<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<%@include file="include/header.jsp" %>

	<section class="content">
		<div class="row">
			<div class="col-md-12">
				<div class="box">
					<div class="box-header with-border">

<h3 class="box-title">HOME PAGE</h3>
<h1>
	Hello world!  
</h1>

<h1>
	<h1>SampleController1</h1>
	<a href="Sample/SampleController1/test1">test1</a> 
	<a href="Sample/SampleController1/test2">test2</a> 
	<a href="Sample/SampleController1/test3">test3</a> 
	<a href="Sample/SampleController1/test4">test4</a> 
	<a href="Sample/SampleController1/test5">test5</a> 
	<h1>SampleController2</h1>
	<a href="Sample/SampleController2">SampleController2</a>
	<h1>SampleController3</h1>
	<a href="Sample/SampleController3/SAMPLE">SAMPLE</a> 
	<h1>SampleController4</h1>
	<a href="Sample/SampleController4/TEST1">TEST1</a> 
	<a href="Sample/SampleController4/TEST2">TEST2</a> 
	<h1>SampleController5</h1>
	<a href="Sample/SampleController5/doJSON_TEST">doJSON_TEST</a> 
</h1>

<P>  The time on the server is ${serverTime}. </P>

					</div>
				</div>
			</div><!-- The end of col-md-12 -->
		</div><!-- The end of row -->
	</section><!-- The end of Content -->

<%@include file="include/footer.jsp" %>
</body>
</html>
