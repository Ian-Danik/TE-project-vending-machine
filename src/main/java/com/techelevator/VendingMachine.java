package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		// Create Objects that we need a input scanner, a new inventor, a new balance, and a new LogWriter
		Scanner userInput = new Scanner(System.in);
		Inventory a = new Inventory();
		Balance b = new Balance(0.0);
		LogWriter c = null;
		double moneyChange = 0;
		try {
			c = new LogWriter();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	

		// using Infinite while loops to reprompt the menus over and over
		int nums = 1;
		int nums2 = 1;
		int nums3 = 1;
		int nums4 = 1;

		System.out.println("Welcome to The Vendo-Matic 800, Your vending machine of the future What can I do for you?");

		while (nums == 1) {
			System.out.println(" [1] Display Vending Machine Items");
			System.out.println(" [2] Purchase");
			System.out.println((" [3] Exit "));
			String menu1Selection = userInput.nextLine();
			if (menu1Selection.equalsIgnoreCase("1")) {
				a.display();
			}
			if (menu1Selection.equalsIgnoreCase("2")) {
				while (nums2 == 1) {
					System.out.println(" [1] Feed Money");
					System.out.println(" [2] Select Product");
					System.out.println(" [3] Finish Transaction");
					b.displayMoney();
					String menu2Selection = userInput.nextLine();

					if (menu2Selection.equalsIgnoreCase("1")) {
						while (nums3 == 1) {
						
							
							nums3 = 1;
							System.out.println("How much would you like to add?");
							System.out.println("[1] $1.00");
							System.out.println("[2] $2.00");
							System.out.println("[3] $5.00");
							System.out.println("[4] $10.00");
							System.out.println("[5] I am done adding money");
							b.displayMoney();
							moneyChange = 0;
							String menu3Selection = userInput.nextLine();
							if (menu3Selection.equalsIgnoreCase("1")) {
								b.moneyIn(1.00);
								moneyChange += 1;
							}
							if (menu3Selection.equalsIgnoreCase("2")) {
								b.moneyIn(2.00);
								moneyChange += 2;
							}
							if (menu3Selection.equalsIgnoreCase("3")) {
								b.moneyIn(5.00);
								moneyChange += 5;
							}
							if (menu3Selection.equalsIgnoreCase("4")) {
								b.moneyIn(10.00);
								moneyChange += 10;
							}
							if (menu3Selection.equalsIgnoreCase("5")) {
								String afterMoney = b.moneyToString();
								String moneyChangeString = "$" + moneyChange;
								c.printToFile(c.dateAndTime(), "FEED MONEY", moneyChangeString, afterMoney);
								moneyChange = 0;
								break;
							}
						}
					}
					if (menu2Selection.equalsIgnoreCase("2")) { // Purchase goes in here
						a.display();
						while (nums4 == 1) {
							System.out.println("Please select a Slot eg A1 or B3 in that format");
							String selection = userInput.nextLine();
							Snack selected = a.purchaseObject(selection);

							if (selected == null) {
								System.out.println("I'm sorry that is an invalid selection, please try again.");
							} else if (selected.getAmount() >= 1) {
								selected.itemDrop();
								b.moneyOut(selected.getPrice());
								System.out.println(selected.getName() + " $" + selected.getStringPrice() + "\n"
										+ selected.getMsg());
								System.out.println("You have $" + b.getMoney() + " remaining");
								String beforeMoney = "$" + (b.getMoney() + selected.getPrice());
								c.printToFile(c.dateAndTime(), selected.getName(), beforeMoney, b.moneyToString());
							} else if (selected.getAmount() < 1) {
								System.out.println("Sold out! please try again");
							} else {
								System.out.println("I'm Sorry that is an invalid selection, please try again.");
							}
							break;

						}

					}
					if (menu2Selection.equalsIgnoreCase("3")) { // cashOut goes here
						moneyChange += b.getMoney();
						b.cashOut();
						System.out.println("Your change is: ");
						if (b.getQuarters() > 0) {
							System.out.println("Quarters: " + b.getQuarters());
						}
						if (b.getDimes() > 0) {
							System.out.println("Dimes: " + b.getDimes());
						}
						if (b.getNickels() > 0) {
							System.out.println("Nickels: " + b.getNickels());
						}
						if (b.getPennies() > 0) {
							System.out.println("Pennies: " + b.getPennies());
						}
						String moneyChangeString = "" + moneyChange;
						String afterMoney = b.moneyToString();
						c.printToFile(c.dateAndTime(), "GIVE CHANGE", moneyChangeString, afterMoney);
						break;
					}

				}
				//

			}
			if (menu1Selection.equalsIgnoreCase("3")) {
				System.out.println("Thank you for using the Vendo-Matic 800");
				c.closePrinter();
				break;
			}

		}

	}

}
