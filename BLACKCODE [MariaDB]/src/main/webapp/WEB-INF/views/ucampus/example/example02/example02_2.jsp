<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>2.2 텍스트 표현</title>
</head>
<body>
	<%@ include file="../../../include/header.jsp" %>	
	
	<span><h5>2.2 텍스트 표현</h5></span>
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-2] 줄바꿈을 수행하는 '<'br'>' 태그</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>줄바꿈 br 태그</title>
			</head>
			<body>
				br 태그는 문서의 어느 곳에서든 강제로 줄바꿈을 수행한다. <br/>
				여러 줄을 바꾸는 경우 원하는 개수만큼을 연속적으로 사용한다.
				<br/><br/><br/>
				br을 세 번 사용했으므로 위 문장 사이에는 빈 두줄이 나타난다.
			</body>
			</html>
		</textarea>
			
		<hr style="color: black;">
		
		<div style="background-color: #fffaaf; height: 100px;">
			br 태그는 문서의 어느 곳에서든 강제로 줄바꿈을 수행한다. <br/>
			여러 줄을 바꾸는 경우 원하는 개수만큼을 연속적으로 사용한다.
			<br/><br/><br/>
			br을 세 번 사용했으므로 위 문장 사이에는 빈 두줄이 나타난다.
		</div>
		
	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-3] 단락을 나누는 P 태그</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>단락을 나누는 P 태그</title>
			</head>
			<body>
				HTML에서 줄을 바꾸기 위해서는 &lt;br&gt; 태그를 사용하고,
				<p>단락을 구분하기 위해서는 &lt;p&gt; 태그를 사용한다.</p>
				<p><p><p><p> p태그를 연속해서 여러 번 적용하면 어떻게 될까요?
				단락의 내용을 정렬하기 위해서는 CSS를 사용한다.
				</p></p></p></p>
			</body>
			</html>
		</textarea>
			
		
		<div style="background-color: #fffaaf; height: 100px;">
			HTML에서 줄을 바꾸기 위해서는 &lt;br&gt; 태그를 사용하고,
				<p>단락을 구분하기 위해서는 &lt;p&gt; 태그를 사용한다.</p>
				<p><p><p><p> p태그를 연속해서 여러 번 적용하면 어떻게 될까요?
				단락의 내용을 정렬하기 위해서는 CSS를 사용한다.
				</p></p></p></p>
		</div>
		
	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-4] 공백 및 특수 문자의 입력</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>공백 및 특수 문자의 입력</title>
			</head>
			<body>
				<p>HTML 문서는 띄어쓰기, 줄바꿈이 적용되지 않는다.<br/>
				&nbsp;공백을 연속해서 삽입해야 하는 경우<br/>
				&nbsp;&nbsp;스페이스바를 아무리 사용해도<br/>
				&nbsp;&nbsp;&nbsp;결국은 하나의 공백으로 브라우저에 표시된다.<br/>
				&nbsp;&nbsp;&nbsp;&nbsp;이때 &amp;nbsp;를 적용하면 된다.<br/>
				<p>HTML에서 특수 문자로는 <br/>
				&lt;, &gt;, &amp;, &quot; 등의 예약어가 있으며,<br/>
				키보드로 직접 입력할 수 없는 &#x00a9;,&#x2661;,&#x261e;등도 있습니다.</p>
			</body>
			</html>
		</textarea>
			
		
		<div style="background-color: #fffaaf; height: 200px;">
			<p>HTML 문서는 띄어쓰기, 줄바꿈이 적용되지 않는다.<br/>
			&nbsp;공백을 연속해서 삽입해야 하는 경우<br/>
			&nbsp;&nbsp;스페이스바를 아무리 사용해도<br/>
			&nbsp;&nbsp;&nbsp;결국은 하나의 공백으로 브라우저에 표시된다.<br/>
			&nbsp;&nbsp;&nbsp;&nbsp;이때 &amp;nbsp;를 적용하면 된다.<br/>
			<p>HTML에서 특수 문자로는 <br/>
			&lt;, &gt;, &amp;, &quot; 등의 예약어가 있으며,<br/>
			키보드로 직접 입력할 수 없는 &#x00a9;,&#x2661;,&#x261e;등도 있습니다.</p>
		</div>
		
	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-5] 수평선을 그리는 hr 태그</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>수평선을 그리는 hr 태그</title>
			</head>
			<body>
				hr 태그는 수평선을 그리는 태그이다.
				<hr/>
				단락 단위로 주제를 바꿀 때 사용한다.
			</body>
			</html>
		</textarea>
			
		
		<div style="background-color: #fffaaf; height: 100px;">
			hr 태그는 수평선을 그리는 태그이다.
			<hr/>
			단락 단위로 주제를 바꿀 때 사용한다.
		</div>
		
	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-6] 제목을 지정하는 hn 태그</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>제목을 지정하는 hn 태그</title>
			</head>
			<body>
				<h1>제목의 크기를 1로 지정한 경우</h1>
				<h2>제목의 크기를 2로 지정한 경우</h2>
				<h3>제목의 크기를 3로 지정한 경우</h3>
				<h4>제목의 크기를 4로 지정한 경우</h4>
				<h5>제목의 크기를 5로 지정한 경우</h5>
				<h6>제목의 크기를 6로 지정한 경우</h6>
			</body>
			</html>
		</textarea>
			
		
		<div style="background-color: #fffaaf; height: 250px;">
			<h1>제목의 크기를 1로 지정한 경우</h1>
			<h2>제목의 크기를 2로 지정한 경우</h2>
			<h3>제목의 크기를 3로 지정한 경우</h3>
			<h4>제목의 크기를 4로 지정한 경우</h4>
			<h5>제목의 크기를 5로 지정한 경우</h5>
			<h6>제목의 크기를 6로 지정한 경우</h6>
		</div>
		
	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-7] 입력 형태를 유지하여 출력하는 pre 태그</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>pre 태그</title>
			</head>
			<body>
				<pre>
				- pre 태그는 'preformatted text'의 약자이다.
				- 문자가 입력된 형식을 그대로 유지하여 웹브라우저로 출력한다.
				
					--공백, 줄바꿈 등을 자유롭게 입력할 수 있다.
					
				- 특수 문자가 많은 텍스트(예, 프로그램 소스)를 표시할 때 유용
				</pre>
			</body>
			</html>
		</textarea>
			
		
		<div style="background-color: #fffaaf; height: 250px;">
			<pre>
				- pre 태그는 'preformatted text'의 약자이다.
				- 문자가 입력된 형식을 그대로 유지하여 웹브라우저로 출력한다.
				
					--공백, 줄바꿈 등을 자유롭게 입력할 수 있다.
					
				- 특수 문자가 많은 텍스트(예, 프로그램 소스)를 표시할 때 유용
			</pre>
		</div>
		
	</div><!-- The end of Source -->
	
	<hr style="background-color: gray; height: 2px;">
	
	<div><!-- SOURCE -->
		<i class="fa fa-dashboard"></i> <span>[예제 2-8] 단락의 들여쓰기를 위한 backquote 태그</span> <i class="fa fa-angle-left pull-right"></i>
		<textarea class="form-control" name="content" rows="3" readonly="readonly" style="height: 300px">
			
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="UTF-8">
			<title>단락의 들여쓰기를 위한 backquote 태그</title>
			</head>
			<body>
				좋아하는 것과 사랑하는 것
				<blockquote cite="http://www.heartsaying.com">
				&quot;꽃을 좋아하는 사람은&quot;<br/>
				그 꽃을 꺾지만,<br/>
				&quot;꽃을 사랑하는 사람은&quot;<br/>
				그 꽃에 물을 줍니다.
				</blockquote>
				오늘도 누군가를 좋아하고 사랑하며 감사하기를 소망한다.
			</body>
			</html>
		</textarea>
			
		
		<div style="background-color: #fffaaf; height: 250px;">
			좋아하는 것과 사랑하는 것
			<blockquote cite="http://www.heartsaying.com">
			&quot;꽃을 좋아하는 사람은&quot;<br/>
			그 꽃을 꺾지만,<br/>
			&quot;꽃을 사랑하는 사람은&quot;<br/>
			그 꽃에 물을 줍니다.
			</blockquote>
			오늘도 누군가를 좋아하고 사랑하며 감사하기를 소망한다.
		</div>
		
	</div><!-- The end of Source -->

	<hr style="background-color: gray; height: 2px;">
	
	<%@ include file="../../link/example02.jsp" %>
	<%@ include file="../../../include/footer.jsp" %>
</body>
</html>