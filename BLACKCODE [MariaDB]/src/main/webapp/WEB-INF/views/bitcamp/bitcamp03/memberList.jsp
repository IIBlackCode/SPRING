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
        /*DIV Tag*/
        div {
            background-color: antiquewhite;
            border: 1px solid black;
        }
        #wrap_1 {
            width: 1000px;
            height: auto;
            position: absolute;
            left: 50%;
            margin-left: -600px;
        }
        #member_Regist {
            float: left;
            width: 70%;
            height: auto;
        }
        #member_Update {
            float: left;
            width: auto;
        }
        #member_list {
            float: left;
            width: 999px;
        }
        #member_list_table {
            width: 980px;
        }
    </style>
    <script>
        //객체배열 생성
        var memberArr = [];
 
        //객체생성
        var member = {
            id: '',
            pw: '',
            name: ''
        }
        //기본생성자 생성
        function Member(id, pw, name) {
            this.id = id;
            this.pw = pw;
            this.name = name;
 
            this.toString = function() {
                return 'id:' + this.id + ' pw:' + this.pw + ' name:' + this.name;
            }
        }
 
        window.onload = function() {
                
        } //end of windowonLoad
 
        
 
        function inputTable() {
            //회원등록에서 값을 가져온다.
            var member_Regist_id = document.getElementById('member_Regist_id').value;
            var member_Regist_pw = document.getElementById('member_Regist_pw').value;
            var member_Regist_name = document.getElementById('member_Regist_name').value;
 
            //회원리스트 문서객체 생성
            var member_list_table = document.getElementById('member_list_table');
            var member_list_id = document.getElementById('member_list_id').value;
            var member_list_pw = document.getElementById('member_list_pw').value;
            var member_list_name = document.getElementById('member_list_name').value;
 
            //회원리스트table노드에 들어갈 tr, td노드를 생성한다.
            //tr노드 생성
            var tr = document.createElement("tr");
            //td노드 생성
            var index = document.createElement("td")
            var td_id = document.createElement("td");
            var td_pw = document.createElement("td");
            var td_name = document.createElement("td");
            var management = document.createElement("td");
 
            //관리에 들어갈 수정 삭제 input노드
            var input_up = document.createElement("input");
            var input_del = document.createElement("input");
 
            //버튼에 사용할 type 속성 생성
            var onclick_update = document.createAttribute("onClick");
            var onclick_delete = document.createAttribute("onClick");
            var type_up = document.createAttribute("type");
            var type_del = document.createAttribute("type");
 
            //input테그 이름
            input_up.innerHTML = '수정';
            input_del.innerHTML = '삭제';
 
            //h3테그 생성
            var h3_up = document.createElement("h3");
            var h3_del = document.createElement("h3");
 
            //input테그테그에 속성 삽입
            //수정
            input_up.setAttribute('onclick', 'updateMember(' +  + ')');
            input_up.setAttribute('type', 'button');
            input_up.setAttribute('value', '수정');
            //삭제
            input_del.setAttribute('onclick', 'deleteMember(' + memberArr.length + ')');
            input_del.setAttribute('type', 'button');
            input_del.setAttribute('value', '삭제');
 
 
            //td노드에 회원등록 값을 대입
            index.innerHTML = memberArr.length;
            td_id.innerHTML = member_Regist_id;
            td_pw.innerHTML = member_Regist_pw;
            td_name.innerHTML = member_Regist_name;
 
            //table에 tr 추가
            member_list_table.appendChild(tr);
 
            //tr노드에 td노드 추가
            tr.appendChild(index);
            tr.appendChild(td_id);
            tr.appendChild(td_pw);
            tr.appendChild(td_name);
            tr.appendChild(management);
 
            management.appendChild(input_up);
            management.appendChild(input_del);
 
        }
 
        function regist() {
            //회원등록에서 값을 가져온다.
            var member_Regist_id = document.getElementById('member_Regist_id').value;
            var member_Regist_pw = document.getElementById('member_Regist_pw').value;
            var member_Regist_name = document.getElementById('member_Regist_name').value;
 
            //객체생성 test 추후 삭제
            
 
            //객체를 배열에 추가
            memberArr.push(new Member(member_Regist_id, member_Regist_pw, member_Regist_name));
            alert('회원등록');
            
            if((member_Regist_id !== null)&&(member_Regist_pw!==null)&&(member_Regist_name!==null)){
                inputTable();
                var member = new Member(member_Regist_id, member_Regist_pw, member_Regist_name);
            alert('객체 ' + member + ' 추가');
            }else{
                alert('회원가입을 위한 정보를 입력하시오.');
            }
            
        } //End of regist Mehotd
 
 
        function deleteMember(index) {
            alert('Delete Button');
            localStorage.removeItem('user');
            memberArr.splice(index, 1);
            alert('Data of memberArr is deleted ');
        } //End of deleteMember Method
 
        function updateMember() {
            alert('Update Button');
        } //End of updateMember Method
    </script>
 
</head>
 
<body>
 
    <h1>Member Manager</h1>
    <ul id="gnb">
        <li><a href="memberRegForm.html">회원가입</a></li>
        <li><a href="loginForm.html">로그인</a></li>
        <li><a href="myPage.html">마이페이지</a></li>
        <li><a href="memberList.html">회원 리스트</a></li>
 
        <!--#:현재위치-->
    </ul>
 
    <div id="wrap_1">
        <center>
 
 
            <div id="wrap_2">
 
 
 
                <div id="member_Regist">
                    <h2>회원등록</h2>
                    <hr/>
                    <form>
                        <table border="1">
                            <tr>
                                <td>아이디</td>
                                <td>비밀번호</td>
                                <td>이름</td>
                                <td rowspan="2"><input type="button" onclick="regist()" value="등록"></td>
                            </tr>
                            <tr>
                                <td><input id="member_Regist_id" type="text"></td>
                                <td><input id="member_Regist_pw" type="password"></td>
                                <td><input id="member_Regist_name" type="text"></td>
 
                            </tr>
 
                        </table>
                    </form>
                </div>
                <!-- End of member_Regist -->
 
                <div id="member_Update">
                    <center>
                        <h2>회원수정</h2>
                        <hr/>
                        <form>
                            <table border="1">
                                <tr>
                                    <td>이름</td>
                                    <td><input type="text"></td>
                                </tr>
                                <tr>
                                    <td>아이디(Email)</td>
                                    <td><input type="text"></td>
                                </tr>
                                <tr>
                                    <td>비밀번호</td>
                                    <td><input type="password"></td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <center><input type="submit" value="Update"></center>
                                    </td>
 
                                </tr>
                            </table>
                        </form>
                    </center>
 
                </div>
                <!-- End of member_Update -->
 
            </div>
            <!-- End of wrap_2-->
        </center>
        
        <center>
            <div id="member_list">
                <h3>회원리스트</h3>
                <hr>
                <form>
                    <table id="member_list_table" border="1">
                        <tr>
                            <td>index</td>
                            <td id="member_list_id">아이디(이메일)</td>
                            <td id="member_list_pw">비밀번호</td>
                            <td id="member_list_name">이름</td>
                            <td>관리</td>
                        </tr>
 
                    </table>
                </form>
            </div>
        </center>
 
    </div>
    <!-- End of wrap_1 -->
 
 
 
 
</body>
 
</html>