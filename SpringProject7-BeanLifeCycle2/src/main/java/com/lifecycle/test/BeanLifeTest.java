package com.lifecycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.lifecycle.beans.Voter;

public class BeanLifeTest {
	public static final Logger logger= LogManager.getLogger(BeanLifeTest.class);
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Voter voter=null;
	
		ctx=new ClassPathXmlApplicationContext("com/lifecycle/cfgs/applicationContext.xml");
		
		voter=ctx.getBean("voter",Voter.class);
		logger.info(voter.checkVotingElgibility());

	
		((AbstractApplicationContext) ctx).close();


	}

}