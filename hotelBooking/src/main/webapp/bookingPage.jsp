<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>BOOKING PAGE</title>
  <style>
    table {
      margin: 0 auto;
      text-align: left;
    }
    th, td {
      padding: 8px;
    }
    input[type="submit"] {
      margin-top: 10px;
    }
    .error-message {
      color: red;
    }
  </style>
</head>
<body>
  <table>
    <form action="Reservation" method="post">
      <tr>
        <th>NAME:</th>
        <td><input type="text" name="bookedBy"></td>
      </tr>
      <tr>
        <th>ROOM NUMBER:</th>
        <td><input type="text" name="roomNumber"></td>
      </tr>
      <tr>
        <th>HEAD COUNT:</th>
        <td><input type="text" name="headCount"></td>
      </tr>
      <tr>
        <th>FROM:</th>
        <td><input type="date" name="bookingFrom"></td>
      </tr>
      <tr>
        <th>TO:</th>
        <td><input type="date" name="bookingTill"></td>
      </tr>
      <tr>
        <td colspan="2">
          <input type="submit" value="BOOK">
        </td>
      </tr>
    </form>
  </table>

  <% String bookMsg = (String) request.getAttribute("BOOKED"); %>
  <% if (bookMsg != null) { %>
    <p class="error-message"><%= bookMsg %></p>
  <% } %>

  <% String roomNumber = (String) request.getAttribute("ROOMNUMBER"); %>
  <% if (roomNumber != null) { %>
    <p class="error-message"><%= roomNumber %></p>
  <% } %>
</body>
</html>