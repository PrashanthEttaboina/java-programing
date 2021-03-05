package com.Transport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springlist.xml");

		InjectionList il = (InjectionList) context.getBean("list");
		il.showList();

		System.out.println();
		InjectionList l = (InjectionList) context.getBean("set");
		l.showSet();
		System.out.println();

		InjectionList i = (InjectionList) context.getBean("map");
		i.showmap();

//		ConstructorInjection c = (ConstructorInjection) context.getBean("test");
//		c.display();
//		ConstructorInjection c1 = (ConstructorInjection) context.getBean("test1");
//		c1.display();

	}
}
