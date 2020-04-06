package main;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import patterns.CarFactory;

public class FactoryBeanImplementation {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("classfactoryBean.xml");
		CarFactory cfi=(CarFactory)cactx.getBean(CarFactory.class);
		cfi.getObject().getSafeSpeed();
		System.out.println(cfi.getClass().getCanonicalName());
		cactx.close();
	}

}
