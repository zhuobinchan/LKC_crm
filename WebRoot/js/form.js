

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



//<![CDATA[
$(function(){
      /*
      *思路大概是先为每一个required添加必填的标记，用each()方法来实现。
      *在each()方法中先是创建一个元素。然后通过append()方法将创建的元素加入到父元素后面。
      *这里面的this用的很精髓，每一次的this都对应着相应的input元素，然后获取相应的父元素。
      *然后为input元素添加失去焦点事件。然后进行用户名、邮件的验证。
      *这里用了一个判断is()，如果是用户名，做相应的处理，如果是邮件做相应的验证。
      *在jQuery框架中，也可以适当的穿插一写原汁原味的javascript代码。比如验证用户名中就有this.value，和this.value.length。对内容进行判断。
      *然后进行的是邮件的验证，貌似用到了正则表达式。
      *然后为input元素添加keyup事件与focus事件。就是在keyup时也要做一下验证，调用blur事件就行了。用triggerHandler()触发器，触发相应的事件。
      *最后提交表单时做统一验证
      *做好整体与细节的处理
      */
      //如果是必填的，则加红星标识.
      $("form :input.required").each(function(){
          var $required = $("<strong class='high'> <font color='red' >*</font></strong>"); //创建元素
          $(this).parent().append($required); //然后将它追加到文档中
      });
      
       //文本框失去焦点后
      $('form :input').blur(function(){
           var $parent = $(this).parent();
           $parent.find(".formtips").remove();
           //验证是否数字，长度要大于8
           if( $(this).is('#phone') ){
               if(!$("#phone").val().match(/^((([0-9]{1}))+\d{7})$/)){
                   var errorMsg = '请输入正确的电话号码';
                   $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
               }else{
                   var okMsg = '✔';
                   $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
               }
           }
           //验证是否数字，长度要大于8
           if( $(this).is('#bank') ){
               if(!$("#bank").val().match(/^((([0-9]{1}))+\d{18})$/)){
                   var errorMsg = '请输入正确的银行账号';
                   $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
               }else{
                   var okMsg = '';
                   $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
               }
           }
           //验证手机号码，长度大于9
           if( $(this).is('#mobile') ){
               if(!$("#mobile").val().match(/^(((13[0-9]{1})|159|153)+\d{8})$/)){
                   var errorMsg = '请输入正确的电话号码';
                   $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
               }else{
                   var okMsg = '✔';
                   $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
               }
           }
           if( $(this).is('#mobile1') ){
               if(!$("#mobile").val().match(/^(((13[0-9]{1})|159|153)+\d{8})$/)){
                   var errorMsg = '✘';
                   $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
               }else{
                   var okMsg = '';
                   $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
               }
           }
           //验证日期格式
           if( $(this).is('#date') ){
               
                   var ds=d.match(/\d+/g),ts=['getFullYear','getMonth','getDate'];
                   var d=new Date(d.replace(/-/g,'/')),i=3;
                   ds[1]--;
                   while(i--)if( ds[i]*1!=d[ts[i]]()) { 
                	   		var errorMsg="✘"
                	   	    $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
                   		};
            
                   var okMsg = '✔';
                   $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
               
           }

          
         
           //验证用户名
           if( $(this).is('#username') ){
                  if( this.value=="" ){
                      var errorMsg = '不能为空';
                      $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
                  }else{
                      var okMsg = '✔';
                      $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
                  }
           }
           
           //验证邮件
           if( $(this).is('#email') ){
              if( this.value=="" || ( this.value!="" && !/.+@.+\.[a-zA-Z]{2,4}$/.test(this.value) ) ){
                    var errorMsg = '请输入正确的E-Mail地址.';
                    $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
              }else{
                    var okMsg = '✔';
                    $parent.append('<span class="formtips onSuccess"><font color="green" size="10px">'+okMsg+'</font></span>');
              }
           }
           if( $(this).is('#email1') ){
               if( this.value=="" || ( this.value!="" && !/.+@.+\.[a-zA-Z]{2,4}$/.test(this.value) ) ){
                     var errorMsg = '✘';
                     $parent.append('<span class="formtips onError"><font color="red">'+errorMsg+'</font></span>');
               }else{
                     var okMsg = '';
                     $parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
               }
            }
      }).keyup(function(){
         $(this).triggerHandler("blur");
      }).focus(function(){
           $(this).triggerHandler("blur");
      });//end blur

      
      //提交，最终验证。
       $('#send').click(function(){
              $("form :input.required").trigger('blur');
              var numError = $('form .onError').length;
              if(numError){
                  return false;
              } 
       });

      //重置
       $('#res').click(function(){
              $(".formtips").remove(); 
       });
})
//]]>



