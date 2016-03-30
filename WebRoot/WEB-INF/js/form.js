

function validator(){
			  if(confirm("确认要提交本表单吗？")==true)
			    return true;
			  else
			    return false;
}

function del(){ 
	if(confirm("确定删除该记录？")){ 
	parent.window.location="执行删除.jsp"; 
	return true; 
	} 
	return false; 
}


