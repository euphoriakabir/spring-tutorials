package com.awcsoftware.grocerry.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Store store=(Store)ctx.getBean("store");
		Store store1=(Store)ctx.getBean("store2");
		System.out.println(store);
		System.out.println(store1);
	}

}
