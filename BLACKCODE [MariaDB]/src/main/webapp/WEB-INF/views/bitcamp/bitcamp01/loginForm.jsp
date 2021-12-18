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
        <li><a href="memberRegForm.html">회원가입</a></li>
        <li><a href="loginForm.html">로그인</a></li>       
        <li><a href="#">마이페이지</a></li>
        <li><a href="#">회원 리스트</a></li>
    <!--#:현재위치-->
    </ul>
    
    <h2>회원가입</h2>
        <hr>
    <form>
        <table>
            <tr>
                <td>아이디(이메일)</td>
                <td><input type=""></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td>사진</td>
                <td><input type="file"></td>
            </tr>
            <tr>
                <td colspan="2"><center><input type="submit"></center></td>
<!--                <td><input type=""></td>-->
            </tr>
        </table>
    </form>
    
    
</body>
</html>

