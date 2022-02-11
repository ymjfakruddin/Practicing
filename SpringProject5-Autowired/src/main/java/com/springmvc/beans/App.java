package com.springmvc.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	ApplicationContext ctx=null;
    	ctx=new ClassPathXmlApplicationContext("com/springmvc/cfgs/applicationContext.xml");
         UserLogin obj=(UserLogin) ctx.getBean(UserLogin.class);
        
         obj.registervalidate();
         obj.loginvalidate();
         obj.policy();
         
         AdminAccept obj1=(AdminAccept)ctx.getBean(AdminAccept.class);
         obj1.adminvalidate();
         obj1.policyaccept();
    
    
    }
}