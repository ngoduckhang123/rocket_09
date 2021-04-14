package com.vti.academy.demoJDBCV2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connection Success!");

		// Step 3: Create a statement object

		Statement statement = connection.createStatement();
		String sql = "INSERT INTO `Department` (`DepartmentName`, DepartmentId)  " + "Values(?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// input from scanner
		String DepartmentName = "Thủ Tướng";
		short Id = 12;
		// set parameter
		preparedStatement.setString(1, DepartmentName);
		preparedStatement.setShort(2, Id);
		// step 4 : Excute SQL query
		int effectRecorAmount = preparedStatement.executeUpdate();
		// step5 : Handling Result Set
		System.out.println("Effect Recor Amount" + effectRecorAmount);
		// step6: close connection
		connection.close();
	}
}
