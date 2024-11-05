
package Test;

import java.util.Scanner;

public class LongestWord {

    public String longestWord(String sen) {
        String[] words = sen.toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", "")
                .split(" ");
        
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        LongestWord lw = new LongestWord();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String result = lw.longestWord(sentence);
        System.out.println("The longest word is: " + result);
        scanner.close();
    }
}
