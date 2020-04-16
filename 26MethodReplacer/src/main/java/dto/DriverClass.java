package dto;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		TestBean tb=ctx.getBean(TestBean.class);
		tb.m1();
		tb.m2();
		tb.m3();
		ctx.close();
	}

}
