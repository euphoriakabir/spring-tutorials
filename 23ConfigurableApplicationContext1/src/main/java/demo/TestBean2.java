package demo;

public class TestBean2 {

	
	public void destroy() throws Exception {
		System.out.println("From DestroyMethod 2");

	}
	public void sampleMethod() {
		System.out.println("Call From Sample Method  2!");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("From InitializingMethod 2");

	}

}
