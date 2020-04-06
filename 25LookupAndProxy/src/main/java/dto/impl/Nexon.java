package dto.impl;

import dto.Car;

public class Nexon implements Car {

	@Override
	public void getSafeSpeed() {
		System.out.println("Nexon Safe Speed is 140km/h");
	}
	
	public void nexonCons() {
		System.out.println("Nexon Post-Construrct");
	}
	
	public void nexonDest() {
		System.out.println("Nexon Pre-Destroy");
	}
}
