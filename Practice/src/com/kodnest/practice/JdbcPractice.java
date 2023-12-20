package com.kodnest.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcPractice {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Mahindra@123";
	private static final String UPDATE_QUERY = "UPDATE emp1 SET salary=(salary+1000) where id=? ;";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		try {
			// Step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			Statement stmt = con.createStatement();
			try {
				PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
				System.out.println("Enter id Whose salary needs to be updated = ");
				int id = sc.nextInt();
				pstmt.setInt(1, id);
				pstmt.execute();
				System.out.println("Salary for emp with id = " + id + ", has been updated");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
