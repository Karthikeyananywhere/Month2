package fc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.servlet.Employee;
import fc.data.Data;

/**
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {
	
	
	
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				Employee employee=new Employee();
				
				employee.setName(request.getParameter("name"));
				employee.setMailId(request.getParameter("mailId"));
				employee.setPhoneNumber(Long.parseLong(request.getParameter("phoneNumber")));
				employee.setDoj(request.getParameter("doj"));
				employee.setPassword(request.getParameter("password"));
				
				List<Employee> employeeList = Data.getList();
				employeeList.add(employee);
				Data.setList(employeeList);
				
			
			request.getRequestDispatcher("success.jsp").forward(request, response);
				
				
				
				
				

			
					
		
				
				
			
				
				
				
	}

}
