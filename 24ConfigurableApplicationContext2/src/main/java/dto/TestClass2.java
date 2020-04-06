package dto;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class TestClass2 {

	public TestClass2() {
		System.out.println("Test Class 2 Constructor !");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("From Init 2 Method");
	}
	
	public void sayHi() {
		System.out.println("Current Date is : "+ new Date());
	}
	
	
	public void destroy() throws Exception {
		System.out.println("From Disposable2  Method");

	}



}
