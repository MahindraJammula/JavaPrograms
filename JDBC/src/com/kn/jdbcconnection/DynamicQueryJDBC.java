package com.kn.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicQueryJDBC {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Mahindra@123";
	private static final String INSERT_QUERY = "INSERT INTO Emp1 VALUES(?,?,?);";
	private static final String READ_QUERY = "select * from emp1;";
	private static final String UPDATE_QUERY = "UPDATE emp1 SET salary=(salary+100000) where id=? ;";
	private static final String DELTHE_QUERY = "DELETE FROM emp1 where id=?;";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		try {
			// Step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("===>Driver Loaded & Registered Successfully !");

			// step 2
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("===>Connection Established Successfully" + con);

			// step 3
			Statement stmt = con.createStatement();
			System.out.println("Choose Options are given below: ");
			System.out.println("1.To Insert Data");
			System.out.println("2.To Read Data");
			System.out.println("3.To Update Data");
			System.out.println("4.To Delete Data");
			System.out.println("5.Quit");
			boolean flag = true;
			while (flag) {
				int option = sc.nextInt();
				switch (option) {
				case 1: {
					// Insert data
					insertData(con, sc);
					break;
				}
				case 2: {
					// Insert data
					readData(con, sc);
					break;
				}
				case 3: {
					// Update Data
					updateData(con, sc);
					break;
				}
				case 4: {
					// Delete data
					deleteData(con, sc);
					break;
				}
				default:
					flag = false;

				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				sc.close();
			}
		}
	}

	private static void insertData(Connection con, Scanner sc) {
		System.out.println("Enter Id = ");
		int id = sc.nextInt();
		System.out.println("Enter Name = ");
		String name = sc.next();
		System.out.println("Enter Salary = ");
		double salary = sc.nextDouble();

		try {
			PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			pstmt.execute();
			System.out.println("Data Inserted Successfully !!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void readData(Connection con, Scanner sc) {
		try {
			PreparedStatement pstmt = con.prepareStatement(READ_QUERY);
			ResultSet rs = pstmt.executeQuery(READ_QUERY);
			while (rs.next()) {
				System.out.println(
						"Id = " + rs.getInt(1) + ",Name = " + rs.getString(2) + ", Salary = " + rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateData(Connection con, Scanner sc) {
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
	}

	private static void deleteData(Connection con, Scanner sc) {
		try {
			PreparedStatement pstmt = con.prepareStatement(DELTHE_QUERY);
			System.out.println("Enter id Whose record needs to be Deleted = ");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			pstmt.execute();
			System.out.println("Record foe employee with id = " + id + ", has been Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
