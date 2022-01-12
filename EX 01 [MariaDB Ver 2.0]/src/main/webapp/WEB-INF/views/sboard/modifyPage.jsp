<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" action="modifyPage" method="post" id="summernote_submit_form">
	
	<input type="hidden" name="page" value="${cri.page}">
	<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
	<input type="hidden" name="searchType" value="${cri.searchType}">
	<input type="hidden" name="keyword" value="${cri.keyword}">
	
	<div class="box-body">

		<div class="form-group">
			<label for="exampleInputEmail1">BNO</label> 
			<input type="text" name='bno' class="form-control" value="${boardVO.bno}" readonly="readonly">
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Title</label>
			<input type="text" name='title' class="form-control" value="${boardVO.title}">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Content</label>
			<%-- <textarea class="form-control" name="content" rows="3">${boardVO.content}</textarea> --%>
			<input type="hidden" class="form-control" name="content" id="summernote_Content" >
			<div id="summernote">${boardVO.content}</div>	
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label> <input
				type="text" name="writer" class="form-control"
				value="${boardVO.writer}">
		</div>
	</div>
	<!-- /.box-body -->
</form>


<div class="box-footer">
	<button type="submit" class="btn btn-primary" id="summernote_submit_button">SAVE</button>
	<button type="submit" class="btn btn-warning">CANCEL</button>
</div>
<%@ include file="../include/script/Summernote.jsp" %>
<%@ include file="../include/script/BoardModifyPage.jsp" %>


			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
