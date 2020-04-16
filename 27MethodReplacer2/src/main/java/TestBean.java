import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TestBean implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Method Call");
	}
	public void m1() {
		System.out.println("From m1");
	}
	public void m2() {
		System.out.println("From m2");
	}
	public void m3() {
		System.out.println("From m3");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Post Initination Method");
	}
}
