package com.projectexp0060.user.services;

import com.projectexp0060.Variables;
import com.projectexp0060.user.User;

public class ShowAllUsers {
	public static void showAlluser() {
		System.out.println("<========== User List ============> ");
		for (User user:Variables.users) {
			System.out.println(user);
		}
		System.out.println("<======================>");
	}
}
