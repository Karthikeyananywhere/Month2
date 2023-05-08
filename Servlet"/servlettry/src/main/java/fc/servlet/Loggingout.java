package fc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Loggingout extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		HttpSession session = request.getSession(false);
		
		System.out.println("LOG OUT "+session.getId());
		
		
		if (session!=null) {

			session.invalidate();
            //System.out.println(session.getAttribute("name"));
			request.setAttribute("Message","LOGGED OUT SUCCESSFULLY");
			request.getRequestDispatcher("login.jsp").include(request, response);
			
		}
			
		
		
		
		
//		String loginPage=request.getContextPath()+ "/login.jsp";
//		
//		response.sendRedirect(loginPage);
		
	}

}
