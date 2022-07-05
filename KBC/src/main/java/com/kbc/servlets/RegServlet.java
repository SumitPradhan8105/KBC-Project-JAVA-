package com.kbc.servlets;

import com.kbc.dao.RegistrationDAO;
import com.kbc.user.*;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			//PrintWriter out = response.getWriter();
			
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			String gender  = request.getParameter("gender");
			String password = request.getParameter("password");
			
			RegistrationDAO obj = new RegistrationDAO();
			String result = obj.insert(new User(name,email,mobile,gender,password));
			//response.getWriter().print(result);
			
			HttpSession session = request.getSession();
			session.setAttribute("msg",result);
			getServletContext().getRequestDispatcher("/BackToLogin.jsp").forward(request, response);
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
