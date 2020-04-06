package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.TestClass1;

public class DriverClass1 {

	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("interfaces.xml");
		TestClass1 tc=(TestClass1)cactx.getBean(TestClass1.class);
		tc.sayHi();
		cactx.close();
	}
}
