<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update">

<pre>
  UID:<input type="hidden" name="uid" value="${data.uid}">
  USERNAME:<input type="text" name="username" value="${data.username}">
  PASSWORD:<input type="text" name="password" value="${data.password}">
  CITY:<input type="text" name="city" value="${data.city}">
  <input type="submit" value="UPDATE">
 </pre>
 
</form>
</body>
</html>