package com.scope.beans;

public class WishMessageGenerator {

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	public  String sayHello(String user) {
		return "Good Morning:"+user;
	}

}