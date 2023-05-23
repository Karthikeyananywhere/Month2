<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.fc.hotelBooking.bean.Hotel" %>
    <%@ page import="java.util.*" %>
    <%@ page import="com.fc.hotelBooking.bean.Book" %>
    <%@ include file="functionalities.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DISPLAY</title>
</head>
<body>

<% List<Hotel> hotel=(List<Hotel>)request.getAttribute("ROOMLIST"); %>

<% if(hotel!=null) { %>


<table>

<tr>

<th>HOTEL NAME</th>
<th>Location</th>
<th>Room Type</th>
<th>Price</th>
<th>Capacity</th>
<th>RoomNumber</th>
</tr>
<% for (Hotel hotels :hotel) { %>
<tr>
<td><%= hotels.getHotelName() %></td>
<td><%= hotels.getLocation() %></td>
<td><%= hotels.getRoomType() %> </td>
<td><%= hotels.getPrice() %></td>
<td><%= hotels.getCapacity() %>
<td><%= hotels.getRoomNumber() %></td>
</tr>
<% } %>
</table>

<%} %>

<% Book book=(Book)request.getAttribute("BOOKINGDETAILS"); %>

<% if(book!=null) { %>
<table>
<tr>
<th>BOOKING ID </th>
<th>BOOKED BY</th>
<th>ROOM NUMBER</th>
<th>HEAD COUNT</th>
<th>BOOKED FROM </th>
<th>BOOKED TILL</th>
</tr>

<tr>
<td><%= book.getBookingId() %></td>
<td><%= book.getBookedBy() %></td>
<td><%= book.getRoomNumber() %></td>
<td><%=book.getHeadCount() %></td>
<td><%= book.getBookingFrom() %></td>
<td><%=book.getBookingtill() %></td>
</tr>

</table>

<% } %>

<% Hotel hotel1=(Hotel)request.getAttribute("Hotel"); %>

<% Book book1=(Book) request.getAttribute("Book"); %>

<% if(hotel1!=null && book1!=null ) { %>

<table>

<tr>

<th>HOTEL NAME</th>
<th>Location</th>
<th>Room Type</th>
<th>Price</th>
<th>Capacity</th>
<th>RoomNumber</th>
<th>Booked From</th>
<th>Booked Till</th>
</tr>

<tr>
<td><%= hotel1.getHotelName() %></td>
<td><%= hotel1.getLocation() %></td>
<td><%= hotel1.getRoomType() %> </td>
<td><%= hotel1.getPrice() %></td>
<td><%= hotel1.getCapacity() %>
<td><%= hotel1.getRoomNumber() %></td>
<td><%= hotel1.getBookedFrom() %></td>
<td><%= hotel1.getBookedTill() %></td>
</tr>

</table>

<table>

<tr>
<th>BOOKING ID </th>
<th>BOOKED BY</th>
<th>ROOM NUMBER</th>
<th>HEAD COUNT</th>
<th>BOOKED FROM </th>
<th>BOOKED TILL</th>
</tr>

<tr>
<td><%= book1.getBookingId() %></td>
<td><%= book1.getBookedBy() %></td>
<td><%= book1.getRoomNumber() %></td>
<td><%=book1.getHeadCount() %></td>
<td><%= book1.getBookingFrom() %></td>
<td><%=book1.getBookingtill() %></td>
</tr>
</table>


<% } %>

























</body>

</html>