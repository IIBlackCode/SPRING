package org.zerock.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
//MySQLConnectioncTest 클래스 작성 page 77 20190526
public class TEST1_MariaDBConnectioncTest {
	
	private static final String DRIVER 	= "org.mariadb.jdbc.Driver";
	private static final String URL		= "jdbc:mariadb://192.168.219.190:3306/book_ex?useSSL=false&serverTimezone=UTC";
	private static final String USER	= "root";
	private static final String PW		= "1234";
	
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL,USER, PW)) {
			
			System.out.println("con : "+con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
