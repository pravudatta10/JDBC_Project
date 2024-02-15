package org.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteRow {

	public static void main(String[] args) throws Exception {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		 ResultSet rs=stmt.executeQuery("select rollno,name,age from student");
		 rs.absolute(5);
		 rs.deleteRow();
		 System.out.println("Deleted");
	}

}