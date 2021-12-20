<script>

$(document).ready(function(){
	console.log("[BoardReadPage.jsp]");
	
	var formObj = $("form[role='boardReadform']");
	
	console.log("formObj :",formObj);
	console.log("this :",this);
	console.log("getUrl() :",getUrl());
	
	$(".btn-warning").on("click", function(){
		console.log("[Modify]")
		formObj.attr("action", "/board/modifyPage");
		formObj.attr("method", "get");		
		formObj.submit();
	});
	
	$(".btn-danger").on("click", function(){
		console.log("[REMOVE]")
		formObj.attr("action", "/board/remove");
		formObj.submit();
	});
	
	$(".btn-primary").on("click", function(){
		console.log("[LIST ALL]")
		self.location = "/board/listPage";
	});
	
	$(".goListBtn").on("click", function(){
		console.log("[LIST ALL]")
		formObj.attr("method", "get");		
		formObj.attr("action", "/board/listPage");
		formObj.submit();
	});
	
	function getUrl(){
	    var apiKey = '0e43cb7135eaf9e2032c6a37a1cc3f6b';
	    var ipAdd = '${boardVO.ip}';
		var regUrl = 'http://api.ipstack.com/'+ipAdd+'?access_key='+apiKey+'&format=1';

	 
	    $.ajax({
	        type:"POST",
	        url:regUrl,
	        dataType : "json",
	        success: function(json){
	 
	            console.log(json); // 리턴받은 json
	            console.log(json.country_name); // 국가이름
	            console.log(json.latitude); // 위도
	            console.log(json.longitude); // 경도
	            console.log(json.region_name); // 지역이름
	            console.log(json.location.country_flag); // 국기 이미지
	            
	        	var region_name = $('#region_name');
	        	$('#region_name').css('color','red').html(json.region_name);
	        	var country_name = $('#country_name');
	        	$('#country_name').css('color','red').html(json.country_name);
	        	var country_flag = $('#country_flag');
	        	$('#country_flag').css('color','red').html(json.country_flag);
	        },
	        error: function(xhr, status, error) {
	            alert(error);
	        }  
	    });
	}
});


</script>





