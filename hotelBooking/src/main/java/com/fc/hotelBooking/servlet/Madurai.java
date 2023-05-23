package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fc.hotelBooking.bean.Hotel;
import com.fc.hotelBooking.data.DataBase;

/**
 * Servlet implementation class Madurai
 */
@WebServlet("/Madurai")
public class Madurai extends HttpServlet {
	
	List<Hotel> hotelListMdu=new ArrayList();
	
	@Override
	public void init() throws ServletException {
	
		hotelListMdu.add(new Hotel("K1 HOME STAY","AARAPALAYAM", "AC DELUXE", 2500.0, 2L,10,"AVAILABLE"));
		hotelListMdu.add(new Hotel("K1 HOME STAY","AARAPALAYAM", "NON AC DELUXE", 2000.0, 2L,11,"AVAILABLE"));
		hotelListMdu.add(new Hotel("K1 HOME STAY","AARAPALAYAM", "AC DELUXE", 3500.0, 2L,20,"AVAILABLE"));
		hotelListMdu.add(new Hotel("K1 HOME STAY","AARAPALAYAM", "NON-AC DELUXE", 2700.0, 2L,21,"AVAILABLE"));
		
		
		
		DataBase.setHotelList(hotelListMdu);
	}
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("functionalities.jsp");
		
	}

	
}
