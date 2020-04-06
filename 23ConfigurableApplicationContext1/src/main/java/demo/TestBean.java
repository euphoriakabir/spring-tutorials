package demo;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("From DestroyMethod");

	}
	public void sampleMethod() {
		System.out.println("Call From Sample Method !");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("From InitializingMethod");

	}

}
