	package com.projectexp0060.expense.services;

import java.util.Scanner;

import com.projectexp0060.expense.Expense;
import com.projectexp0060.expense.utils.PaymentMethod;

public class CreateExpense {
	public static Expense create(Scanner sc) {	
		
		System.out.println("Enter Userid");
		int userId = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter ExpType");
		String expType = sc.nextLine();
		
		System.out.println("Enter Description");
		String description = sc.nextLine();
		
		System.out.println("Enter Mid Man");
		String midMan = sc.nextLine();
		
		System.out.println("Enter amount");
		double amount = sc.nextDouble();
		
		System.out.println("Enter paymentMethod");
		String strPaymentMethod = sc.nextLine();
		PaymentMethod paymentMethod = PaymentMethod.valueOf(strPaymentMethod);
		
		Expense expense = new Expense(userId,description,amount,expType,midMan,paymentMethod);
		return expense;
	}
}
