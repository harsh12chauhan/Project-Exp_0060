package com.projectexp0060;

import java.util.Scanner;

import com.projectexp0060.user.services.Register;
import com.projectexp0060.user.services.ShowAllUsers;

public class ProjectMain {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int check = 1;
			while(check != 0) {
				Register.register(sc);
				System.out.println("Enter more:");
				check = sc.nextInt();
				sc.nextLine();
			}
			
			ShowAllUsers.showAlluser();
		}
	}
}
