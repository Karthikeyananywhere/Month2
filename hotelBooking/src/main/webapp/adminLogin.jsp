<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<style type="text/css">

.error {
 color: red;

}

</style>
</head>
<body>

<table>
<form action="Admin" method="post">

<tr>

<th> USERNAME :</th>
<td> <input type="text" name="userName"></td>
</tr>

<tr>
<th>PASSWORD :</th>
<td> <input  type="text" name="password"> </td>
</tr>

<tr>

<td colspan="2">

<input type="submit" value="LOGIN">
</td>
</tr>


</form>



</table>
<% String pwd=(String)request.getAttribute("PASSWORD"); %>

<% if(pwd!=null) { %>

<p class="error"><%= pwd %></p>

<% } %>

<% String admin=(String)request.getAttribute("NOADMIN"); %>
<% if(admin!=null) { %>
<p class="error"><%=admin %></p> 

<% } %>


</body>
</html>