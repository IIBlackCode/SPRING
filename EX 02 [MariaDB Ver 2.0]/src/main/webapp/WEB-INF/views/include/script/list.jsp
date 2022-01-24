<script>
$(document).ready(function(){
	console.log("[BoardReadPage.jsp]");
	
	$(".searchBtn").on("click", function(event){
		self.location = "list"
			+'${pageMaker.makeQuery(1)}'
			+"&searchType="
			+$("select option:selected").val()
			+"&keyword="+encodeURIComponent($('#keywordInput').val());
	});
	
	$(".searchBtn").on("click", function(event){
		self.location = "register";
	});
	
});
</script>