<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>
<style type="text/css">
#style {
 
 text-align: center;
 
 border: activeborder; 
 
 border-color: black;
 
 border: 100px;
 
 box-sizing: inherit;
 
 }

.content {

text-align: center;

color: red;

font-size: 50px;

}

</style>
</head>

<body >
<div class="content">
<% String text=(String)request.getAttribute("msg"); %>
<% if(text!=null) { %>

<%= text %>

<% } %>

</div>

<div class="content">
<% String msg=(String)request.getAttribute("nomsg"); %>

<% if(msg!=null) { %>

<%= msg %>

<% } %>

</div>

<div class="content">
<% String outt=(String)request.getAttribute("Message"); %>

<% if(outt!=null) { %>

<%= outt %>

<% } %>

</div>

<% String msg1=(String)request.getAttribute("Logmsg"); %>
<%if(msg1!=null) {%>
<%= msg1 %>
<% } %>
<form action="Validate" method="post" id="style">

<h1 style="size: 100px; color:green;">Login </h1>

USERNAME:<input type="text" name="name" style="color: black;" > <br> <br>

PASSWORD:<input type="text" name="password" style="color: black;"> <br> <br>

<input type="submit" value="SUBMIT">
</form>

</body>
</html>