package com.associations.composition;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engine=new Engine(true,true);
		
		Vehicle vehicle=new Vehicle(2016,"dzire",engine);
		vehicle.moveVehicle();
	}

}
