package com.joins;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainLogic {

	public static void main(String[] args) {
		
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Configure.class);
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("==========Joins for Vendor and Customer  =========");
			System.out.println("Select your option\n 1. Right Join \n 2.Left Join \n 3. Inner Join \n 4.Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				RightJoin il=(RightJoin) context.getBean("rjoin");
				il.joinr();
			}
			else if(choice == 2) {
				LeftJoin ul=(LeftJoin) context.getBean("ljoin");
				ul.joinl();
			}
			else if(choice == 3) {
				InnerJoin dl=(InnerJoin) context.getBean("ijoin");
				dl.joini();
			}
			
		}while(choice!=4);	
		
	}

}