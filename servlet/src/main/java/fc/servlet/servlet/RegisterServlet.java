package fc.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		HttpSession session = request.getSession();
//		
//		session.setMaxInactiveInterval(120);
		
//		Cookie ck=new Cookie("NEZUKO","ONICHAN");
//		
//		
//		
//		ck.setMaxAge(60);
//		
//		System.out.println(ck.getName());
//		
//		
//
//		System.out.println(ck.getPath());

	
		
		
		
		ServletContext servletContext = getServletContext();
		
		String initParameter = servletContext.getInitParameter("propName");
		
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		//response.addCookie(ck);
		
		//response.sendRedirect("welcome.html");
		
		writer.println("THE MACHINE THAT YOU ARE USING : "+initParameter);
		
		
		
		
		
		
	}

}
