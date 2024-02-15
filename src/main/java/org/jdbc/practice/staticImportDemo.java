package org.jdbc.practice;
import static java.lang.Integer.*;

public class staticImportDemo {
	
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		staticImportDemo d= new staticImportDemo();
		int x=d.add(1,2);
		System.out.println(x);
		int e=sum(4, 5);
		System.out.println(e);
	}

}