<script>
	$(document).ready(function() {
		console.log("[BoardModifyPage.jsp]");

		var formObj = $("form[role='boardModifyform']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
//			self.location = "/web/board/listPage?page=${criteria.page}&perPageNum=${criteria.perPageNum}";
			self.location = "/web/board/listAll";
			console.log("[btn-warning]");
		});

		$(".btn-primary").on("click", function() {
			console.log("[btn-primary]");
			formObj.submit();;
		});

	});
</script>

