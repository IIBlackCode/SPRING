<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>LoginForm</title>
    
    <style>
        *{
            padding: 0px;
            margin: 0px;
        }
        
        div{
            /*원래 border를 주지 않으나 이해를 위해 사용*/
            border: 1px solid #000000;
        }
        
        #header {
            /*넓이 800 높이 150*/
            width: 800px;
            height: 150px;
        }
        
        #wrap {
            /*넓이 800 높이 :감싸고있기 때문에 값을 주지않아도 상관없다.*/
            width: 800px;
            height: 300px;
            /*감싸는쪽에 부여한다.*/
            overflow: hidden;
        }
        
        #footer {
            width: 800px;
            height: 300px;
        }
        
        .layout_center {
            margin: 0 auto;
        }
        
        #aside {
            float: left;
            width: 200px;
            height: 200px;
        }
        
        #content {
            float: right;
            width: 596px;
            height: 400px;
        }
        
        #popup {
            width: 200px;
            height: 100px;
            background-color: aqua;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-left: -100px;
            margin-left: -50px;
        }
    </style>
    
</head>   
    <body>
       
        <div id="header" class="layout_center">HEADER</div>
        <div id="wrap" class="layout_center">
            <div id="aside">menu</div>
            <div id="content">Content</div>
        </div>
        <div id="footer" class="layout_center">footer</div>
        <div id="popup">안녕</div>
        
      
    </body>
</html>

