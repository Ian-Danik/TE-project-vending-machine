package com.techelevator;

public class Balance {
	private double money;
	private int quarters = 0;
	private int dimes = 0;
	private int nickels = 0;
	private int pennies = 0;

	public double getMoney() {
		return money;
	}

	public int getQuarters() {
		return quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public Balance(double money) {
		this.money = money;
	}

	public double moneyIn(double moneyInput) {
		money += moneyInput;
		return money;
	}

	public void displayMoney() {
		System.out.println("Current money is $" + money);
	}

	public double moneyOut(double moneyInput) {
		money -= moneyInput;
		return money;
	}

	public void cashOut() {
		quarters = 0;
		dimes = 0;
		nickels = 0;
		pennies = 0;
		money = money * 100;
		if (money >= 0) {
			while (money >= 25) {
				quarters++;
				money -= 25;
			}
			while (money >= 10) {
				dimes++;
				money -= 10;
			}
			while (money >= 5) {
				nickels++;
				money -= 5;
			}
			pennies = (int) money;
			money = 0.0;
			
		}

	}

	
	public String moneyToString() {
		return "$" + money;
	}

}
