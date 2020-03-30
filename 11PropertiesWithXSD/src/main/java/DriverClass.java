import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		PropertiesReader pr=(PropertiesReader)ctx.getBean("properties");
		System.out.println(pr.getProp().getProperty("driver"));
	}

}
