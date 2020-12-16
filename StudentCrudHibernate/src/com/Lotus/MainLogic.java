package com.Lotus;

import java.util.Scanner;

public class MainLogic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("Select your option\n 1. Insert\n 2. Update\n 3. Display\n 4. Delete\n 5. Exit");
			choice=sc.nextInt();
			if(choice == 1) {
				InsertLogic.insert();
			}else if(choice == 2) {
				UpdateLogic.update();
			}else if(choice == 3) {
				DisplayLogic.display();
			}else if(choice == 4) {
				DeleteLogic.delete();
			}
		}while(choice!=5);
		
	}

}
