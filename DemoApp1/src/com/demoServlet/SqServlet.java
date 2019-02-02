package com.demoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//fetch the value of k(corresponding code for RequestDispatcher
			//int k = (int)req.getAttribute("k");
			//k = k * k;
			//PrintWriter out=res.getWriter();
			//out.println("Result is:"+k);
		
		//corresponding code for URL rewriting method in Addservlet
			//int k = Integer.parseInt(req.getParameter("k"));
			//	k = k*k;
			//PrintWriter out=res.getWriter();
			//out.println("The result is:"+k);
		
	//	System.out.println("sq called");
		
	//code for session method
		
		//HttpSession session= req.getSession();
		//int k = (int)session.getAttribute("k");
		//k = k*k;
		//PrintWriter out=res.getWriter();
		//out.println("Result is:"+k);
	
	// cookie code
		int k=0;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies){
			if (c.getName().equals("k"))
			 k=Integer.parseInt(c.getValue());
			k = k*k;
			PrintWriter out=res.getWriter();
			out.println("Result is:"+k);
		}
	}
	
}
