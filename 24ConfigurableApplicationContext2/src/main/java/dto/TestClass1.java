package dto;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class TestClass1 implements InitializingBean, DisposableBean {

	public TestClass1() {
		System.out.println("Test Class Constructor !");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From Init Method");
	}
	
	public void sayHi() {
		System.out.println("Current Date is : "+ new Date());
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("From Disposable Method");

	}



}
