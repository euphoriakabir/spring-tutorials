import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Test test=(Test)ctx.getBean("test");
		System.out.println(test.getProp().getProperty("driver"));
	}

}
