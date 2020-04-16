package dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class TestBean {
	public TestBean() {
	}
	public void m1() {
		System.out.println("From M1");
	}
	public void m2() {
		System.out.println("From M2");
	}
	public void m3() {
		System.out.println("From M3");
	}
	@PostConstruct
	public void postCons() {
		System.out.println("From Post Const");
	}
	@PreDestroy
	public void predest() {
		System.out.println("From Pre Dest");
	}
}
