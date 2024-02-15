package org.jdbc.practice;

import java.sql.*;
public class insertDemo {

	public static void main(String[] args) throws  Exception {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.2.18:1521:orcl","training","training");
		 Statement stmt=conn.createStatement();
		 stmt.executeUpdate("insert into TESTING values(4,'Test')");
		 System.out.println("Inserted");
	}

}