$(function(){
    			$('li a').siblings().hide(200);
    			var num=0;
    			$('li a').click(
    				function(){
						if(num%2==0){
							$(this).siblings().hide(200);
						}else{
    						$('li a').siblings().hide(200);
							$(this).siblings().show(200);
						}
						num++;
    				}
				)
});