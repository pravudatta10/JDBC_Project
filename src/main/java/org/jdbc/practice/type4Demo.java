package org.jdbc.practice;

import java.sql.*;

public class type4Demo {

	public static void main(String[] args) throws  Exception {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","system");		
		 System.out.println("Done");
	}

}