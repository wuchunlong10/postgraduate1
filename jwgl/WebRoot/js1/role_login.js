function check() {
     $(function(){
        $("form").submit(function(){});
        $("#check").click(function(){
        	   if ($("#UserName").val() == "") {
        	        layer.tips('����Ϊ��', '#UserName');
        	        return false;
        	    }
        	   else if ($("#PassWord").val() == "") {
        	        layer.tips('����Ϊ��', '#PassWord');
        	        return;
        	    }
        else $("form").submit();
        });
    });
}