package com.ninja;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainOperator {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springhibernate.xml");
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("========== Ninja Databook =========");
			System.out.println("Select your option\n 1. Add Ninja \n 2. Update Ninja \n 3. Display Ninja \n 4. Delete Ninja \n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				InsertMain il=(InsertMain) context.getBean("hibernateinsert");
				il.insert();
			}
			else if(choice == 2) {
				UpdateMain ul=(UpdateMain) context.getBean("hibernateupdate");
				ul.update();
			}
			else if(choice == 3) {
				DisplayMain dl=(DisplayMain) context.getBean("hibernatedisplay");
				dl.display();
			}
			else if(choice == 4) {
				DeleteMain dl=(DeleteMain) context.getBean("hibernatedelete");
				dl.delete();
			}
		}while(choice!=5);	
		
		
	}

}
