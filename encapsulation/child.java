package com.practice.encapsulation;

public class child extends parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parent p=new parent();
		p.salary=20000;
		System.out.println(p.salary);
		
		p.setAge();
		System.out.println(p.getAge());
		p.setName();
		System.out.println(p.getName());
	}

}
