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

<P>  The time on the server is ${serverTime}. </P>

					</div>
				</div>
			</div><!-- The end of col-md-12 -->
		</div><!-- The end of row -->
	</section><!-- The end of Content -->

<%@include file="include/footer.jsp" %>
</body>
</html>
