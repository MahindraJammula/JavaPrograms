package com.kn.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentJDBCDemo {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Mahindra@123";

	public static void main(String[] args) {
		Connection con=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		
	Student s1=new Student(2,"ankit",35);
	Student s2=new Student(3,"amit",85);
	DBHandler.insertData(con, s1);
	DBHandler.insertData(con, s2);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
	}
}
