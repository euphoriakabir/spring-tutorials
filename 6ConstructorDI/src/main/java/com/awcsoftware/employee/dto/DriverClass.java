package com.awcsoftware.employee.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee)ctx.getBean("employee");
		System.out.println(emp);
	}
}
