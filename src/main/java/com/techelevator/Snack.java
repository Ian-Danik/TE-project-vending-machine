package com.techelevator;

public class Snack {

	private String name;
	private String type;
	private String slot;
	private String msg = "";
	private double price;
	private String stringPrice = "";
	private  int amount = 5; 

	public Snack(String slot, String name, String stringPrice, String type) {

		this.slot = slot;
		this.name = name;
		this.stringPrice = stringPrice;
		price = Double.parseDouble(stringPrice);
		this.type = type;

		if (type.equalsIgnoreCase("chip")) {
			msg = "Crunch Crunch, Yum!";
		} else if (type.equalsIgnoreCase("candy")) {
			msg = "Munch Munch, Yum!";
		} else if (type.equalsIgnoreCase("drink")) {
			msg = "Glug Glug, Yum!";
		} else if (type.equalsIgnoreCase("gum")) {
			msg = "Chew Chew, Yum!";
		}
	}
	
	public int itemDrop() {
		 amount--;
		 return amount;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSlot() {
		return slot;
	}

	public String getMsg() {
		return msg;
	}

	public double getPrice() {
		return price;
	}

	public String getStringPrice() {
		return stringPrice;
	}
	public int getAmount() {
		return amount;
	}

}
