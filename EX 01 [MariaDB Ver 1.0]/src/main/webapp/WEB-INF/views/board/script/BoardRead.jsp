<script>
				
$(document).ready(function(){
	console.log("[BoardRead.jsp]");
	
	var formObj = $("form[role='boardReadform']");
	
	console.log("formObj :",formObj);
	
	$(".btn-warning").on("click", function(){
		console.log("[Modify]")
		formObj.attr("action", "/board/modify");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".btn-danger").on("click", function(){
		console.log("[REMOVE]")
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click", function(){
		console.log("[LIST ALL]")
		self.location = "/board/listAll";
	});
	
});
</script>





