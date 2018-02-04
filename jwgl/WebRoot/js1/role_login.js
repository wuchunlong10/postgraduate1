function check() {
     $(function(){
        $("form").submit(function(){});
        $("#check").click(function(){
        	   if ($("#UserName").val() == "") {
        	        layer.tips('不能为空', '#UserName');
        	        return false;
        	    }
        	   else if ($("#PassWord").val() == "") {
        	        layer.tips('不能为空', '#PassWord');
        	        return;
        	    }
        else $("form").submit();
        });
    });
}