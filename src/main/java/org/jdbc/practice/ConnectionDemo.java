package org.jdbc.practice;

import java.sql.*;
public class ConnectionDemo {
public static void main(String[] args) throws Exception {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	Statement stmt=con.createStatement();
	stmt.executeQuery("create table students1 (Rollno number(5) , Name varchar2(10), age number(3))");
	System.out.println("Created");
}
}