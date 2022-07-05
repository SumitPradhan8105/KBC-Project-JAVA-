

package com.kbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;



@WebServlet("/QuizSubmitServlet")
public class QuizSubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public QuizSubmitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String jdbcURL = "jdbc:mysql://localhost:3306/kbc";
		String jdbcUsername = "root";
		String jdbcPassword = "Sumit@8105";
		
		Connection connection = null;
		Statement stmt = null;
		ResultSet res = null;
		
		PrintWriter out = response.getWriter();
		String paramName;
		String[] paramValue;
		
		int cnt = 0;
		String ans ="";
	
		int index = 0;
		//HttpSession session = request.getSession();
		@SuppressWarnings("rawtypes")
		Enumeration paramNames = request.getParameterNames();
		boolean bool = true;
		
		
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded");
	            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	            stmt = connection.createStatement();
	            res = stmt.executeQuery("select answer,prize,qno from QBank");
	            
	             
	            
	            while(res.next() && paramNames.hasMoreElements()){
	            	index++;
	            	String un = res.getString("answer");
	            	paramName = (String)paramNames.nextElement();
	            	paramValue = request.getParameterValues(paramName);
	            	//System.out.println(paramValue.length);
	            	for(int i = 0 ;i<paramValue.length;i++) {
	            		ans = paramValue[i];
	            		if(un.equals(ans)) {
		            		cnt = cnt +res.getInt("prize");
		            		
		            	}
	            		else {
	            			bool = false;
	            		}
	            	}
	            }
	            
	            
	           if(bool == true) {
	        	   out.println("<h1> You have scored Rs. "+(cnt*1000)+"</h1>");
	        	   request.setAttribute("cnt",(cnt*1000));
	        	   request.setAttribute("msg","You Have Successfully Won KBC!");
	        	   getServletContext().getRequestDispatcher("/Result.jsp").forward(request, response);
	           }
	           else {
	        	   request.setAttribute("cnt",(cnt*1000));
	        	   request.setAttribute("over","Game Over!");
	        	   request.setAttribute("index",index-1);
	        	   
	        	   getServletContext().getRequestDispatcher("/WrongResult.jsp").forward(request, response);
//	        	   out.println("<h1> You have Won Rs. "+(cnt*1000)+"</h1>");
//	        	   out.println("<h1> Game Over!  </h1>");
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