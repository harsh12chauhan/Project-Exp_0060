package com.projectexp0060.user.services;

import java.util.Scanner;

import com.projectexp0060.Variables;
import com.projectexp0060.user.User;

public class Login {
	public static boolean login(Scanner sc) {
		
		System.out.println("Enter your email");
		String email = sc.nextLine();
		
		System.out.println("Enter your password");
		String password = sc.nextLine();
		
		//validate 
		for(User user:Variables.users) {
			if ( user.getEmail() == email && user.getPassword() == password ) {
				return true;
			}
		}
		
		return false;
	}
}
