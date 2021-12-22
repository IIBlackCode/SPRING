<script>
	$(document).ready(function() {
		console.log("[BoardModifyPage.jsp]");

		var formObj = $("form[role='boardModifyform']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
			console.log("[btn-warning]")
			self.location = "/board/listPage?page=${criteria.page}&perPageNum=${criteria.perPageNum}";
		});

		$(".btn-primary").on("click", function() {
			console.log("[btn-primary]")
			formObj.submit();
		});

	});
</script>

