package com.projectexp0060.expense;

import java.time.LocalDate;

import com.projectexp0060.expense.utils.PaymentMethod;

public class Expense {
	private int expId;
	private int userId;
	private String description;
	private double amount;
	private String expType;
	private String middleMan;
	private PaymentMethod paymentMethod;
	private LocalDate expDate;
	
	private static int EXPENSE_ID_GENERATOR = 100;

	public Expense() {
		this.expId = EXPENSE_ID_GENERATOR++;
		this.userId = 00;
		this.description = "";
		this.amount = 0.0;
		this.expType = "";
		this.middleMan = "";
		this.paymentMethod = null;
		this.expDate = LocalDate.now();
	}
	
	public Expense(int userId, String description, double amount, String expType, String middleMan,
			PaymentMethod paymentMethod) {
		this.expId = EXPENSE_ID_GENERATOR++;
		this.userId = userId;
		this.description = description;
		this.amount = amount;
		this.expType = expType;
		this.middleMan = middleMan;
		this.paymentMethod = paymentMethod;
		this.expDate = LocalDate.now();
	}

	@Override
	public String toString() {
		return "Expense [expId=" + expId + ", userId=" + userId + ", description=" + description + ", amount=" + amount
				+ ", expType=" + expType + ", middleMan=" + middleMan + ", paymentMethod=" + paymentMethod
				+ ", expDate=" + expDate + "]";
	}
}
