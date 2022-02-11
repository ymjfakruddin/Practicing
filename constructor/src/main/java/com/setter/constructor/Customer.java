package com.setter.constructor;

public class Customer {
	public static final Logger logger= LogManager.getLogger(Customer.class);
    private int id;
    private String name;
    private Address address;
 
    public Customer(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
 
    void display() {
        logger.info("Customer ID: " + id + " Name: " + name);
        logger.info(address.toString());
    }
 
}