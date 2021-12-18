<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2.3 글자 스타일 지정</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>	
	
	<span><h5>[예제 2-9] 물리적 스타일 관련 태그</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>물리적 스타일 관련 태그</title>
			</head>
			<body>
				&lt;b&gt; : <b>진하게 표시</b><br/>
				&lt;i&gt; : <i>기울어진 형태(이탤릭체)로 표시</i><br/>
				&lt;s&gt; : <s>글자 가운데를 통과하는 줄 (취소선)을 표시</s><br/>
				&lt;u&gt; : <u>밑줄을 표시</u><br/>
				&lt;sup&gt; : 글자를<sup>위첨자</sup>로 표시<br/>
				&lt;sub&gt; : 글자를<sub>아래첨자</sub>로 표시<br/>
				&lt;small&gt; : 기본 글자의 크기보다<br/>
								<small>작은 크기의 글자</small>로 표시
			</body>
			</html>
			
		</textarea>
	
		<div style="background-color: #fffaaf; height: 160px;">
			&lt;b&gt; : <b>진하게 표시</b><br/>
			&lt;i&gt; : <i>기울어진 형태(이탤릭체)로 표시</i><br/>
			&lt;s&gt; : <s>글자 가운데를 통과하는 줄 (취소선)을 표시</s><br/>
			&lt;u&gt; : <u>밑줄을 표시</u><br/>
			&lt;sup&gt; : 글자를<sup>위첨자</sup>로 표시<br/>
			&lt;sub&gt; : 글자를<sub>아래첨자</sub>로 표시<br/>
			&lt;small&gt; : 기본 글자의 크기보다<br/>
							<small>작은 크기의 글자</small>로 표시
		</div>

	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<span><h5>[예제 2-10] 논리적 스타일 관련 태그</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>논리적 스타일 관련 태그</title>
			</head>
			<body>
				&lt;cite&gt; : <cite>책, 시, 그림, 영화 등의 작품 제목을 표시</cite><br/>
				&lt;code&gt; : <code>컴퓨터 코드를 표시</code><br/>
				&lt;samp&gt; : <samp>글자 가운데를 통과하는 줄 (취소선)을 표시</samp><br/>
				&lt;var&gt; : <var>변수를 표시</var><br/>
				&lt;dfn&gt; : <dfn>용어에 대한 정의를 표시</dfn><br/>
				&lt;em&gt; : <em>강조하는 내용을 표시</em><br/>
				&lt;strong&gt; : <strong>중요한 내용을 표시</strong><br/>
				&lt;abbr&gt; : <abbr>축약형을 표시</abbr><br/>
				&lt;address&gt; : <address>실제 우편물 주소를 표시</address><br/>
				&lt;kbc&gt; : <kbd>키보드로 입력한 내용임을 표시</kbd><br/>
				&lt;q&gt; : <q>짧은 인용구를 표시</q><br/>
			</body>
			</html>
			
		</textarea>
	
		<div style="background-color: #fffaaf; height: 300px;">
			&lt;cite&gt; : <cite>책, 시, 그림, 영화 등의 작품 제목을 표시</cite><br/>
			&lt;code&gt; : <code>컴퓨터 코드를 표시</code><br/>
			&lt;samp&gt; : <samp>글자 가운데를 통과하는 줄 (취소선)을 표시</samp><br/>
			&lt;var&gt; : <var>변수를 표시</var><br/>
			&lt;dfn&gt; : <dfn>용어에 대한 정의를 표시</dfn><br/>
			&lt;em&gt; : <em>강조하는 내용을 표시</em><br/>
			&lt;strong&gt; : <strong>중요한 내용을 표시</strong><br/>
			&lt;abbr&gt; : <abbr>축약형을 표시</abbr><br/>
			&lt;address&gt; : <address>실제 우편물 주소를 표시</address><br/>
			&lt;kbc&gt; : <kbd>키보드로 입력한 내용임을 표시</kbd><br/>
			&lt;q&gt; : <q>짧은 인용구를 표시</q><br/>
		</div>

	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
		
	<%@ include file="../../link/example02.jsp" %>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>