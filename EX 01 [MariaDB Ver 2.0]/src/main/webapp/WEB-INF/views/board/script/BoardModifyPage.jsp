<script>
	$(document).ready(function() {
		console.log("[BoardModifyPage.jsp]");

		var formObj = $("form[role='form']");

		console.log(formObj);

		$(".btn-warning").on("click", function() {
//			self.location = "/web/board/listAll";
			self.location = "/web/board/listPage?page=${cri.page}&perPageNum=${cri.perPageNum}";
			console.log("[btn-warning]");
		});

		$(".btn-primary").on("click", function() {
			console.log("[btn-primary]");
			formObj.submit();;
		});

	});
</script>

