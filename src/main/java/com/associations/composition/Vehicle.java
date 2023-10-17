package com.associations.composition;

public class Vehicle {

	int model;
	String name;
	Engine engine;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Vehicle(int model, String name, Engine engine) {
		super();
		this.model = model;
		this.name = name;
		this.engine = engine;
	}


	
	public void moveVehicle()
	{
		if(engine.startEngine())
			System.out.println("Vehicle is moving!!!");
		else
			System.out.println("Vehicle will not move ");
	}
	
}
