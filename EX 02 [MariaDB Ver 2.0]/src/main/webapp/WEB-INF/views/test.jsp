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

<h3 class="box-title">Ajax Test Page</h3>
<h2>
	Ajax Test Page1234
</h2>
<div>
	<div>
		REPLYER <input type="text" name="replyer" id='newReplyWriter'>
	</div>
	<div>
		REPLY TEXT <input type="text" name="replyText" id='newReplyText'>
	</div>
	<button id="replyAddBtn">ADD REPLY</button>
</div>

<P>  The time on the server is ${serverTime}. </P>

					</div>
				</div>
			</div><!-- The end of col-md-12 -->
		</div><!-- The end of row -->
	</section><!-- The end of Content -->

<!-- jQuery 2.1.4 -->
<%@include file="include/footer.jsp" %>
<script src="/web/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<script>
	var bno = 15;
	$.getJSON("/web/replies/all/"+bno, function(data) {
		
		var str = "";
		console.log(data.length);
		
		$(data).each(
			function() {
				str += "<li data-rno='"+this.rno+"' class='replyLi'>"
					+ this.rno + ":" + this.replytext
					+ "</li>";
		});
		$("#replies").html(str)
		
	});
	
	$("#replyAddBtn").on("click", function() {
		var replyer 	= $("#newReplyWriter").val();
		var replytext 	= $("#newReplyText").val();
		
		$.ajax({
			type 	: 'post',
			url		: '/web/replies',
			headers	: {
				"Content-Type" : "application/json",
				"X-HTTP-Method-Override" : "POST"
			},
			dataType: 'text',
			data	: JSON.stringify({
				bno			: bno,
				replyer 	: replyer,
				replytext 	: replytext
			}),
			success : function(result) {
				if (result == 'SUCCESS') {
					alert("등록 되었습니다.");
				}
			}
		});
	});
	
	$("#replyAddBtn").on("click", function() {
		var replyer 	= $("#newReplyWriter").val();
		var replytext 	= $("#newReplyText").val();
		
		$.post("/web/replies",
			{replyer:replyer, replytext:replytext},
			function(result) {
				alert(result);
			}
		);
	}); 
	
</script>
</body>
</html>
