<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<!-- Main Content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general from elements -->
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">Read Board</h3>
				</div>
				
				<form role="boardReadform" method="post">
					<input type="hidden" name="bno" value="${boardVO.bno}">
				</form>
				
				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">BNO - [ ${boardVO.ip} ] </label>
						<input type="text" name="title" class="form-control" value="${boardVO.bno}" readonly="readonly">
					</div>
				</div>
				
				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">Title</label>
						<input type="text" name="title" class="form-control" value="${boardVO.title}" readonly="readonly">
					</div>
				</div>
				
				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputPassword1">Content</label>
						<%-- <input type="text" name="title" class="form-control" value="${boardVO.content}" readonly="readonly"> --%>
						<%-- <textarea class="form-control" name="content" rows="3" readonly="readonly">${boardVO.content}</textarea> --%>
						<div class="form-control" style= "height:auto;" name="summernote" readonly="readonly">${boardVO.content}</div>
					</div>
				</div>
				
				<div class="box-body">
					<div class="form-group">
						<label for="exampleInputEmail1">Writer</label>
						<input type="text" name="writer" class="form-control" value="${boardVO.writer}" readonly="readonly">
					</div>
					<table class="form-group">
						<tr>
							<td><h4>지역 : </h4></td>
							<td><h3 id="region_name"></td>
						</tr>
						<tr>
							<td><h4>국가 : </h4></td>
							<td><h3 id="country_name"></td>
						</tr>
						<tr>
							<th><img id="country_flag"/></th>
						</tr>
					</table>
				</div>
				
				<!-- /.box-body -->

				<div class="box-footer">
					<button type="submit" class="btn btn-warning modifyBtn">Modify</button>
					<button type="submit" class="btn btn-danger removeBtn">REMOVE</button>
					<button type="submit" class="btn btn-primary goListBtn">GO LIST</button>
				</div>
				
			</div>
		</div>
	</div>
</section>

<form role="form" action="modifyPage" method="post">
	<input type="hidden" name="bno" value="${board.VO.bno}">
	<input type="hidden" name="page" value="${cri.page}">
	<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
</form>
<%@ include file="script/Summernote.jsp" %>
<%@ include file="script/BoardReadPage.jsp" %>
<%@ include file="../include/footer.jsp" %>




