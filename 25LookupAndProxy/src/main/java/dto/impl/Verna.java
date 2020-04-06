package dto.impl;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dto.Car;

public class Verna implements Car {

	@Override
	public void getSafeSpeed() {
		System.out.println("Verna Safe Speed is 120km/h");

	}
	@PostConstruct
	public void vernaCons() {
		System.out.println("Verna Post-Construrct");
	}
	@PreDestroy
	public void vernaDest() {
		System.out.println("Verna Pre-Destroy");
	}
}
