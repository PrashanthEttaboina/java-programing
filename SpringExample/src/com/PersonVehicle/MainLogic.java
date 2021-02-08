package com.PersonVehicle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		BeanFactory factory=context;
	    Object o=factory.getBean("prashanth");
	    Person p=(Person) o;
		System.out.println(p.getPid()+" "+p.getPname());
		o=factory.getBean("benz");
		Vehicle e=(Vehicle)o;
		System.out.println(e.getVid()+" "+e.getVname());
	}

}
