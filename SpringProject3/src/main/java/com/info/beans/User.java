package com.info.beans;

import com.info.cfgs.Login;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class User{
	public static final Logger logger= LogManager.getLogger(User.class);
	private String name;
	private String flatNo;
	private Login login;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	
	public void registercheck() {
		
		logger.info("user succesfully registered");
	}
	public void logincheck()
	{
		
		logger.info(login);
		logger.info("user login successfully");
	}
	public void avbslots() {
		logger.info("name: "+name);
		logger.info("FlatNo: "+flatNo);
		
			}
	
	

}
