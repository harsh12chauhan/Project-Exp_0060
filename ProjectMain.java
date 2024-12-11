package com.projectexp0060;

import java.util.Scanner;

import com.projectexp0060.home.Home;
import com.projectexp0060.user.User;
import com.projectexp0060.user.services.Login;
import com.projectexp0060.user.services.Register;
import com.projectexp0060.user.services.ShowAllUsers;
import com.projectexp0060.user.utils.UserType;

public class ProjectMain {
	public static void main(String[] args) {
		//dummy user's
		Variables.users.add(new User("helloworld","hello@gmail.com","hello123",UserType.USER,false));
		Variables.users.add(new User("john_doe", "john.doe@gmail.com", "john123", UserType.USER, false));
		Variables.users.add(new User("jane_smith", "jane.smith@gmail.com", "jane123", UserType.USER, false));
		Variables.users.add(new User("alice_wonder", "alice.wonder@gmail.com", "alice123", UserType.USER, false));

		
		try(Scanner sc = new Scanner(System.in)){
			int check = 0;
			
			do{
				System.out.println("Enter your choice: ");
				System.out.println("1. Login");
				System.out.println("2. Register");
				System.out.println("0. Exit");
				check = sc.nextInt();
				
				switch(check) {
				
					case 1:{
						if(Login.login(sc)) {
							Home.home(sc);
						}else {
//							ShowAllUsers.showAlluser();
							System.out.println("Incorrect Creditentials !!");
						}
					}break;
					
					case 2:{
						Register.register(sc);
					}break;
					
					case 0:{
						check = 0;
						System.out.println("Thank You !");						
					}break;
					
					default:{
						System.out.println("Invalid Input");
					}break;
				}
			}while(check != 0);
		}
	}
}
