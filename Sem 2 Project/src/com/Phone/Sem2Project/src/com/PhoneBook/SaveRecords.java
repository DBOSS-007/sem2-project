package com.PhoneBook;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SaveRecords {

		    public static void main(String[] args) {
		        // Create a list to store the records
		        List<String> records = new ArrayList<>();

		        // Create a scanner to read user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user for records until they enter 'quit'
		        while (true) {
		            System.out.print("Enter a record (or 'quit' to exit): ");
		            String record = scanner.nextLine();
		            if (record.equalsIgnoreCase("quit")) {
		                break;
		            }
		            records.add(record);
		        }

		        // Specify the file name to save the records
		        String fileName = "records.txt";

		        // Save the records to the file
		        try (FileWriter writer = new FileWriter(fileName)) {
		            // Write each record to a new line in the file
		            for (String record : records) {
		                writer.write(record + System.lineSeparator());
		            }
		            System.out.println("Records saved to " + fileName);
		        } catch (IOException e) {
		            System.out.println("An error occurred while saving the records to the file.");
		            e.printStackTrace();
		        }
		    }
}


