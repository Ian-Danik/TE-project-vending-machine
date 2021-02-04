package com.techelevator;

public class Candy implements Purchasable {
	
	private String name;
	private String Type = "candy";
	private String msg = "Munch Munch, Yum!";
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
