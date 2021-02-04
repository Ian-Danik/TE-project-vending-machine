package com.techelevator;

public class Chips implements Purchasable{
	private String type = "chips";
	private String message = "Crunch Crunch, Yum!";
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
