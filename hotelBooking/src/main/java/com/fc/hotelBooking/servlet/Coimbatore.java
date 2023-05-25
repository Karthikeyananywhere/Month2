package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fc.hotelBooking.bean.Hotel;
import com.fc.hotelBooking.data.DataBase;

/**
 * Servlet implementation class Coimbatore
 */
@WebServlet("/Coimbatore")
public class Coimbatore extends HttpServlet {
	
	List<Hotel> hotelListCbe=new ArrayList();

	
	@Override
	public void init() throws ServletException {
		
		hotelListCbe.add(new Hotel("K1 HOME STAY","GANDHIPURAM", "AC DELUXE", 2500.0, 2L,300,"AVAILABLE"));
		hotelListCbe.add(new Hotel("K1 HOME STAY","GANDHIPURAM", "NON AC DELUXE", 2000.0, 2L,301,"AVAILABLE"));
		hotelListCbe.add(new Hotel("K1 HOME STAY","PEELAMEDU", "AC DELUXE", 3500.0, 2L,400,"AVAILABLE"));
		hotelListCbe.add(new Hotel("K1 HOME STAY","PEELAMEDU", "NON-AC DELUXE", 2700.0, 2L,401,"AVAILABLE"));
		
		
		
		DataBase.setHotelList(hotelListCbe);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("functionalities.jsp");

	}


}
