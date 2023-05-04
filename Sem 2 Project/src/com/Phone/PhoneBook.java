package com.Phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PhoneBook {

	/**
	 * A simple phone book program that allows users to add, delete, modify, search,
	 * display all, and count contacts. Contact information is stored in a text file
	 * and loaded when the program starts, and saved when the program ends. Contacts
	 * are identified by their phone number, which serves as the key field.
	 */
	public class PhoneBook2 {
	    private static final String FILENAME = "phonebook.txt"; // file name to store contact information
	    private static final int PAGE_SIZE = 10; // number of contacts to display per page
	    
	    private static List<Contact> contacts; // list of all contacts in the phone book
	    
	    /**
	     * The main method of the program. Displays a menu of options to the user and
	     * allows them to perform various operations on the phone book.
	     */
	    public static void main(String[] args) {
	        loadContacts(); // load contacts from file
	        
	        Scanner scanner = new Scanner(System.in);
	        boolean quit = false;
	        
	        while (!quit) {
	            System.out.println("Choose an option:");
	            System.out.println("1. Add a contact");
	            System.out.println("2. Delete a contact");
	            System.out.println("3. Modify a contact");
	            System.out.println("4. Search for a contact");
	            System.out.println("5. Display all contacts");
	            System.out.println("6. Count the number of contacts");
	            System.out.println("7. Quit");
	            
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline character
	            
	            switch (choice) {
	                case 1:
	                    addContact(scanner);
	                    break;
	                case 2:
	                    deleteContact(scanner);
	                    break;
	                case 3:
	                    modifyContact(scanner);
	                    break;
	                case 4:
	                    searchContacts(scanner);
	                    break;
	                case 5:
	                    displayContacts();
	                    break;
	                case 6:
	                    countContacts();
	                    break;
	                case 7:
	                    quit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	        
	        saveContacts(); // save contacts to file
	        scanner.close(); // close scanner
	    }
	    
	    /**
	     * Loads the contact information from the file and populates the contacts list.
	     * @param <contacts>
	     */
	    private static <contacts> void loadContacts() {
	        contacts = new ArrayList<>(); // create empty list of contacts
	        
	        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
	            String line;
	            while ((line = reader.readLine()) != null) { // read each line of file
	                String[] fields = line.split(","); // split line into fields
	                if (fields.length == 5) { // check that there are 5 fields
	                    String firstName = fields[0];
	                    String lastName = fields[1];
	                    String address = fields[2];
	                    String city = fields[3];
	                    String phoneNumber = fields[4];
	                    contacts.add(new Contact(firstName, lastName, address, city, phoneNumber)); // create contact and add to list
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error loading contacts: " + e.getMessage());
	        }
	    }
	    
	    /**
	     * Saves the contact information***/
}

	public static void addContact(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	public static void saveContacts() {
		// TODO Auto-generated method stub
		
	}

	public static void countContacts() {
		// TODO Auto-generated method stub
		
	}

	public static void displayContacts() {
		// TODO Auto-generated method stub
		
	}

	public static void searchContacts(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	public static void modifyContact(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}

	public static void deleteContact(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}