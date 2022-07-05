package com.kbc.dao;
import com.kbc.quiz.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuizDAO {

	String jdbcURL = "jdbc:mysql://localhost:3306/kbc";
	String jdbcUsername = "root";
	String jdbcPassword = "Sumit@8105";
	
	Connection connection = null;
	Statement stmt = null;
	ResultSet res = null;
	
	public List<Quiz> getQuestions() {
		List <Quiz> quizes = new ArrayList<Quiz>();
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded");
	            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	            stmt = connection.createStatement();
	            res = stmt.executeQuery("select * from QBank");
	            
	            
	            
	            
	            while(res.next()) {
	            	quizes.add(new Quiz(res.getInt("id"),
	            			res.getString("qno"),
	            			res.getString("question"),
	            			res.getString("option1"),
	            			res.getString("option2"),
	            			res.getString("option3"),
	            			res.getString("option4"),
	            			res.getString("answer"),
	            			res.getInt("prize")));
	            	
	            	
	            }
	            
	        } 
		 catch (SQLException e) {
	            e.printStackTrace();
	        } 
		 catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
		 return quizes;
		
	}
	
	
	

}
