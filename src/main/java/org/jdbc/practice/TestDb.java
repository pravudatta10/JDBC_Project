package org.jdbc.practice;
import java.sql.*;
class TestDb
{
	public static void main(String args [])
	{
	 try{
		 Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 System.out.println("Copnnection Established Successfully");
		 
	 }
	 catch(Exception e)
	 {
		  System.err.println(e);
	 }
	}
} 