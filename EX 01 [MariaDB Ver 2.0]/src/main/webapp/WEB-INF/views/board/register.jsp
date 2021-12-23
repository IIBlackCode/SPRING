<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>

<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box">
				<div class="box-header with-border">

<h3 class="box-title">REGISTER BOARD</h3>

<form role="form" method="post" id="">
	<div class="box-body"><!-- //box-body -->
	
		<div class="form-group">
			<label for="exampleInputEmail1">Title</label>
			<input type="text" name='title' class="from-control" placeholder="Enter Title">
		</div>
		
		<div class="form-group">
			<label for="exampleInputEmail1">Content</label>
			<!-- <textarea class="form-control" name="content" row="3" placeholder="Enter."></textarea> -->
			<input type="hidden" class="form-control" name="content" id="summernote_Content" >
			<div id="summernote"></div>	
		</div>
		
		<div class="form-group">
			<label for="exampleInputEmail1">Writer</label>
			<input type="text" name='writer' class="from-control" placeholder="Enter Title">
		</div>
		
		<div class="form-group">
			<button type="submit" class="btn btn-primary" id="summernote_submit_button">Submit</button>
		</div>
		
	</div><!-- box-body// -->
</form>

				</div>
			</div>
		</div><!-- The end of col-md-12 -->
	</div><!-- The end of row -->
</section><!-- The end of Content -->
<%@ include file="script/Summernote.jsp" %>
<%@ include file="../include/footer.jsp" %>