package com.servlet1;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/additionServlet")
public class AddingServlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		if(request.getParameter("number1")!=null && request.getParameter("number2")!=null){
			int num1,num2;
			num1 = Integer.parseInt(request.getParameter("number1"));
			num2 = Integer.parseInt(request.getParameter("number2"));
			PrintWriter out = response.getWriter();
			out.println("The result is:"+(num1+num2));
			
		}
	
	}
	
}

