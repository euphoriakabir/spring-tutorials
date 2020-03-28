import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		CollectionTest ct=(CollectionTest)ctx.getBean("ct");
		System.out.println(ct);
	}

}
