<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>OpenProject</title>
    <style>
        #gnb {
            overflow: hidden;
            border-top: 1px solid #333333;
            border-bottom: 1px solid #333333;
        }
        
        /*ID gnb인 ul의 자손 선택*/
        #gnb>li {
            float: left;
            list-style: none;
            padding: 10px;
        }
    </style>
    
</head>   
<body>
    <h1>OpenProject</h1>
    <ul id="gnb">
        <li><a href="/bitcamp/bitcamp01/memberRegForm">회원가입</a></li>
        <li><a href="/bitcamp/bitcamp01/loginForm">로그인</a></li>       
        <li><a href="#">마이페이지</a></li>
        <li><a href="#">회원 리스트</a></li>
        
    <!--#:현재위치-->
    </ul>
    <li><a href="/bitcamp/bitcamp01/memberRegForm">회원가입</a></li>
        <li><a href="/bitcamp/bitcamp01/loginForm">로그인</a></li>       
        <li><a href="#">마이페이지</a></li>
        <li><a href="#">회원 리스트</a></li>
    
</body>
</html>