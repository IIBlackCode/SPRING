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
	
	<span><h5>[예제 2-11] 순서 없는 목록을 지정하는 ul 태그</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>순서 없는 목록을 지정하는 ul 태그</title>
			</head>
			<body>
				<h3>목록의 종류</h3>
				<ul>
					<li>순서 없는 목록 &lt;ul&gt; ~ &lt;/ul&gt;</li>
					<li>순서 있는 목록 &lt;ol&gt; ~ &lt;/ol&gt;</li>
					<li>서술 목록 &lt;dl&gt; ~ &lt;/dl&gt;</li>
				</ul>
			</body>
			</html>
		</textarea>
	</div><!-- The end of Source -->
	
	<hr style="color: black;">
	
	<div style="background-color: #fffaaf; height: 100px;">
		<h3>목록의 종류</h3>
		<ul>
			<li>순서 없는 목록 &lt;ul&gt; ~ &lt;/ul&gt;</li>
			<li>순서 있는 목록 &lt;ol&gt; ~ &lt;/ol&gt;</li>
			<li>서술 목록 &lt;dl&gt; ~ &lt;/dl&gt;</li>
		</ul>
	</div>

	<hr style="background-color: gray; height: 2px;">
	
	<span><h5>[예제 2-12] 순서 있는 목록을 지정하는 ol 태그</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>순서 있는 목록을 지정하는 ol 태그</title>
			</head>
			<body>
				<h4>목록의 종류</h4>
				<ol reversed>
					<li>순서 없는 목록 &lt;ul&gt; ~ &lt;/ul&gt;</li>
					<li>순서 있는 목록 &lt;ol&gt; ~ &lt;/ol&gt;</li>
					<li>서술 목록 &lt;dl&gt; ~ &lt;/dl&gt;</li>
				</ol>
				<br/>
				<ol type="a">
					<li>List Item</li>
					<li>순서 없는 목록과 순서 있는 목록에서 공통적으로 사용</li>
					<li value="5">&lt;li value=&quot;5&quot;&gt;를 통해 항목번호가 5번째 알파벳(e) 부터 다시 시작하도록 지정</li>
					<li>들여쓰기 기능, 줄바꿈 기능 포함</li>
					<li>종료태그 없이 시작태그만 사용 가능</li>
				</ol>
			</body>
			</html>
		</textarea>
	</div><!-- The end of Source -->
	
	<hr style="color: black;">
	
	<div style="background-color: #fffaaf; height: 230px;">
		<h4>목록의 종류</h4>
				<ol reversed>
					<li>순서 없는 목록 &lt;ul&gt; ~ &lt;/ul&gt;</li>
					<li>순서 있는 목록 &lt;ol&gt; ~ &lt;/ol&gt;</li>
					<li>서술 목록 &lt;dl&gt; ~ &lt;/dl&gt;</li>
				</ol>
				<br/>
				<ol type="a">
					<li>List Item</li>
					<li>순서 없는 목록과 순서 있는 목록에서 공통적으로 사용</li>
					<li value="5">&lt;li value=&quot;5&quot;&gt;를 통해 항목번호가 5번째 알파벳(e) 부터 다시 시작하도록 지정</li>
					<li>들여쓰기 기능, 줄바꿈 기능 포함</li>
					<li>종료태그 없이 시작태그만 사용 가능</li>
				</ol>
	</div>

	<hr style="background-color: gray; height: 2px;">
	
	<span><h5>[예제 2-13] 서술 목록을 지정하는 di 태그</h5></span>
	<i class="fa fa-dashboard"></i> <span>SOURCE</span> <i class="fa fa-angle-left pull-right"></i>
	
	<div><!-- SOURCE -->
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>서술 목록: di 태그</title>
			</head>
			<body>
				<h4>웹페이지를 작성하기 위해서는</h4>
				<dl>
					<dt><strong> HTML </strong></dt>
					<dd>문서의 내용과 형식을 표현</dd>
					<dt><strong> CSS </strong></dt>
					<dd>콘텐츠의 표현(디자인) 방법을 정의</dd>
					<dt><strong> JavaScript </strong></dt>
					<dd>각종 API를 통해 웹페이지의 동적 상호작용을 제공</dd>
				</dl><br/>
				이러한 부분들의 협업이 필요하다.
			</body>
			</html>
		</textarea>
	</div><!-- The end of Source -->
	
	<hr style="color: black;">
	
	<div style="background-color: #fffaaf; height: 230px;">
		<h4>웹페이지를 작성하기 위해서는</h4>
		<dl>
			<dt><strong> HTML </strong></dt>
			<dd>문서의 내용과 형식을 표현</dd>
			<dt><strong> CSS </strong></dt>
			<dd>콘텐츠의 표현(디자인) 방법을 정의</dd>
			<dt><strong> JavaScript </strong></dt>
			<dd>각종 API를 통해 웹페이지의 동적 상호작용을 제공</dd>
		</dl><br/>
		이러한 부분들의 협업이 필요하다.
	</div>

	<hr style="background-color: gray; height: 2px;">
	
	<%@ include file="../../link/example02.jsp" %>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>