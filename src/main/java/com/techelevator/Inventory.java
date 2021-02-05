package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Inventory {

	List<Snack> snackInventory = new ArrayList<>();

	public Inventory() {
		String path = "vendingMachine.csv";
		File input = new File(path);

		try (Scanner scanner = new Scanner(input)) {
			while (scanner.hasNextLine()) {
				String currentLine = scanner.nextLine();

				String[] a = currentLine.split("\\|");

				snackInventory.add(new Snack(a[0], a[1], a[2], a[3]));

			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}

	public String purchaseItems(String selection) {
		String b = "";
		if (selection == null) {
			b = "selection not found";
			return b;
		}
		for (int i = 0; i < snackInventory.size(); i++) {
			if (selection.equalsIgnoreCase(snackInventory.get(i).getSlot())) {
				 b = (snackInventory.get(i).getName() + " " + snackInventory.get(i).getStringPrice() + " "
						+ snackInventory.get(i).getMsg());
			} else {
				 b = "selection not found"; 
				  
			}
		}
		return b;
	}

	public void display() {
		for (int i = 0; i < snackInventory.size(); i++) {
			System.out.println(snackInventory.get(i).getSlot() + "\t" + snackInventory.get(i).getName() + "\t" + "$"
					+ snackInventory.get(i).getPrice() + "\n");
		}
	}

}