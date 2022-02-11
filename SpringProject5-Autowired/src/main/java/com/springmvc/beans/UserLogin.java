package com.springmvc.beans;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class UserLogin {
	public static final Logger logger= LogManager.getLogger(UserLogin.class);

	@Autowired
	@Qualifier("reg")
	 private Registration registration;
	 
	 @Autowired
	 @Qualifier("login")
	 private Login login;
	 static String policyno;
	 private String policycategory;
	 private String sumassured;
	 private String premium;
		public Registration getRegistration() {
		 	return registration;
		}
		public void setRegistration(Registration registration) {
			this.registration = registration;
		}
		public Login getLogin() {
			return login;
		}
		public void setLogin(Login login) {
			this.login = login;
		}
		public static String getPolicyno() {
			return policyno;
		}
		public void setPolicyno(String policyno) {
			
		}
		public String getPolicycategory() {
			return policycategory;
		}
		public void setPolicycategory(String policycategory) {
			this.policycategory = policycategory;
		}
		public String getSumassured() {
			return sumassured;
		}
		public void setSumassured(String sumassured) {
			this.sumassured = sumassured;
		}
		public String getPremium() {
			return premium;
		}
		public void setPremium(String premium) {
			this.premium = premium;
		}
		public void registervalidate() {
			System.out.println(registration);
			System.out.println("user sucessfully registered");
		}
		public void loginvalidate()
		{
			System.out.println(login);
			System.out.println("user login sucessfully");
			
		}
		public void policy()
		{
			logger.info("policyno"+policyno);
			logger.info("policy category"+policycategory);
			logger.info("sum assured"+sumassured);
			logger.info("premium"+premium);
			logger.info("Applied...");
	        logger.info("user"+login.getUsername()+":Logout");
			
			
		}
	    
	    
	}