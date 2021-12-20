<!-- include summernote css/js-->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.3/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.3/summernote.js"></script>

<script type="text/javascript">
$(document).ready(function() { 
	$('#summernote').summernote({
		  height: 350,                 // set editor height
		  witdth: 1000,
		  minHeight: 300,             // set minimum height of editor
		  maxHeight: 800,             // set maximum height of editor
		  focus: true,                  // set focus to editable area after initializing summernote
		  callbacks: {
				onImageUpload: function(files, editor, welEditable) {
		            for (var i = files.length - 1; i >= 0; i--) {
		            	sendFile(files[i], this);
		            }
		        }
			}
	});
	
});
function sendCode() {
    $('#summernote_Content').val($('#summernote').summernote('code'));
    $('#summernote_submit_form').submit();
}

$("#summernote_submit_button").on("click",function(){
	sendCode();
})
</script>