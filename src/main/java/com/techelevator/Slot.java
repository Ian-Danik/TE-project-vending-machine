package com.techelevator;


public class Slot {

	private String slotName;
	private int amount = 5;
	
	public Slot(String slotName) {
		this.slotName = slotName;
	}

	
	public int itemOut() {
		amount--;
		return amount;
	}


	public int getAmount() {
		return amount;
	}


	public String getSlotName() {
		return slotName;
	}
}
