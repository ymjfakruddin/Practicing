package com.info.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.info.cfgs.AppConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext a=new AnnotationConfigApplicationContext(AppConfig.class);
        User obj=(User)a.getBean(User.class);
       
        obj.registercheck();
        obj.logincheck();
        obj.avbslots();
       
    }
}