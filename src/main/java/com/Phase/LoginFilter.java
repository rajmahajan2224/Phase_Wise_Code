package com.Phase;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/LoginFilter")
public class LoginFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
public LoginFilter() {
        
    }

        public void destroy() {
             
        }

        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                
                String userId = request.getParameter("userid");

                if( userId != null){
                        chain.doFilter(request, response);
            }
                                 
        }

        public void init(FilterConfig fConfig) throws ServletException {
    
        }    
}
