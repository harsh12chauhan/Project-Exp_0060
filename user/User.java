package com.projectexp0060.user;

import java.time.LocalDate;

import com.projectexp0060.user.utils.UserType;


public class User {
	private int userId;
	private String userName;
	private String email;
	private String password;
	private UserType userType;
	private boolean isLogedIn;
	private LocalDate dateOfRegister;
	
	private static int USER_ID_GENERATOR = 100;
	
	public User() {
		this.userId = USER_ID_GENERATOR++;
		this.userName = "";
		this.email = "";
		this.password = "";
		this.userType = null;
		this.isLogedIn = false;
		this.dateOfRegister = LocalDate.now();
	}
	
	public User(String userName, String email, String password, UserType userType, boolean isLogedIn) {
		this.userId = USER_ID_GENERATOR++;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.isLogedIn = isLogedIn;
		this.dateOfRegister = LocalDate.now();
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", userType=" + userType + ", isLogedIn=" + isLogedIn + ", dateOfRegister=" + dateOfRegister + "]";
	}
}
