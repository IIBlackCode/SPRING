<script>

$(document).ready(function(){
	console.log("[BoardReadPage.jsp]");
	
	var formObj = $("form[role='boardReadform']");
	
	console.log("formObj :",formObj);
	console.log("this :",this);
	
	$(".btn-warning").on("click", function(){
		console.log("[Modify]")
		formObj.attr("method", "get");		
		formObj.attr("action", "/web/sboard/modifyPage");
		formObj.submit();
	});
	
	$(".btn-danger").on("click", function(){
		console.log("[REMOVE]")
		formObj.attr("action", "/web/sboard/removePage");
		formObj.submit();
	});
	
	$(".btn-primary").on("click", function(){
		console.log("[LIST ALL]")
		self.location = "/web/sboard/list";
	});
	
	$(".goListBtn").on("click", function(){
		console.log("[LIST ALL]")
		formObj.attr("method", "get");		
		formObj.attr("action", "/web/sboard/listPage");
		formObj.submit();
	});
	
});
</script>
