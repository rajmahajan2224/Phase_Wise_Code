package com.Phase;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class HttpDashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    
    HttpSession session = request.getSession(false);  
    String userName = null;
    
    if (session.getAttribute("userid") != null)
    	userName =(String)session.getAttribute("userid");  
    if (userName == null ) {
        out.println("No UserId was found in session.<br>");
    } else {
        out.println("UserId obtained from session :" + userName + "<br>");
    }
    out.println("</body></html>");
}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
