package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstConnection {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "Mysql1?";
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional
			connection = DriverManager.getConnection(dburl, user, password);
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an employee name:");
			String firstname = scanner.nextLine();
			

			String SQL = "Select * FROM employees where firstname = '" + firstname + "'";
			System.out.print(SQL);
			Statement stmt = connection.createStatement();
			ResultSet result = stmt.executeQuery(SQL);

			while (result.next()) {
				Integer id = result.getInt("id");
				String name = result.getString("firstName");
				String email = result.getString("email");
				System.out.println(id + " | " + name + " | " + email);
			}
			result.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			
			}
		}
		
		}
	}
