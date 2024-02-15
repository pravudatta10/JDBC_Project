package org.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PrepareDemo {

	public static void main(String[] args) throws Exception{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 PreparedStatement pstmt=conn.prepareStatement("insert into student values(?,?,?)");
		 pstmt.setInt(1, Integer.parseInt(args[0]));
		 pstmt.setInt(3, Integer.parseInt(args[2]));
		 pstmt.setString(2, args[1]);
		 pstmt.executeQuery();
		 System.out.println("Excecuted");
	}

}