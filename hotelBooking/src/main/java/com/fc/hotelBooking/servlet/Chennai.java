package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fc.hotelBooking.bean.Hotel;
import com.fc.hotelBooking.data.DataBase;

@WebServlet("/chennai")
public class Chennai extends HttpServlet {
      List <Hotel> hotelList=new ArrayList();
      
     
      
  @Override
public void init() throws ServletException {

	hotelList.add(new Hotel("K1 HOME STAY","T-NAGAR", "AC DELUXE", 2500.0, 2L,100,"AVAILABLE"));
	hotelList.add(new Hotel("K1 HOME STAY","T-NAGAR", "NON AC DELUXE", 2000.0, 2L,101,"AVAILABLE"));
	hotelList.add(new Hotel("K2 HOME STAY","ANNA-NAGAR", "AC DELUXE", 3500.0, 2L,200,"AVAILABLE"));
	hotelList.add(new Hotel("K2 HOME STAY","ANNA-NAGAR", "AC DELUXE", 2700.0, 2L,201,"AVAILABLE"));
	
	
	
	DataBase.setHotelList(hotelList);
	
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.sendRedirect("functionalities.jsp");
	}



}
