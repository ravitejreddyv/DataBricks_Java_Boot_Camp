package com.ums.dao.impl;

import java.util.Scanner;

import com.ums.dao.UserDAO;
import com.ums.model.User;

public class UserDaoImpl implements UserDAO {

	private static User[] registerUsers = null;
	Scanner sc = new Scanner(System.in);

	@Override
	public void register() {

		registerUsers = new User[3];
		for (int i = 0; i < 3; ++i) {
			System.out.println(" Enter UserName");
			String username = sc.next();
			System.out.println(" Enter FirstName");
			String firstname = sc.next();
			System.out.println("Enter LastName");
			String lastname = sc.next();
			System.out.println("Enter Email");
			String emailadd = sc.next();
			System.out.println("Enter User ID");
			int uid = sc.nextInt();
			System.out.println("Enter Password");
			String password = sc.next();

			User user = new User(uid, firstname, lastname, emailadd, username, password);
			registerUsers[i] = user;
			System.out.println("User registered Succesfully");

		}
	}

	@Override
	public boolean verifyUserNameAndPassword(String username, String password) {
		if (registerUsers == null) {
			System.out.println("No users registered.");
			return false;
		}
		for (User user : registerUsers) {
			if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true; // Username and password match
			}
		}
		return false; // No match found
	}

	@Override
	public String forgotPassword(String username) {
		if (registerUsers == null) {
			return "No users registered.";
		}
		for (User user : registerUsers) {
			if (user != null && user.getUsername().equals(username)) {
				return "Your password is: " + user.getPassword(); // Return the password
			}
		}
		return "User not found.";
	}
}