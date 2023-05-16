package fc.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String attribute = (String)request.getParameter("NAME");
		
//		Cookie[] cookies = request.getCookies();
//		
//		for (Cookie cookie : cookies) {
//			System.out.println(cookie.getValue());
//			System.out.println(cookie.getName());
//		}
//		
//		for (Cookie cookie : cookies) {
//			if (cookie.getName().equals(attribute)) {
//				response.setContentType("text/html");
//				
//				PrintWriter writer = response.getWriter();
//				
//				
//				writer.println("AUTHENTICATION SUCCESS");
//				
//			}
//		}
		
	PrintWriter writer = response.getWriter();
	
	response.setContentType("text/html");
	
	writer.println("WELCOME "+ attribute);
	
	writer.println("<a href=welcome.html?name="+attribute+">visit</a");
	
	}

}
