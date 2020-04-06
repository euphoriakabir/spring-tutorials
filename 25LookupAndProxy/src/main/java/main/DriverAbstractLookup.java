package main;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import patterns.AbstractCar;

public class DriverAbstractLookup {

	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("abstractLookup.xml");
		AbstractCar cfi=(AbstractCar)cactx.getBean(AbstractCar.class);
		cfi.getCar().getSafeSpeed();
		System.out.println(cfi.getClass().getCanonicalName());
		cactx.close();
	}

}
