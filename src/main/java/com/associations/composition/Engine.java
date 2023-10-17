package com.associations.composition;

public class Engine {

	boolean capacity;
	boolean type;
	
	
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Engine(boolean capacity, boolean type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	
	
	public boolean startEngine()
	{
		if(capacity && type)
		{
		System.out.println("Engine started!!!!");
		return true;
		}
		else
		{
			System.out.println("Engine will not start");
			return false;
		}
	}
}
