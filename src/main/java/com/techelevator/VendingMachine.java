package com.techelevator;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		// Create Objects
		Scanner userInput = new Scanner(System.in);
		Inventory a = new Inventory();
		Balance b = new Balance(0.0);

		// My While loop keys
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
					System.out.println(" [3] Exit");
					b.displayMoney();
					String menu2Selection = userInput.nextLine();
					nums2 = 1;

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
							String menu3Selection = userInput.nextLine();
							if (menu3Selection.equalsIgnoreCase("1")) {
								b.moneyIn(1.00);
							}
							if (menu3Selection.equalsIgnoreCase("2")) {
								b.moneyIn(2.00);
							}
							if (menu3Selection.equalsIgnoreCase("3")) {
								b.moneyIn(5.00);
							}
							if (menu3Selection.equalsIgnoreCase("4")) {
								b.moneyIn(10.00);
							}
							if (menu3Selection.equalsIgnoreCase("5")) {
								break;
							}
						}
					}
					if (menu2Selection.equalsIgnoreCase("2")) { // Purchase goes in here
						a.display();
						while(nums4 ==1){
							System.out.println("Please select a Slot eg A1 or B3 in that format");
							String selection = userInput.nextLine();
						}
						

					}
					if (menu2Selection.equalsIgnoreCase("3")) { // cashOut goes here
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
						break;
					}

				}
				//

			}
			if (menu1Selection.equalsIgnoreCase("3")) {
				System.out.println("Thank you for using the Vendo-Matic 800");
				break;
			}

		}

	}

}
