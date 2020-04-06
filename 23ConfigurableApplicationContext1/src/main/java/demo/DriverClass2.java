package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("spring2.xml");
		TestBean2 tb=(TestBean2)cactx.getBean(TestBean2.class);
		tb.sampleMethod();
		cactx.close();
	}
	
}
