package com.drama.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.drama.util.Queries;

public class DbConnection {

	private static Connection connection;

	public static Connection openConnection() {
		
		 String url = "jdbc:mysql://localhost:3306/dbdrama";
	        String username = "root";
	        String password = "admin@123";
	        try {
	            connection = DriverManager.getConnection(url, username, password);
	            Statement statement = connection.createStatement();
//	            statement.execute(Queries.CREATEQUERY);
	        } catch (SQLException e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	        return connection;
		
	}

}
