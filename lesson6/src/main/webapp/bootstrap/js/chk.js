$(function(){
	$("#uname").blur(
		function(){
			var uname=$(this).val();	
			if(uname.length==0||uname==""){
				alert("用户名不能为空");	
			}else if(uname.length>12){
				alert("用户名长度不能超过12");
			}
		}
	)
	$("#password").blur(
		function(){
			var password=$(this).val();	
			if(password.length<6){
				alert("密码至少6位");	
			}if(password.length>20){
				alert("密码长度不能超过20");
			}
		}
	)
	$("#gender").blur(
		function(){
			var gender=$(this).val();	
			if(gender!="男"&&gender!="女"){
				alert("性别必须为男或女");
			}
		}
	)
	$("#age").blur(
		function(){
			var age=$(this).val();	
			try{
				age=parseInt(age);
			}catch(e){
				alert(e.message);
			}
			if(age<12||age>80){
				alert("年龄必须在12到80之间");
			}
		}
	)
	$("#address").blur(
		function(){
			var address=$(this).val();	
			if(address.length==0){
				alert("地址不能为空");
			}else if(address.length>20){
				alert("地址太长");
			}
		}
	)
	$("#author").blur(
		function(){
			var author=$(this).val();	
			if(author!="common"&&author!="root"){
				alert("权限只能为root和common");
			}
		}
	)
});