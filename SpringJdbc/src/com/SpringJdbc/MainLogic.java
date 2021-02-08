package com.SpringJdbc;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("springjdbc.xml");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("========== One Piece Pirates =========");
			System.out.println("Select your option\n 1. Add Pirate \n 2. Update Priate \n 3. Display Pirate \n 4. Delete Pirate \n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				InsertLogic il=(InsertLogic) context.getBean("insert");
				il.insert();
			}
			else if(choice == 2) {
				UpdateLogic ul=(UpdateLogic) context.getBean("update");
				ul.update();
			}
			else if(choice == 3) {
				DisplayLogic dl=(DisplayLogic) context.getBean("display");
				dl.display();
			}
			else if(choice == 4) {
				DeleteLogic dl=(DeleteLogic) context.getBean("delete");
				dl.delete();
			}
		}while(choice!=5);		
	}
}
