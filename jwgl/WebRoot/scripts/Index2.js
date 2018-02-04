function openadd() {
    $("#myModalLabel").text("发布公告");
    $("#userName").attr("readonly", false);
    $("#addModal").modal("show");
    $("#add").show();
    $("#edt").hide();
}


function add() {
     $(function(){
        $("form").submit(function(){});
        $("#add").click(function(){
        	   if ($("#title").val() == "") {
        	        layer.tips('不能为空', '#title');
        	        return false;
        	    }
        	   else if ($("#abst").val() == "") {
        	        layer.tips('不能为空', '#abst');
        	        return;
        	    }
        	   else if ($("#url").val() == "") {
        	        layer.tips('不能为空', '#url');
        	        return;
        	    }
        	   else if ($("#publisher").val() == "") {
        	        layer.tips('不能为空', '#publisher');
        	        return;
        	    }
        	   else if ($("#publishtime").val() == "") {
        	        layer.tips('不能为空', '#publishtime');
        	        return;
        	    }
        else $("form").submit();
        });
    });
}