package fc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.servlet.Employee;
import fc.data.Data;

/**
 * Servlet implementation class Validate
 */

public class Validate extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Employee emp = (Employee)request.getAttribute("employee");
		List<Employee> employeeList = Data.getList();
		
		RequestDispatcher dispatcher;
		
		for(Employee employee: employeeList) {
			
			if(employee.getName().equals(request.getParameter("name"))) {
				
				if (employee.getPassword().equals(request.getParameter("password"))) {
					HttpSession session = request.getSession();
					System.out.println("LOG IN "+session.getId());
					session.setAttribute("name", employee.getName());
//					session.setAttribute("password", employee.getPassword());
					session.setAttribute("mail", employee.getMailId());
					request.setAttribute("employee", employee);
					dispatcher=request.getRequestDispatcher("loginsuccess.jsp");
					
					//response.sendRedirect("loginsuccess.jsp");
					
					
					dispatcher.forward(request, response);
					
					
				}
				
			}
		}
		
//		request.setAttribute("loginfail","Kindly enter valid credentials");
//			dispatcher=request.getRequestDispatcher("failure.jsp");
//			
//			dispatcher.forward(request, response);
//			
			
			
			
			
			
		}
		
		
		
	}


