//C)Write a  program to accept names from the user and sort in alphabetical order using bubble sort 
//-	Accept n name									
//-	Bubble sort Function							
//-	Display	
package Assignment21October;


import java.util.Scanner;

public class BubbleSortNames {

    public static void bubbleSort(String[] names, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void display(String[] names, int n) {
        System.out.println("Names in alphabetical order:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];

        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        bubbleSort(names, n);
        display(names, n);

        scanner.close();
    }
}
