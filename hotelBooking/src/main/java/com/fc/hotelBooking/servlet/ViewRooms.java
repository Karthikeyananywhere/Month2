package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fc.hotelBooking.bean.Hotel;
import com.fc.hotelBooking.data.DataBase;

public class ViewRooms extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("ENTER INSIDE");
		List<Hotel> hotelList = DataBase.getHotelList();

		

		System.out.println(hotelList);

		req.setAttribute("ROOMLIST", hotelList);

		req.getRequestDispatcher("display.jsp").forward(req, resp);

	}

}
