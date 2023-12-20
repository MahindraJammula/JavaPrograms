package com.kn.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingJdbc {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Mahindra@123";
	private static final String QUERY1 = "UPDATE STUDENT6 SET GENDER ='MALE' WHERE ID !=4;";
	private static final String QUERY2 = "UPDATE STUDENT6 SET GENDER ='FEMALE' WHERE ID =4;";

	public static void main(String[] args) {
		// 1.Load & Register Driver
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2.Establish the Connection with DB
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			// 3. Create Statement Object
			Statement stmt = con.createStatement();

			// Batch Processing-Executing multiple quers at a time

			// --->(A) set autoCommit as false
			con.setAutoCommit(false);

			// --->(B) Add tasks to batch
			stmt.addBatch(QUERY1);// 4 rows affected
			stmt.addBatch(QUERY2);// 1 row affected

			// --->(C) Get count of records affected
			int[] countBatch = stmt.executeBatch();
			for (int count : countBatch) {
				System.out.println(count + " Rows Affected");
			}

			// --->(D) Commit
			con.commit();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
