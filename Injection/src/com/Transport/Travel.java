package com.Transport;

public class Travel implements Journey {

	Vehicle vehicle;
	
	public void startJourney() {
		System.out.println("Journey started...");
		vehicle.move();
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
