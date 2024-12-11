package com.projectexp0060.user.services;

import java.util.Scanner;

import com.projectexp0060.Variables;
import com.projectexp0060.user.User;
import com.projectexp0060.user.utils.UserType;

public class Register {
	public static void register(Scanner sc) {
		
		sc.nextLine();
		System.out.println("Enter username");
		String userName = sc.nextLine();
		
		System.out.println("Enter email");
		String email = sc.nextLine();
		
		System.out.println("Enter password");
		String password = sc.nextLine();
		
		User user = new User(userName,email,password,UserType.USER,false);
		Variables.users.add(user);
		
		System.out.println("Registered Successfully !");
	}
}
