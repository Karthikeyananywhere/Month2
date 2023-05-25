package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import com.fc.hotelBooking.bean.Book;
import com.fc.hotelBooking.bean.Hotel;
import com.fc.hotelBooking.data.DataBase;

/**
 * Servlet implementation class ViewBookingDetails
 */
@WebServlet("/checkout")
public class ViewBookingDetails extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Book> bookList1 = DataBase.getBookList();
		
		List<Hotel> hotelList1 = DataBase.getHotelList();
		
		System.out.println(bookList1);
	
		
		Boolean userCheck=false;
		
		for (Book books : bookList1) {
			
			if ((books.getBookingId()==(Long.parseLong(request.getParameter("bookingId")))) && (books.getBookedBy().equals(request.getParameter("bookingName")))) {
				
				userCheck=true;
				
				for (Hotel hotel : hotelList1) {
					
					System.out.println(hotel.getRoomNumber());
					
					System.out.println(books.getRoomNumber());
					
					if (hotel.getRoomNumber().compareTo(books.getRoomNumber())==0) {
						
						
						
						request.setAttribute("Hotel", hotel);
						
						request.setAttribute("Book", books);
						
						request.getRequestDispatcher("display.jsp").forward(request, response);
						
						System.out.println("ALAS");
					}
					
				}
			}
			
			
		}
		
		if (userCheck==false) {
			
			request.setAttribute("bookingDetails", "INVALID BOOKING ID OR NAME");
			request.getRequestDispatcher("view.jsp").forward(request, response);
		}
		
	}

}
