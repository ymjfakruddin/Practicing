package com.lifecycle.beans;

import java.util.Date;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class Voter {
	
	public static final Logger logger= LogManager.getLogger(Voter.class);
	private String name;
	private float age;
	private  Date  dov;

	public Voter() {
		logger.info("Voter:: 0-param constructor");
	}

	public void setName(String name) {
		logger.info("Voter.setName()");
		this.name = name;
	}
	public void setAge(float age) {
          logger.info("Voter.setAge()");
		this.age = age;
	}
	public void setDov(Date dov) {
		logger.info("Voter.setDov()");
		this.dov = dov;
	}

	public  void myInit() {
		System.out.println("Voter.myInit()");
		dov=new Date();  
		boolean flag=false;
		if(name==null) {   
			logger.info(" name must not be null");
			flag=true;
		}

		if(age<0)
			age=age*-1;  

		if(age>100) { 
			System.out.println(" age must not >100");
			flag=true;
		}
		if(flag)
			throw new IllegalArgumentException(" invalid inputs");

	}


	public void myDestroy() {
		logger.info("Voter.myDestroy()");
		
		name=null;
		age=0;
		dov=null;
	}

	//b.method
	public String   checkVotingElgibility() {
		logger.info("Voter.checkVotingElgibility()");
		
		if(age>=18)
			return  "Mr/Miss/Mrs."+name+ "  u  r  eglible for voting::"+age+"-->  on  ->"+dov;
		else
			return  "Mr/Miss/Mrs."+name+ "  u  r not  eglible for voting::"+age+"--> on->"+dov;
	}

}