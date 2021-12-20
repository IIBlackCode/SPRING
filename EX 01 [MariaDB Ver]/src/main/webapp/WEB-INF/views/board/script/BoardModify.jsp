<script>
	$(document).ready(function() {
		console.log("[BoardRead.jsp]");

		var formObj = $("form[role='boardModifyform']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
			console.log("[btn-warning]")
			self.location = "/board/listAll";
		});

		$(".btn-primary").on("click", function() {
			console.log("[btn-primary]")
			formObj.submit();
		});

	});
</script>

