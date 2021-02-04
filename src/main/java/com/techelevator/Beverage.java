package com.techelevator;

public class Beverage implements Purchasable {
	private String type = "beverage";
	private String message = "Glug Glug, Yum!";
	private String name;
	private double price;
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	private String getType() {
		return type;
	}
	private String getMessage() {
		return message;
	}
}
