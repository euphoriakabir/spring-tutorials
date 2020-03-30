package com.awcsoftware.mechanical.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Engine en=(Engine)ctx.getBean("en");
		System.out.println(en);
	}

}
