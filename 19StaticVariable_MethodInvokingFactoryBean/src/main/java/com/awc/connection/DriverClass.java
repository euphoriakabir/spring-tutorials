package com.awc.connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		DBConnection dbc=(DBConnection)ctx.getBean(DBConnection.class);
		System.out.println(dbc.getConnection());
	}
}
