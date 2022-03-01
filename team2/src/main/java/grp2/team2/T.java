package grp2.team2;

import java.sql.*;


public class T {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		//Connection conn=null;
		System.out.println("first pro");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","Deepika@1234");
	    System.out.println("connected");
	}

}
