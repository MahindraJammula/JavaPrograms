package com.kn.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Mahindra@123";
//	private static final String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT6(ID INT ,NAME VARCHAR(20),MARKS INT);";
//	private static final String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT6 VALUES(1,'RAM',100);";
//	private static final String UPDATE_STUDENT_QUERY = "UPDATE STUDENT6 SET NAME='SRI RAM' WHERE NAME='RAM';";
//	private static final String DELTHE_STUDENT_QUERY = "DELETE FROM STUDENT6;";
	private static final String SELECT_ALL_STUDENT6_QUERY = "select * from student6;";

	public static void main(String[] args) {
//		String URL = "jdbc:mysql://localhost:3306/university";
//		String USER_NAME = "root";
//		String PASSWORD = "Mahindra@123";
		// String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT6(ID INT ,NAME
		// VARCHAR(20),MARKS INT);";
		// String INSERT_STUDENT_QUERY="INSERT INTO STUDENT6 VALUES(1,'RAM',100);";
		// String UPDATE_STUDENT_QUERY="UPDATE STUDENT6 SET NAME='SRI RAM' WHERE
		// NAME='RAM';";
		// String DELTHE_STUDENT_QUERY = "DELETE FROM STUDENT6;";
		Connection con = null;
		try {
			// 1.Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// FQCN(Fully Qualified Class Name)-Cononical Name
			System.out.println("===>Driver Loaded & Registered Successfully !");

			// 2. Establish the Connection With DataBase
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("===>Connection Established Successfully" + con);

			// 3. Create Statement Object
			Statement stmt = con.createStatement();

			// 4. Send & Execute Query
			// stmt.execute(CREATE_STUDENT_QUERY);

			// int rowsAffected=stmt.executeUpdate(INSERT_STUDENT_QUERY);
			// int rowsAffected=stmt.executeUpdate(UPDATE_STUDENT_QUERY);
			// int rowsAffected = stmt.executeUpdate(DELTHE_STUDENT_QUERY);
			// System.out.println(rowsAffected + "rows afected.");

			ResultSet rs = stmt.executeQuery(SELECT_ALL_STUDENT6_QUERY);
			while (rs.next()) {
				System.out.println("ID = " + rs.getInt(1) + ", Name = " + rs.getString(2) + ", Marks = " + rs.getInt(3));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("------>Driver not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("---->Failed to Established Connection");
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
