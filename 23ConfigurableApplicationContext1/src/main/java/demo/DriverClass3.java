package demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass3 {
	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("spring3.xml");
		TestBean3 tb=(TestBean3)cactx.getBean(TestBean3.class);
		tb.sampleMethod();
		cactx.close();
	}
	
}
