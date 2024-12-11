package com.projectexp0060.expense.services;

import com.projectexp0060.Variables;
import com.projectexp0060.expense.Expense;

public class ShowExpense {
	public static void show() {	
		System.out.println("<========== Expense's List ============> ");
		for (Expense expense:Variables.expenses) {
			System.out.println(expense);
		}
		System.out.println("<======================>");
	}
}
