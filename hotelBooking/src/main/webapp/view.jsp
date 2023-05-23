<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Details</title>

<style type="text/css">

table {
	margin: 0 auto;
	
	text-align: left;
}

th, td {
	padding: 8 px;
}

 input[type="submit"] {
      margin-top: 10px;
    }
    .errormsg {
      color: red;
    }

</style>
</head>
<body>

<table>

<form action="checkout" method="post">
<tr>
<th>BOOKING ID:</th>
<td><input type="text" name="bookingId"></td>
</tr>

<tr>
<th>BOOKING NAME:</th>
<td><input type="text" name="bookingName"></td>
</tr>

<tr>

<td colspan="2"><input type="submit" value="SUBMIT"></td>

</tr>


</form>

</table>

<% String details=(String)request.getAttribute("bookingDetails"); %>

<% if(details!=null) { %>

<p class="errormsg"> <%= details %> </p>

<%} %>

</body>
</html>