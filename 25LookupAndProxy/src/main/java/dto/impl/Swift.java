package dto.impl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import dto.Car;

public class Swift implements Car,InitializingBean,DisposableBean{

	@Override
	public void getSafeSpeed() {
		System.out.println("Swift Safe Speed is 110km/h");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I'm being called from PreDestroy Method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I'm being called from PostConstruct Method");
	}
	
}
