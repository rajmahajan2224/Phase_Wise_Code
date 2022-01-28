package com.Phase;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/handle")
public class PostHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("INSIDE POST METHOD");
		out.println("<br>");
		String uName = request.getParameter("Username");
		String uAddress = request.getParameter("Address");
		out.println("Entered Name is "+ uName +" from "+ uAddress);
		
	}
}
