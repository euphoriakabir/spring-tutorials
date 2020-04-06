package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("spring.xml");
		TestBean tb=(TestBean)cactx.getBean(TestBean.class);
		tb.sampleMethod();
		cactx.close();
	}
	
}
