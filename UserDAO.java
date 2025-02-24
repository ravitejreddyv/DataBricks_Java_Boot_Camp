package com.ums.dao;

public interface UserDAO {
	void register();
	boolean verifyUserNameAndPassword(String username, String password);
	String forgotPassword(String username);
	

}
