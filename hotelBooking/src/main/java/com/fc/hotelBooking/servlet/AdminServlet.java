package com.fc.hotelBooking.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fc.hotelBooking.bean.Admin;
import com.fc.hotelBooking.bean.Book;
import com.fc.hotelBooking.data.DataBase;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class AdminServlet extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Book> bookList = DataBase.getBookList();
		
		Admin adminDetails = DataBase.getAdminDetails();
		
		if (adminDetails.getUserName().equals(request.getParameter("userName"))) {
			
			if (adminDetails.getPassword().equals(request.getParameter("password"))) {
				
				HttpSession session = request.getSession(true);
				
				session.setAttribute("BOOKINGDETAILS", bookList);
				
				request.getRequestDispatcher("bookhistory.jsp").forward(request, response);
				
			} else {
				
				request.setAttribute("PASSWORD", "INVALID PASSWORD");
				
				request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
			}

		
	} else {
		request.setAttribute("NOADMIN", "NOT A REGISTERED ADMIN");
		
		request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
	}

}
	
}
