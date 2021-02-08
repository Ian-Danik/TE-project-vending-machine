package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SnackTest { 
	@Test
	public void Snack_returns_crunch_crunch_yum_if_type_chip_is_called() {
		//Arrange
		Snack snack = new Snack("A1", "Munchos","1.00", "chip");
		//Act
		String snackResult = snack.getMsg();
		//Assert
		Assert.assertEquals("Crunch Crunch, Yum!", snackResult);
	}
	@Test
	public void Snack_returns_munch_munch_yum_if_type_candy_is_called() {
		//Arrange
		Snack snack = new Snack("b1", "Twix","1.50", "candy");
		//Act
		String snackResult = snack.getMsg();
		//Assert
		Assert.assertEquals("Munch Munch, Yum!", snackResult);
	}
	@Test
	public void Snack_returns_glug_glug_yum_if_type_drink_is_called() {
		//Arrange
		Snack snack = new Snack("C1", "Coke","2.00", "drink");
		//Act
		String snackResult = snack.getMsg();
		//Assert
		Assert.assertEquals("Glug Glug, Yum!", snackResult);
	}
	@Test
	public void Snack_returns_chew_chew_yum_if_type_gum_is_called() {
		//Arrange
		Snack snack = new Snack("D1", "Bazooka Joe","0.75", "gum");
		//Act
		String snackResult = snack.getMsg();
		//Assert
		Assert.assertEquals("Chew Chew, Yum!", snackResult);
	}
	@Test
	public void itemDrop_returns_amount_with_one_less_item() {
		//Arrange
		Snack snack = new Snack("A1", "Cheetios","1.50", "chips");
		//Act
		int dropItem = snack.itemDrop();
		//Assert
		Assert.assertEquals(4, dropItem); 
	}
	 
	

}
