<%@page import="com.fc.hotelBooking.data.DataBase"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="com.fc.hotelBooking.bean.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Details</title>
<style type="text/css">

.ERROR {

color: red;

}

a.log {

position: fixed;

top: 0;

right: 1cm;

}

</style>
</head>


<body>



<% List<Book> bookList1=(List<Book>)session.getAttribute("BOOKINGDETAILS"); %>

<% if(bookList1.isEmpty()) { %>

 <p CLASS="ERROR"> <%="NO BOOKINGS AS OF NOW!" %></p>
 
 

<% } else if(!bookList1.isEmpty()) { %>

<table>
<tr>
<th>BOOKING ID </th>
<th>BOOKED BY</th>
<th>ROOM NUMBER</th>
<th>HEAD COUNT</th>
<th>BOOKED FROM </th>
<th>BOOKED TILL</th>
</tr>

<% for(Book books :bookList1) { %>
<tr>
<td><%= books.getBookingId() %></td>
<td><%= books.getBookedBy() %></td>
<td><%= books.getRoomNumber() %></td>
<td><%=books.getHeadCount() %></td>
<td><%= books.getBookingFrom() %></td>
<td><%=books.getBookingtill() %></td>
</tr>
<%} %>
</table>

<%} %>

<a href="Logout" class="log">LOG OUT</a>

</body>
</html>