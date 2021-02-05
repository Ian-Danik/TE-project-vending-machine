package com.techelevator;

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

//	@Test
//	public void purchaseItems_returns_null() {
//		// Arrange
//		Inventory inventory = new Inventory();
//		String b = null;
//		// Act
//		String inventoryResult = inventory.purchaseItems(b);
//		// Assert
//		Assert.assertEquals("selection not found", inventoryResult);
//	}
//
//	@Test
//	public void purchaseItems_returns_selection() {
//		// Arrange
//		Inventory inventory = new Inventory();
//		String b = null;
//		// Act
//		String inventoryResult = inventory.purchaseItems(b);
//		// Assert
//		Assert.assertEquals("selection not found", inventoryResult);
//	}

}
