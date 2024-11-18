package com.projectexp0060.expense.utils;

public enum PaymentMethod {
	BH("bhim"),
	AM("amazon"),
	CASH("cash");
	
	private String str;
	private PaymentMethod(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return this.str;
	}
}
