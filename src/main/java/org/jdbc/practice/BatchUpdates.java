package org.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdates {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement stmt=con.createStatement();
		stmt.addBatch("update student set rollno=4 where name ='Happy'");
		stmt.addBatch("insert into student values (5,'Chintu',23)");
		stmt.executeBatch();
		System.out.println("Ok");
	}

}