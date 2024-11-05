package Assignment21October;

import java.util.Scanner;

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch) {
        if (top < maxSize - 1) {
            stackArray[++top] = ch;
        }
    }

    public char pop() {
        if (top >= 0) {
            return stackArray[top--];
        }
        return '\0';
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

public class ReverseWordsUsingStack {

    public static String reverseWord(String word) {
        Stack stack = new Stack(word.length());
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        StringBuilder reversedWord = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedWord.append(stack.pop());
        }
        return reversedWord.toString();
    }

    public static String reverseWordsInString(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverseWord(word));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseWordsInString(input);
        System.out.println("Reversed words string: " + reversedString);

        scanner.close();
    }
}
