package lab4;

public class Menu {
	
	public void displayMenuOption(int opt) throws InvalidOptionException {
        if (opt >= 1 && opt <= 3) {
            System.out.println("Menu option " + opt + " selected");
        } else {
            throw new InvalidOptionException("Invalid menu option: " + opt);
        }
	}
}
