$(function(){
		$('#key').keyup(f1);
		$('#prev').click(fprev);
		$('#next').click(fnext);
		$('#turn').click(fturn);
});
function getMax(){
	var max;
	var uri='query.bill_do';
	$.get(uri,{'name':""},
		function(data){
			//data
			//执行json字符串
			var p = eval("("+data+")");
			max=p.length;
		},'text');
	max=parseInt(max)/3;
	//alert("page----"+max);
	return max;
}
function fnext(){
	var uri='next.bill_do';
	var cur=$('#txt').val();
	if(cur<getMax()){
		$('#txt').val(parseInt(cur)+1);
		fpage(uri);
	}
}
function fprev(){
	var uri='prev.bill_do';
	var cur=$('#txt').val();
	if(cur>1){
		$('#txt').val(parseInt(cur)-1);
		fpage(uri);
	}
}
function fturn(){
	var uri='prev.bill_do';
	var cur=$('#txt').val();
	if(cur>=1&&cur<=getMax()){
		var uri='page.bill_do';
		fpage(uri);
	}
}
function fpage(uri){
	$.get(uri,{'page':$('#txt').val()},
	function(data){
			//data
			//执行json字符串
			var p = eval("("+data+")");
			var ttr=$("table tr:first");
			ttr.siblings().hide(20);
			for(var i=0;i<p.length;i++){
				var las=$("table tr:last");
				las.after("<tr class='row"+(i%2+1)+"'><td>"+
					p[i].bid+"</td><td>"+
					p[i].bname+"</td><td>"+
					p[i].amount+"</td><td>"+
					p[i].price+"</td><td>"+
					(p[i].hasPayed?"是":"否")+"</td><td>"+
					p[i].sname+"</td><td>"+
					p[i].goodsInfo+"</td><td>"+
					eval(p[i].bill_times)+"</td><td>"+
					"<a href='delBill.jsp?id="+p[i].bid+"' onclick='return confirm('是否确认删除"+p[i].bname+"的信息?');'>删除</a>" +
					"&nbsp;<a href='modiBill.jsp?id="+p[i].bid+"'>修改</a></td></tr>");
			}
	},'text');
}
function f1(){
	var uri='query.bill_do';
	$.get(uri,{'name':$('#key').val()},
		function(data){
			//data
			//执行json字符串
			var p = eval("("+data+")");
			var ttr=$("table tr:first");
			ttr.siblings().hide(20);
			for(var i=0;i<p.length;i++){
				var las=$("table tr:last");
				las.after("<tr class='row"+(i%2+1)+"'><td>"+
					p[i].bid+"</td><td>"+
					p[i].bname+"</td><td>"+
					p[i].amount+"</td><td>"+
					p[i].price+"</td><td>"+
					(p[i].hasPayed?"是":"否")+"</td><td>"+
					p[i].sname+"</td><td>"+
					p[i].goodsInfo+"</td><td>"+
					p[i].bill_times+"</td><td>"+
					"<a href='delBill.jsp?id="+p[i].bid+"' onclick='return confirm('是否确认删除"+p[i].bname+"的信息?');'>删除</a>" +
					"&nbsp;<a href='modiBill.jsp?id="+p[i].bid+"'>修改</a></td></tr>");
			}
		},'text');
}