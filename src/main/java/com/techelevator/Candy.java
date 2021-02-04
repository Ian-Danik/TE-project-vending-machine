package com.techelevator;

public class Candy implements Purchasable {
	
	private String name;
	private String Type = "candy";
	private String msg = "Munch Munch, Yum!";
	private double price;
	
	
	
	public String getName() {
		return name;
	}
	public String getType() {
		return Type;
	}
	public String getMsg() {
		return msg;
	}
	public double getPrice() {
		return price;
	}
	


}
