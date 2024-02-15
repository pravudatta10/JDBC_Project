package org.jdbc.practice;
import java.sql.*;
public class Resultsetenh {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("select * from student");
		rs.absolute(5);
		System.out.print (rs.getInt(1)+"\t");
		System.out.print (rs.getString(2)+"\t"); 
		System.out.println(rs.getInt(3) );
		
	}

}