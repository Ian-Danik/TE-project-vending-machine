package com.techelevator;

import java.util.List;

import org.junit.*;

public class InventoryTest {

	@Test
	public void inventory_constuctor_test() {
		// Arrange
		Inventory a = new Inventory();
		// Assert
		Assert.assertEquals("A1", a.snackInventory.get(0).getSlot());
		Assert.assertEquals("Potato Crisps", a.snackInventory.get(0).getName());
	}

	@Test
	public void display_test() { 

		Inventory a = new Inventory();

		a.display();
	}
	@Test
	public void purchaseObjects_returns_selector() {
		//Arrange
		Inventory inventory = new Inventory();
		Snack expectedSnack = new Snack ("B1", "Moonpie","1.80", "Candy");
		//Act
		Snack actualSnack = inventory.purchaseObject("B1");
		//Assert
		Assert.assertEquals("B1", actualSnack);
	}

}
