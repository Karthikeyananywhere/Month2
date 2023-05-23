package com.fc.hotelBooking.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.fc.hotelBooking.bean.Admin;
import com.fc.hotelBooking.data.DataBase;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
   
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		Admin adminDetails = new Admin();
		
		adminDetails.setUserName("ADMIN");
		
		adminDetails.setPassword("admin");
		
		DataBase.setAdminDetails(adminDetails);
		
		chain.doFilter(request, response);
	}



}
