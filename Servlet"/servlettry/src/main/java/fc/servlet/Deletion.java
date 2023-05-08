package fc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.servlet.Employee;
import fc.data.Data;


public class Deletion extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<Employee> list = Data.getList();
		
		
		
		for (Employee employee : list) {
			if (employee.getName().equals(request.getParameter("name"))) {
				
				list.remove(employee);
			
				request.setAttribute("msg","Deletion Successful");
			
				request.getRequestDispatcher("login.jsp").forward(request, response);
				
			}
		}
		
		request.setAttribute("nomsg","No User Found");
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
	}


}
