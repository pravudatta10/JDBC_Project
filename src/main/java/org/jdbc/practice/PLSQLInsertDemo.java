package org.jdbc.practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class PLSQLInsertDemo {

	public static void main(String[] args) throws Exception{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		 CallableStatement cstmt=conn.prepareCall("{call insertpro(?,?,?)}");
		 cstmt.setInt(1, Integer.parseInt(args[0]));
		 cstmt.setString(2, args[1]);
		 cstmt.setInt(3, Integer.parseInt(args[2]));
		 cstmt.executeQuery();
		 System.out.println("Inserted");
	}

}