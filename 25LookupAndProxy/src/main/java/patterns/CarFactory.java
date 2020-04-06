package patterns;
import org.springframework.beans.factory.FactoryBean;

import dto.Car;

public class CarFactory implements FactoryBean<Car>{
	
	private String carName;
	
	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public Car getObject() throws Exception {
		return (Car)Class.forName(carName).newInstance();
	}

	@Override
	public Class<Car> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
