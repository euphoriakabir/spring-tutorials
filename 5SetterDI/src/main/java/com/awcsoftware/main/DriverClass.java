package com.awcsoftware.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awcsoftware.employee.dto.Employee;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee)ctx.getBean("emp");
		System.out.println(emp);
	}
}
