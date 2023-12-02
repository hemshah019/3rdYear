package lab7;

import java.util.Scanner;

public class Driver {
	 public static void main(String[] args) {
	        // Testing the EmailStore class
	        EmailStore emailStore = new EmailStore();
	        
	     // Testing the WordCounter class.
	        WordCounter wc = new WordCounter();
	        
	        Scanner scanner = new Scanner(System.in);

	        // Input a sentence
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Add the sentence to WordCounter
	        wc.addSentence(sentence);

	        // Display the results
	        System.out.println("Word occurrence count:");
	        wc.outputResults();
	        

	        System.out.println("\nEnter email addresses (type 'exit' to stop):");
	        String email;
	        while (true) {
	            System.out.print("Enter Email: ");
	            email = scanner.nextLine();

	            if ("exit".equalsIgnoreCase(email)) {
	                break;
	            }

	            boolean added = emailStore.addEmail(email);
	            if (added) {
	                System.out.println("Email added successfully");
	            } else {
	                System.out.println("Duplicate email, not added");
	            }
	        }
	        
	        // Check if an email address exists
	        System.out.println("\nChecking emails:");
	        System.out.print("Enter an email to check: ");
	        email = scanner.nextLine();
	        if (emailStore.hasEmail(email)) {
	            System.out.println("Email exists");
	        } else {
	            System.out.println("Email does not exist");
	        }
	        
	     // Display all stored email addresses
	        System.out.println("\nDisplaying all emails:");
	        emailStore.displayEmails();


	    }
}
