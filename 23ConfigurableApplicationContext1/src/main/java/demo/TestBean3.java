package demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class TestBean3 {

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("From DestroyMethod 3");

	}
	public void sampleMethod() {
		System.out.println("Call From Sample Method 3 !");
	}
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("From InitializingMethod 3");

	}

}
