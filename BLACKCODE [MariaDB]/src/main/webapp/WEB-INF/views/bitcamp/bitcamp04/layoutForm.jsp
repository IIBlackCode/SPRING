<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>LoginForm</title>
 
    <style>
        /*All*/
        * {
            padding: 0px;
            margin: 0px;
        }
        /*Tag*/
        div {
            /*원래 border를 주지 않으나 이해를 위해 사용*/
            /*
            border: 1px solid #999999;
            */
        }
        a{
            color: black;
            text-decoration: none;
        }
        /**BODYBOX**/
        #bodybox {
            border: 10px solid #dddddd;
            width: 800px;
            height: auto;
            position: absolute;
            left: 50%;
            margin-left: -400px;
        }
        /**HEADER**/
        /**HEADER_id**/
        #header {
            /*넓이 800 높이 150*/
            width: auto;
            height: 50px;
            padding: 40px;
            border-radius: 10px 10px 0px 0px;
            background-color: white
        }
        #header>h4 {
            color: #999999;
        }
        #header_line{
            border-radius: 50px 50px 0px 0px;
        }
        /**HEADER_Class**/
        /**MENU**/
        /**MENU_id**/
        #menu {
            width: auto;
            padding: 15px;
            background-color: white;
        }
        #menu>div {
            float: right;
            margin-top: 1px;
            /*            border: 1px solid #dddddd;*/
            padding-right: 5px;
        }
        /**MENU_Class**/
        /**Wrap**/
        /**Wrap_id**/
        #wrap {
            /*넓이 800 높이 :감싸고있기 때문에 값을 주지않아도 상관없다.*/
            width: 75%;
            height: auto;
/*            background-color: antiquewhite;*/
            background-color: white;
        }
        #aside {
            float: right;
            width: 20%;
            height: auto;
            margin-right: 1%;
            list-style: none;
            background-color: white;
        }
        #aside>center>ul>li {
            list-style: none;
        }
        #content_1 {
            float: left;
            width: 70%;
            height: auto;
            padding: 30px;
            background-color: white;
        }
        #content_2 {
            float: left;
            width: 70%;
            height: auto;
            padding: 30px;
            background-color: white;
        }
        /**Wrap_Class**/
        
        /**Footerd**/
        /**Footer_id**/
        #footer {
            padding-left: 25px;
            float: left;
            width: 800px;
            border-radius: 0px 0px 10px 10px;
            background-color: white;
        }
        #footer>h4 {
            color: blue;
        }
        /*Footer_Class*/
        
        
        /*Class*/
        .layout_center {
            margin: auto;
        }
        .layout_center>h1 {
            margin-left: 40px;
            margin-top: 37px;
        }
        .layout_center>h4 {
            margin-left: 40px;
        }
        #menu>ul {
            list-style: none;
            display: inline-block;
        }
        #menu>ul>li {
            float: left;
            list-style: none;
            padding: 3.5px
        }
    </style>
 
</head>
 
<body>
 
    <div id="bodybox">
        <!--Header-->
        <div id="header" class="layout_center">
            <div id="header_line">
            <h1>HTML5 Example Preview</h1>
            <h4>BitCamp</h4>
            </div>
        </div>
        <!--End of Head-->
 
        <!--Menu-->
        <div id="menu">
            <hr>
            <form id="menu" class="layout_center">
                <ul>
                    <li><a href="#">HTML5</a></li>
                    <li><a href="#">CSS3</a></li>
                    <li><a href="#">JavaScript</a></li>
 
                </ul>
 
                <!--Search-->
                <div id="menu_div">
                    <input id="sc_box" type="text">
                    <input id="sc_button" type="button" value="Search">
                </div>
                <!--End of Search-->
            </form>
            <hr>
        </div>
        <!--End of Menu-->
 
       
        <!-- Category -->
        <div id="aside">
            <center>
                <!--ul>(li>a)*5 + tabkey-->
                <ul>
                    <h3>Category</h3>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                </ul>
                <ul>
                    <h3>NewWright</h3>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                    <li><a href="#">Data</a></li>
                </ul>
            </center>
        </div>
        <!-- End of Category -->
        
       
        
        <!-- Content_1 -->
        <div id="content_1">
            <h1>HTML5 개요와 활용</h1>
            <h5>2018年 8月 26日</h5>
            <img src="/image/1.png" alt="430X280">
            <p id="article">
                내용 그 무언가 심오했던 그것
            </p>
            <hr>
        </div>
        <!-- End of Content_1 -->
    
        <!-- Content_2 -->
        <div id="content_2">
            <h1>HTML5 응용과 실습</h1>
            <h5>2018年 8月 26日</h5>
            <img src="/image/1.png" alt="430X280">
            <p id="article">
                내용 그 무언가 심오했던 그것
            </p>
            <hr>
        </div>
        <!-- End of Content_2 -->
        
        <!-- footer-->
        <div id="footer">
            <h4>Created By SCT</h4>
        </div>
        <!-- End of footer-->
        
        
 
    </div>
    <!--End of BodyBox-->
 
 
</body>
</html>
