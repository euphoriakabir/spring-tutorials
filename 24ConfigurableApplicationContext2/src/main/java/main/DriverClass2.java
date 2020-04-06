package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.TestClass1;
import dto.TestClass2;

public class DriverClass2 {

	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("declarative.xml");
		TestClass2 tc=(TestClass2)cactx.getBean(TestClass2.class);
		tc.sayHi();
		cactx.close();
	}
}
