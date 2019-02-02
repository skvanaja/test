package com.demoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	//public void service(HttpServletRequest req, HttpServletResponse res)throws IOException
	
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
// works only with post() method mentioned in form tag.
	{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k =i + j;
		
		
		//PrintWriter out = res.getWriter();
		//out.println("The result is:"+k);

		//RequestDispatcher method is one way of calling  servlet from a servlet
			//req.setAttribute("k",k);
			//RequestDispatcher rd = req.getRequestDispatcher("sq");
			//rd.forward(req,res);
		
		// URL rewriting is one of the way in Redirect method to call a servlet from another servlet
			//res.sendRedirect("sq?k="+k); //URL rewriting
		
		//Session is one of the method in session management(To pass a value from one session to other
			//HttpSession session = req.getSession();
			//session.setAttribute("k",k);
			//res.sendRedirect("sq");
		//cookies
			Cookie cookie=new Cookie("k",k+"");
			res.addCookie(cookie);
			res.sendRedirect("sq");
		
	}
	
}
