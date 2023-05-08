<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="bean.servlet.Employee" %> 
 <%@ page import="java.util.List"  %>  
 <%@  include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>

<%-- <% List <Employee> emp =(List<Employee>) request.getAttribute("list"); %>

<%String name=(String)session.getAttribute("name"); %>

<%String password=(String)session.getAttribute("pwd"); %>

<% for (Employee empl:emp) { %>
 --%>

<%Employee emp=(Employee)request.getAttribute("empObj"); %>

  <% if(emp!=null ) { %> 
<table style="width: 100%; text-align: center;border: medium;color: black;">

<tr>

<th>NAME</th>
<th>PASSWORD</th>
<th>PHONE NUMBER</th>
<th>EMAIL ID</th>
<th>DOJ</th>
</tr>

<tr>
<td><%= emp.getName() %> </td>  
<td><%=emp.getPassword() %> </td>  
<td><%= emp.getPhoneNumber() %> </td>  
<td><%= emp.getMailId()%> </td>  
<td> <%= emp.getDoj() %></td>  
</tr>
<% } %>
</table>














</body>
</html>