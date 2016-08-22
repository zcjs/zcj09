<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示全部</title>
 <link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="bootstrap/js/jquery-1.4.3.js"></script>
<script type="text/javascript">

		$.post("all2.do",function(data){
			var html = "";
			for(var i = 0;i<data.length;i++){
				html+="<tr><td>"+data[i].first_name+"</td><td>"+data[i].last_name+"</td><td>"+data[i].address_id+"</td><td>"+data[i].email+"</td><td>"+data[i].customer_id+"</td></tr>"
			}
			$("#content").html(html);
		});
	
</script>
</head>
<body>
<body>
<a href="add.jsp" style="text-decoration: none">增加用户</a>
	<table align="center" width="1000" border="1" height="180"
		bordercolor="white"  cellpadding="1" cellspacing="1">
		<tr align="center">
			<td>first_name</td>
			<td>last_name</td>
			<td>address_id</td>
			<td>email</td>
			<td>customer_id</td>
			<td>last_update</td>
			<td>操作</td>
		</tr>
		<tbody id="content"></tbody>

	</table>
			
			
		<%-- 	<c:if test="${!empty listUser }">
				<c:forEach items="${listUser}" var="list">
					<tr>
						<td>${list.first_name }</td>
						<td>${list.last_name }</td>
						<td>${list.address_id }</td>
						<td>${list.email }</td>
						<td>${list.customer_id }</td>
						<td>${list.last_update }</td>
						<td><a href="modif/${list.customer_id }" style="text-decoration: none">修改</a>&nbsp<a href="delete/${list.customer_id }"style="text-decoration: none">删除</a></td>
					</tr>				
				</c:forEach>
			</c:if> --%>
	
</body>
</html>