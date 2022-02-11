package com.springmvc.beans;

public class Admin {
	
	private String username;
	private String password;
	public Admin(String usr,String psw)
	{
		this.username=usr;
		this.password=psw;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
	

}