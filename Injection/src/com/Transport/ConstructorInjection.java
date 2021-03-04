package com.Transport;

public class ConstructorInjection {

	String name;
	String office;
	int salary;
	
	ConstructorInjection()
	{
		System.out.println("This is constructor injection");
	}

	public ConstructorInjection(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}

	public ConstructorInjection(String name, String office, int salary) {
		
		this.name = name;
		this.office = office;
		this.salary = salary;
	}

	void display()
	{
		System.out.println(name+","+office+","+salary);
	}
	
	
	
}
