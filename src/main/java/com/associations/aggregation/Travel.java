package com.associations.aggregation;

public class Travel {

	Vehicle vehicle;

	
	public Travel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Travel(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	public void startJourney()
	{
		vehicle.Start();
		System.out.println("Journey started");
	}
	
}
