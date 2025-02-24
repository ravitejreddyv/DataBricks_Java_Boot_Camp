package com.ums.model;

public class User {
private int uid;
private String firstname;
private String lastname;
private String emailadd;
private String username;
private String password;
public User(int uid, String firstname, String lastname, String emailadd, String username, String password) {
	super();
	this.uid = uid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.emailadd = emailadd;
	this.username = username;
	this.password = password;
}
public User() {
	// TODO Auto-generated constructor stub
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmailadd() {
	return emailadd;
}
public void setEmailadd(String emailadd) {
	this.emailadd = emailadd;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}




}
