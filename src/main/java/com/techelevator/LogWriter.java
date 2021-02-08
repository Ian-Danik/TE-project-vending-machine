package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogWriter {

	PrintWriter pw = null; 

	
	public LogWriter() throws IOException {
		String path = "./log.txt";
		File output = new File(path);

		FileWriter appender = new FileWriter(output, true);
		pw = new PrintWriter(appender);
		pw.println("Audit Log Started"); 
	}

	
	public String dateAndTime() {
		LocalDateTime a = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
		String formatDateTime = a.format(format);
		return formatDateTime;
	}

	
	public void printToFile(String toWrite1, String toWrite2, String toWrite3, String toWrite4) {
		pw.println(toWrite1 + " " + toWrite2 + " " + toWrite3 + " " + toWrite4);

	}

	public void closePrinter() {
		pw.flush();
		pw.close();
	}

}
