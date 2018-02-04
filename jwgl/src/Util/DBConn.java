package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	public static Connection getConn() {
		
		Connection connection = null;
		System.out.println("test1");
		String driverClass = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/distribute_database";
		try {
			Class class1 = Class.forName(driverClass);
			System.out.println(class1.getName());
			connection = DriverManager.getConnection(url,"root","mfb12580"); 
		} catch (Exception e) {
			System.out.println("´íÎó");
		}
		System.out.println(connection);
		return connection;
	}
}
