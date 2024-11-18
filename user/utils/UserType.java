package com.projectexp0060.user.utils;

public enum UserType {
	USER("user"),
	ADMIN("admin");
	
	private String str;
	private UserType(String str) {
		this.str = str;
	}
	
	public String getValue() {
		return this.str;
	}
}
