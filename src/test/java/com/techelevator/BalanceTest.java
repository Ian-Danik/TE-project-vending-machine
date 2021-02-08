package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class BalanceTest {
	
	@Test
	public void balance_moneyIn_test() {
		//Arrange
		Balance tb = new Balance(10.00);
		 
		//Act
		 double checker = tb.moneyIn(2.0);
		 
		 //Assert
		 Assert.assertEquals(12.0, checker,0);
	}
	

	@Test
	public void balance_display_money_test() {
		//Arrange
		Balance tb = new Balance(10.00);
		
		//Act
		tb.displayMoney();
		//Assert
		Assert.assertEquals(10.0, tb.getMoney(), 0);
	}
	
	@Test
	public void balance_moneyOut_test() {
		//Arrange
		Balance tb = new Balance(10.00);
		
		//Act
		 double checker = tb.moneyOut(2.0);
		 
		 //Assert
		 Assert.assertEquals(8.0, checker,0);
	}
	
	@Test
	public void Balance_cashOut_Test() {
		//Arrange
		Balance tb = new Balance(10.18);
		
		// Act
		tb.cashOut();
		
		//Assert
		
		Assert.assertEquals(40, tb.getQuarters());
		Assert.assertEquals(1, tb.getDimes());
		Assert.assertEquals(1, tb.getNickels());
		Assert.assertEquals(3 , tb.getPennies());
		
	}
	@Test
	public void moneyToString_returns_str_$_plus_money() {
		//Arrange
		Balance tb = new Balance(10.0);
		//Act
		String actual = tb.moneyToString();
		//Assert
		Assert.assertEquals("$10.0",actual);
	}
	
	

}
