package com.springmvc.beans;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class AdminAccept {

	public static final Logger logger= LogManager.getLogger(AdminAccept.class);
	
	@Autowired
	@Qualifier("user")
	 private UserLogin userlogin;
	
	@Autowired
	@Qualifier("a")
	 private Admin admin;
	
	@Autowired
	@Qualifier("login")
	 private Login login;
	 
		
	public AdminAccept(Login usr,Admin al,UserLogin up) {
		this.login=usr;
		this.admin=al;
		this.userlogin=up;
	}
	public void adminvalidate()
	{
		logger.info(admin);
		logger.info("admin login sucessfully");
		
	}
	public void policyaccept()
	{
		
		logger.info("Approved[username:"+login.username+",Policy no:"+userlogin.policyno+"]");
		
		
	}
	    
	    
	}