package fc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.servlet.Employee;
import fc.data.Data;

/**
 * Servlet implementation class Update
 */

public class Retrieve extends HttpServlet {

	
	

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 List<Employee> list = Data.getList();
		
		 HttpSession session = req.getSession(false);
		 
//		 String attribute =(String) session.getAttribute("name");
//	
//		 String attribute2 =(String) session.getAttribute("password");
//		 
		 String empMailId =(String) session.getAttribute("mail");
		 
//		// session.setAttribute("name", attribute);
//		 
//		 session.setAttribute("pwd", attribute2);
		
		// session.setAttribute("MAILID", attribute);
		 
		 for (Employee employee : list) {
			if (employee.getMailId().equals(empMailId) ) {
				req.setAttribute("empObj", employee);
				req.getRequestDispatcher("display.jsp").forward(req, resp);
			}
		}
		 
		//req.setAttribute("list", list);
		
		
	}


}
