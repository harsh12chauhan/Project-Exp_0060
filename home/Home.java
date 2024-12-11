package com.projectexp0060.home;

import java.util.Scanner;

import com.projectexp0060.expense.services.CreateExpense;
import com.projectexp0060.expense.services.DeleteExpense;
import com.projectexp0060.expense.services.ShowExpense;
import com.projectexp0060.expense.services.UpdateExpense;

public class Home {
	public static void home(Scanner sc) {
		int check = 0;
				
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Create Expense");
			System.out.println("2. Update Expense");
			System.out.println("3. Delete Expense");
			System.out.println("4. Show Expense's");
			System.out.println("0. Logout");
			check = sc.nextInt();
			
			switch(check) {
			case 1:{
				CreateExpense.create(sc);
			}break;
			case 2:{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				UpdateExpense.update(id);
			}break;
			case 3:{
				System.out.println("Enter your id");
				int id = sc.nextInt();
				DeleteExpense.Delete(id);
			}break;
			case 4:{
				ShowExpense.show();
			}break;
			case 0:{
				check = 0;
				System.out.println("Logged Out, See you soon !");				
			}break;
			default:{
				System.out.println("Invalid Input!");
			}break;
			}
		}while(check != 0);
	}
}
