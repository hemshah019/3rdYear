package lab6;

public class Driver {
	public static void main(String[] args) {
        // Testing the NameManager class
        NameManager manager = new NameManager();
        
        manager.addName("M.Mickleson");
        manager.addName("Johnua Taylor Biggs");
        manager.addName("P.Smith");
        manager.addName("Peter Jonathan Smythton");
        manager.addName("P.Thompson");

        System.out.println("Original names:");
        manager.printNames();

        manager.removeLongNames();

        System.out.println("Names after removing long names:");
        manager.printNames();
    }

}
