package com.info.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.cfgs.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext applicationcontext=new AnnotationConfigApplicationContext(AppConfig.class);
      User obj=(User)applicationcontext.getBean(User.class);
     
        obj.registercheck();
        obj.logincheck();
        obj.avbslots();
    }
}