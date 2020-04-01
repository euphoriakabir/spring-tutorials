package com.awcsoftware.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awcsoftware.dao.DBConnection;

public class DriverClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		DBConnection dbconn=(DBConnection)ctx.getBean(DBConnection.class);
		System.out.println(dbconn.getConnection());
	}

}
