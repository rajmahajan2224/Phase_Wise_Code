package com.Phase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class FirstServeletHidden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("test/html");
			PrintWriter out = response.getWriter();
			
			String username = request.getParameter("userName");
			out.print("Welcome" + username);
			
			out.print("<form action = 'Second'>");
			
			out.print("<input type = 'hidden' name = 'username' value = '" + username + "'>");
			out.print("<input type = 'submit' value = 'submit'>");
			out.print("</form>");
			out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
