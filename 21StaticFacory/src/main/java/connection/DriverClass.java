package connection;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		for(int i=0;i<10;i++) {
			Connection c=(Connection)ctx.getBean("c");
			System.out.println(c);
		}
	}

}
