package fc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.servlet.Employee;
import fc.data.Data;


public class Updation extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
		List<Employee> list = Data.getList();
		
		for (Employee employee : list) {
			
			if (employee.getName().equals(req.getParameter("username"))) {
				
				employee.setName(req.getParameter("username"));
				
				employee.setPassword(req.getParameter("password"));
				
				employee.setMailId(req.getParameter("mailId"));
				
				employee.setPhoneNumber(Long.parseLong(req.getParameter("phonenumber")));
				
				int indexOf = list.indexOf(employee);
				
				list.set(indexOf, employee);
				
				Data.setList(list);
				
				req.setAttribute("msg","UPDATION SUCCESSFUL");
				
				req.getRequestDispatcher("updatesuccess.jsp").forward(req, resp);
				}
		}
		
		req.setAttribute("text", "Kindly enter valid username ");
		req.getRequestDispatcher("failure.jsp").forward(req, resp);
	

}

}