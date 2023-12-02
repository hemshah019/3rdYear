package lab2;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Text: ");
        String text = scanner.nextLine();
        
        
        WordProcessor wordProcessor = new WordProcessor();
        wordProcessor.setText(text);
        
        
        if(userInput==null)
        {
        	int wordCount = wordProcessor.countWords(text);
            int LetterCount = wordProcessor.countLetters(text);
            int LengthCount = wordProcessor.getLength(text);
            
            System.out.println("Word Count With Null Value: " + wordCount);
            System.out.println("Letter Count Word Count With Null Value: " + LetterCount);
            System.out.println("Total Length Word Count With Null Value: " + LengthCount);
        }
        
        else
        {
        	  int wordCount = wordProcessor.countWords(userInput);
              int LetterCount = wordProcessor.countLetters(userInput);
              int LengthCount = wordProcessor.getLength(userInput);
              
              System.out.println("Word Count: " + wordCount);
              System.out.println("Letter Count: " + LetterCount);
              System.out.println("Total Length: " + LengthCount);
        }
        
        
	}

}
