package com.kbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class ResetPassDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/kbc";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Sumit@8105";
	
	public Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
			
		}
		catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return con;
	}
	
	public int reset (String uname, String newpass) {
		
		String query = "update users set password =? where name = ?";
		Connection con = getConnection();
		int i = 0;
		
		
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,newpass);
			stmt.setString(2,uname);
			i = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return i;
		
	}

}
