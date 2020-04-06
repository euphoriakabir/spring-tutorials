package main;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.Car;

public class DriverInterfaceLookup {

	public static void main(String[] args) {
		ConfigurableApplicationContext cactx=new ClassPathXmlApplicationContext("interfaceLookup.xml");
		Car c=cactx.getBean(Car.class);
		c.getSafeSpeed();
		cactx.close();
	}

}
