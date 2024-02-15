package org.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDemo {
	public static void main(String[] args) throws  Exception {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 Statement stmt=conn.createStatement();
		 stmt.executeUpdate("delete from student where name ='Test'");
		 System.out.println("Deleted");
	}

}