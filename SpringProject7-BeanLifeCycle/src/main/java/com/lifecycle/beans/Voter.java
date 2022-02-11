package com.lifecycle.beans;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("voter")
public class Voter{
	public static final Logger logger= LogManager.getLogger(Voter.class);

	@Value("radha")
	private String name;
	@Value("30")
	private float age;
	private  Date  dov;

	public Voter() {
		System.out.println("Voter:: 0-param constructor");
	}

	public void setName(String name) {
		System.out.println("Voter.setName()");
		this.name = name;
	}
	public void setAge(float age) {
		System.out.println("Voter.setAge()");
		this.age = age;
	}
	public void setDov(Date dov) {
		logger.info("Voter.setDov()");
		this.dov = dov;
	}

	
	@PostConstruct
	public  void myInit() {
		System.out.println("Voter.myInit()");
		dov=new Date();  
		var flag=false;
		if(name==null) {  
			logger.info(" name must not be null");
			flag=true;
		}

		if(age<0)
			age=age*-1;  

		if(age>100) {  
			logger.info(" age must not >100");
			flag=true;
		}
		if(flag)
			throw new IllegalArgumentException(" invalid inputs");

	}

		
	 @PreDestroy
		public void myDestroy() {
			logger.info("Voter.myDestroy()");
			 
			name=null;
			age=0;
			dov=null;
		}


	public String   checkVotingElgibility() {
		logger.info("Voter.checkVotingElgibility()");
		
		if(age>=18)
			return  "Mr/Miss/Mrs."+name+ "  u  r  eglible for voting::"+age+"-->  on  ->"+dov;
		else
			return  "Mr/Miss/Mrs."+name+ "  u  r not  eglible for voting::"+age+"--> on->"+dov;
	}

}