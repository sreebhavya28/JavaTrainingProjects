package com.doctor.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
static Connection connection;
    public static Connection openConnection() {
        String url = "jdbc:mysql://localhost:3306/doctordb";
        String username = "root";
        String password = "admin@123";
        try {
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.execute(Queries.CREATEQUERY);
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return connection;
    }

   

 

}
