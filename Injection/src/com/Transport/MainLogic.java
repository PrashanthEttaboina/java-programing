package com.Transport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springlist.xml");
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("constructor.xml");
		
		
		Car c=	(Car) context1.getBean("audi");
		c.move();
		System.out.println();
		
		Bus b= (Bus) context1.getBean("RTC");
		b.move();
		System.out.println();
						
		InjectionList il = (InjectionList) context.getBean("list");
		il.showList();

		System.out.println();
		InjectionList l = (InjectionList) context.getBean("set");
		l.showSet();
		System.out.println();

		InjectionList i = (InjectionList) context.getBean("map");
		i.showmap();

		ConstructorInjection ci = (ConstructorInjection) context2.getBean("test");
		ci.display();
		ConstructorInjection ci1 = (ConstructorInjection) context2.getBean("test1");
		ci1.display();

	}
}
