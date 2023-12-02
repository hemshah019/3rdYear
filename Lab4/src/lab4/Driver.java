package lab4;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
        Menu menu = new Menu();
        
        try {
        	Scanner scanner = new Scanner(System.in);
        	
            // Testing valid options
        	System.out.print("Enter a valid menu option (1-3): ");
        	int validOption = scanner.nextInt();
        	menu.displayMenuOption(validOption);
        	
        	// Testing invalid options
        	System.out.print("Enter an invalid menu option: ");
            int invalidOption = scanner.nextInt();
            menu.displayMenuOption(invalidOption);
        	
        } catch (InvalidOptionException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
