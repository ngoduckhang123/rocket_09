package com.vti.fontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/qluv?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connection Success!");
		
		Statement statement = connection.createStatement();
		
		String sql = "insert into `Project`(ProjectId)"+
		             "values               (1)";
		int effectedRecorAmount = statement.executeUpdate(sql);
		
		connection.close();
	}

}
