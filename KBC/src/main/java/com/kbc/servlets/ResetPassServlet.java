package com.kbc.servlets;
import com.kbc.dao.ResetPassDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/ResetPassServlet")
public class ResetPassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ResetPassServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Retrieve all data
		
		String uname = request.getParameter("uname");
		
		String newpass = request.getParameter("newpass");
		String renewpass = request.getParameter("renewpass");
		
		if(newpass.equals(null)|| newpass==""||renewpass.equals(null)|| renewpass==""||uname.equals(null)||uname=="") {
			request.setAttribute("msg","All Fields Are Mandatory!");
			getServletContext().getRequestDispatcher("/Reset_Password.jsp").forward(request, response);
		}
		else if(!newpass.equals(renewpass)) {
			request.setAttribute("msg","Password Doesnot Match!");
			getServletContext().getRequestDispatcher("/Reset_Password.jsp").forward(request, response);
		}
		else {
			
			
			ResetPassDAO obj = new ResetPassDAO();
			int i = obj.reset(uname,newpass);
			if(i!=0) {
				request.setAttribute("msg","Password Updated successfully!");
				getServletContext().getRequestDispatcher("/BackToLogin.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg","Password Doesnot Match!");
				getServletContext().getRequestDispatcher("/BackToLogin.jsp").forward(request, response);
			}
			
			
		}
		
		
		
	}

	

}
