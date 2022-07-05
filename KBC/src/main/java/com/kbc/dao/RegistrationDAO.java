package com.kbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kbc.user.User;

public class RegistrationDAO {
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
	
	public String insert (User users) {
		Connection con = getConnection();
		String query = "insert into users (name,email,mobile,gender,password) values(?,?,?,?,?)";
		String result = "Data Added Successfully!!";
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,users.getName());
			stmt.setString(2,users.getEmail());
			stmt.setString(3,users.getMobile());
			stmt.setString(4,users.getGender());
			stmt.setString(5,users.getPassword());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data Addition Unsuccessful!";
		}
		return result;
		
	}

}
