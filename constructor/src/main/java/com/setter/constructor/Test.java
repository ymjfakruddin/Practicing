package com.setter.constructor;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Customer c = (Customer) context.getBean("e");
        c.display();
 
    }
}