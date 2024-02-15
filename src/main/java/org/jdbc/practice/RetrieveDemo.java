package org.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RetrieveDemo {

	public static void main(String[] args) throws Exception{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 Statement stmt=conn.createStatement();
		 ResultSet rs=stmt.executeQuery("select * from student");
		 ResultSetMetaData rm=rs.getMetaData();
		 int n=rm.getColumnCount();
		 for(int i=1;i<=n;i++)
		 {
			 System.out.print(rm.getColumnName(i)+"\t");
		 }
		 System.out.println();
		 while(rs.next())
		 {
			 System.out.print(rs.getInt(1)+"\t");
			 System.out.print(rs.getString(2)+"\t");
			 System.out.println(rs.getInt(3));
			 
		 }
	}

}