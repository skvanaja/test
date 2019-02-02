package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.util.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends GenericServlet {
	   
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Date d = new Date();
		pw.println("Date and Time is:"+ d.toString());
		
	}

}
