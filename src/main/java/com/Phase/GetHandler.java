package com.Phase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/handler")
public class GetHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	response.setContentType("text/html");
   		PrintWriter out = response.getWriter();
   		out.println("INSIDE GETMETHOD");
   		out.println("<br>");
   		String userName = request.getParameter("Username");
   		String userAddress = request.getParameter("Address");
   		out.println("Entered Name is "+userName+" from "+userAddress);
	
    }
}
