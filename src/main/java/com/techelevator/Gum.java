package com.techelevator;

public class Gum implements Purchasable {
	
	private String name;
	private String Type = "gum";
	private String msg = "Chew Chew, Yum!";
	private double price;
	
	
	
	public String getName() {
		this.name = name;
		return name;
	}
	public double getPrice() {
		this.price = price;
		return price;
	}

}
