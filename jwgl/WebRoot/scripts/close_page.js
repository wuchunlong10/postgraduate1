function custom_close(){
	 if(confirm('您确定要关闭本页吗？')){
		window.opener=null;
		window.open('','_self');
		window.close();
		}
	else{
		}
}