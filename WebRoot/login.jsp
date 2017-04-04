<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 	登录页面
   </head>
  
  <body>
  	<form>
  		<table>
  		<tr><th>用户名:<input  type="text" name="username" value=""></th></tr>
  		<tr><th>密 码:<input type="password" name="password" value=""></th></tr>
  		<tr><th><input type="submit"name="submit" value="登录"></th></tr>
  		</table>
  	</form>
  </body>
</html>
