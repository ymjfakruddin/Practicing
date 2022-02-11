package com.scope.test;


import java.lang.reflect.Constructor;

import com.scope.beans.Printer;

public class AccessingPrivateConstructorTest {

	public static void main(String[] args) {
		  try {
			 
			  Class c=Class.forName("com.scope.beans.Printer");
			 
			  Constructor cons[]=c.getDeclaredConstructors();
			 
			 
			  
			  Printer  p1=(Printer) cons[0].newInstance();
			  Printer  p2=(Printer) cons[0].newInstance();
			  
			  System.out.println(p1.hashCode()+"  "+p2.hashCode());
			  
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
	}
}