package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DBDetails;

public class DriverClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		DBDetails dbd=ctx.getBean(DBDetails.class);
		System.out.println(dbd);
	}

}
