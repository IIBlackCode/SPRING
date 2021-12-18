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
        }
        
        #footer {
            width: 800px;
            height: 300px;
        }
    </style>
    
</head>   
    <body>
       
        <div id="header">HEADER</div>
        <div id="wrap">
            <div id="aside">menu</div>
            <div id="content">Content</div>
        </div>
        <div id="footer">footer</div>
        
      
    </body>
</html>
