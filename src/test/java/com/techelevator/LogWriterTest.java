package com.techelevator;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.junit.Test;

public class LogWriterTest {
	@Test
	public void dateAndTime_returns_date_and_time_of_each_use() throws IOException {
		//Arrange
		LogWriter logWriter = new LogWriter();
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm").format(localDateTime);
		//Act
		String actual = logWriter.dateAndTime();
		//Assert
		Assert.assertEquals(formattedDate, actual);
		
	}
} 

