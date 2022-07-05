package com.kbc.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginValidationServlet")
public class LoginValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/kbc";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Sumit@8105";
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			String username = request.getParameter("uname");
			String password = request.getParameter("pass");
			
			String query = "select * from users where name = ? and password = ?";
			
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1,username);
			stmt.setString(2,password);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				request.setAttribute("msg",rs.getString(2));
				getServletContext().getRequestDispatcher("/Home.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg","Login Unsuccessful!");
				getServletContext().getRequestDispatcher("/BackToLogin.jsp").forward(request, response);
			}
		}
		catch (SQLException e) {
           
            e.printStackTrace();
        } 
		catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
		
		
	}
	
	

}
