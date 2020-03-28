import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DriverClass {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("spring.xml");
		BeanFactory fact=new XmlBeanFactory(r);
		Test t1=(Test)fact.getBean("test");
		Test t2=(Test)fact.getBean("test");
		Test t3=(Test)fact.getBean("test");
		t1.sayHi();
		t2.sayHi();
		t3.sayHi();
	}

}
