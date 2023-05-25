package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fc.hotelBooking.bean.Book;
import com.fc.hotelBooking.bean.Hotel;
import com.fc.hotelBooking.data.DataBase;

/**
 * Servlet implementation class Reservation
 */
@WebServlet("/Reservation")
public class Reservation extends HttpServlet {


	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List <Book> bookList=DataBase.getBookList();
		
		List <Hotel> hotelList=new ArrayList ();
		
		
		List<Hotel> hotelList2 = DataBase.getHotelList();
		
		Book bookingObj=new Book();
		
		 LocalDate before = LocalDate.parse(request.getParameter("bookingFrom"));
		 
		 LocalDate after = LocalDate.parse(request.getParameter("bookingTill"));
		 
		 Boolean roomNumberCheck=false;
		 
		 Boolean bookingDateCheck=false;
		
		
		for (Hotel hotels :hotelList2) {
			
		
		if (Integer.parseInt(request.getParameter("roomNumber"))==hotels.getRoomNumber() ) {

			roomNumberCheck=true;
			
			if ((hotels.getBookedFrom()==null && hotels.getBookedTill()==null)|| (before.isEqual(hotels.getBookedTill())|| (before.isAfter(hotels.getBookedTill())) && (after.isBefore(hotels.getBookedFrom())||after.isEqual(hotels.getBookedFrom())))) {
				
				Long id=(long)(99999*Math.random()+99999);
				
				bookingDateCheck=true;
			
				Book book = new Book(id,request.getParameter("bookedBy") ,Integer.parseInt(request.getParameter("roomNumber")),Long.parseLong(request.getParameter("headCount")), before, after);
					
				
				bookList.add(book);
				
				DataBase.setBookList(bookList);
				
				for (Hotel hotel : hotelList2) {
					if (hotel.getRoomNumber()==(Long.parseLong(request.getParameter("roomNumber")))) {
						
						
						hotel.setBookedFrom(before);
						hotel.setBookedTill(after);
					}
				
				}
				
				request.setAttribute("BOOKINGDETAILS", book);
				
				request.getRequestDispatcher("display.jsp").forward(request, response);
				
				
				
			
			
			} 
				
			
		}
		
}
		if (roomNumberCheck==false) {
			
			request.setAttribute("ROOMNUMBER", "PLEASE ENTER VALID ROOM NUMBER");
			
			request.getRequestDispatcher("bookingPage.jsp").forward(request, response);
		}
		
		else if (bookingDateCheck==false) {
			
			request.setAttribute("BOOKED", "PLEASE CHOOSE DIFFERENT DATE'S");

			request.getRequestDispatcher("bookingPage.jsp").forward(request, response);
	
			
		}
	
		

	}

}
