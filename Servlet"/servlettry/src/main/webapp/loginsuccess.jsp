<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login success</title>
</head>
<body>
<% String name=(String)session.getAttribute("name"); %>

<% if (name!=null) { %>

<%= "Welcome " +" " + name %>

<%} %>

<% if (name ==null) { %>

<%request.setAttribute("Logmsg", "Kindly login first"); %>

<% request.getRequestDispatcher("login.jsp").forward(request, response); %>

<% } %>
</body>
</html>