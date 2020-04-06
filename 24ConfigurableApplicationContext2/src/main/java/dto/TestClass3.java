package dto;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class TestClass3 {

	public TestClass3() {
		System.out.println("Test Class 3 Constructor !");
	}
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("From Init 3 Method");
	}
	
	public void sayHi() {
		System.out.println("Current Date is : "+ new Date());
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("From Disposable 3  Method");

	}



}
