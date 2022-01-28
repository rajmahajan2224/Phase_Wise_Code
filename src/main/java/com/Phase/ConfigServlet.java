package com.Phase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init() {
		System.out.println("Servlet Initialized...");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		System.out.println("Inside doGet()...");
		
		response.setContentType("text/html");
	
		PrintWriter out = response.getWriter();
	
		out.println("Welcome to Arsenal Football Club</center>");
	}
	
	@Override
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
}
