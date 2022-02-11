package com.lifecycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lifecycle.beans.Voter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
public class BeanLifeTest {

	public static void main(String[] args) {
		 final Logger logger= LogManager.getLogger( BeanLifeTest.class);
		ApplicationContext ctx=null;
		Voter voter=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/lifecycle/cfgs/applicationContext.xml");
		//get Bean 
		voter=ctx.getBean("voter",Voter.class);
		logger.info(voter.checkVotingElgibility());

		//close container
		((AbstractApplicationContext) ctx).close();


	}

}