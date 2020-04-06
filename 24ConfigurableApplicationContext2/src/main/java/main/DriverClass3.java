package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.TestClass3;

public class DriverClass3 {

	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("annotation.xml");
		TestClass3 tc=(TestClass3)cactx.getBean(TestClass3.class);
		tc.sayHi();
		cactx.close();
	}
}
