package com.associations.aggregation;

public class TestTraveller {

	
	public static void main(String[] args) {
		
		
		Vehicle vehicle=new Bus();
		
		Travel tr=new Travel(vehicle);
		tr.startJourney();
	}
}
