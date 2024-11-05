package Assignment17October3Questions;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String inputNumber = scanner.nextLine();
        
        LinkedList linkedList = new LinkedList();
        
        for (char ch : inputNumber.toCharArray()) {
            if (Character.isDigit(ch)) {
                linkedList.addDigit(Character.getNumericValue(ch));
            }
        }
        
        System.out.print("The linked list contains: ");
        linkedList.display();
        
        scanner.close();
    }
}
