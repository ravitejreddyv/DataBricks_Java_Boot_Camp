package com.ums.client;

import java.util.Scanner;

import com.ums.dao.impl.UserDaoImpl;

public class UserClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		UserDaoImpl daoImpl = new UserDaoImpl();
		while (true) {
			System.out.println("=======================================");
			System.out.println("           1. register user                    ");
			System.out.println("           2. login                             ");
			System.out.println("           3. forgot password              ");
			System.out.println("           4. exit          ");

			System.out.println("=======================================");

			System.out.println("select choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.register();
				break;
			case 2:
				System.out.println("Enter UserName");
				String username = sc.next();
				System.out.println("Enter Password");
				String password = sc.next();
				boolean isValid = daoImpl.verifyUserNameAndPassword(username, password);
				if (isValid) {
					System.out.println("Verified User Successfully");

				} else {
					System.out.println("Invalid Credentials");
				}
				break;
			case 3:
				System.out.println("Enter username to recover passord");
				String userToRecover = sc.next();
				String recoveredPassword = daoImpl.forgotPassword(userToRecover);
				System.out.println("recoveredPassword");

				break;

			case 4:
				System.out.println("Exiting Program");
				sc.close();
				System.exit(0);
				break;

			}
		}

	}

}
