import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		DBCredentials dbc=(DBCredentials)ctx.getBean("dbc");
		System.out.println(dbc);
	}

}
