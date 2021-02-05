package com.techelevator;

import org.junit.*;

public class InventoryTest {

	@Test
	public void inventory_constuctor_test() {
		Inventory a = new Inventory();
		
		Assert.assertEquals("A1", a.snackInventory.get(0).getSlot());
		Assert.assertEquals("Potato Crisps", a.snackInventory.get(0).getName());
	}
	
	@Test
	public void display_test() {
		Inventory a = new Inventory();
		
		a.display();
	}

}
