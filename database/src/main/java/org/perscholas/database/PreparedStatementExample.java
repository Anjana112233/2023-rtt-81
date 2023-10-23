package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementExample {
	
	// 1) Expand the output inside the while loop to also print out the last name
		// 2) Use the scanner to also ask for the last name and modify the query to search for
		// firstname and lastname
		

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
			System.out.println("Enter an employee last name: ");
			String lastname = scanner.nextLine();

			//String SQL = "Select * FROM employees where firstname = '" + firstname + "'";
			String SQL = "Select * FROM employees where firstname = ? and lastname = ?";
			System.out.print(SQL);
			PreparedStatement stmt = connection.prepareStatement(SQL);
			stmt.setString(1, firstname);
			stmt.setString(2, lastname);
			
			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				Integer id = result.getInt("id");
				String fname = result.getString("firstname");
				String lname = result.getString("lastname");
				String email = result.getString("email");
				System.out.println(id + " | " + fname +" | "+ lname+ "  | " + email);
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
