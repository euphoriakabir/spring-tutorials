import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Test test1= (Test)ctx.getBean("test");
		test1.getTime();
		Test test2= (Test)ctx.getBean("test");
		test2.getTime();
		System.out.println(test1==test2);
	}

}
