<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN FAILURE</title>
<style type="text/css">

.fail {

font-size: 100px;

color: blue;



}


</style>
</head>
<body>

<div class="fail">
<% String str=(String)request.getAttribute("loginfail"); %>
<% if(str!=null) { %>
<%= str %>
<%} %>
</div>
<% String msg=(String)request.getAttribute("text"); %>

<div class="fail">
<%if (msg!=null) { %>
<%= msg %>
<% } %>
</div>
</body>
</html>