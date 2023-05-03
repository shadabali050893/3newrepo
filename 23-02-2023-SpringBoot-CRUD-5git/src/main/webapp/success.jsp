<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="T" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
 <form name="myform">     <!-- from action changed to name ,as multiple buttons are there -->
 <table border="2">
  <tr>
   <th>SELECT</th>
   <th>USERNAME</th>
   <th>PASSWORD</th>
   <th>CITY</th>
   <th>ACTION</th>
  </tr>
   <T:forEach items="${data}" var="u">
    <tr>
      <td><input type="radio" name="uid" value="${u.uid}"> </td>
      <td> ${u.username}</td>
      <td> ${u.password}</td>
      <td> ${u.city}</td>
      <td><a href="delete?uid=${u.uid}">DELETE</a>||<a href="edit?uid=${u.uid}">EDIT</a></td>
    </tr>  
   </T:forEach>
</table>
<!-- when there are more then 1 button in form use java script to perform action by from name and functions;-->
 <button onclick="deleteUser()">DELETE</button>||<button onclick="edit()">EDIT</button><button onclick="addUser()">ADDUSER</button>
  <button onclick="goLogin()">GO-TO-LOGIN</button>
</form> 
</body>
 <script type="text/javascript">

     function deleteUser(){
    	 
    	 alert("call delete");
 <!--to send request-document obejct used to access form  -->
 <!--document is predefined obejct which represents html tags(dropdown,radio buttons,checkbox etc all....) -->
       document.myform.action="delete";  <!--delete.jsp url-->
       document.myform.submit();
     }

     function edit(){
    	 
    	 alert("call edit");
       document.myform.action="edit";   <!--edit.jsp url-->
       document.myform.submit();
     }
     function addUser(){
    	 document.myform.action="registration";
    	 document.myform.submit();
     }
   function goLogin(){
	   document.myform.action="/";
	   document.myform.submit();
   }

 </script>
</html>