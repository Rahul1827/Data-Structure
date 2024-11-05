package Assignment17October3Questions;
import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Please enter a string to reverse: ");
        String userInput = inputScanner.nextLine();
        
        revString charStack = new revString(userInput.length());
        
        for (char character : userInput.toCharArray()) {
            charStack.pushCharacter(character);
        }
        
        StringBuilder reversedString = new StringBuilder();
        
        while (!charStack.isStackEmpty()) {
            reversedString.append(charStack.popCharacter());
        }
        
        System.out.println("Reversed string is: " + reversedString.toString());
        
        inputScanner.close();
    }
}
