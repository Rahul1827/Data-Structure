//D)Write a program to accept names from the user and sort in alphabetical order using bubble sort 
//-	Accept n name									
//-	Bubble sort Function							
//-	Display

package Assignment18Oct2024;

import java.util.Scanner;

public class QuesD {

	
	static void bubbleSort(String[] names) {
		int n = names.length;
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of names: ");
		int n = scanner.nextInt();

		String[] names = new String[n];

		System.out.println("Enter " + n + " names:");
		for (int i = 0; i < n; i++) {
			names[i] = scanner.nextLine();
		}

		bubbleSort(names);

		System.out.println("Sorted names in alphabetical order:");
		for (String name : names) {
			System.out.println(name);
		}

	}
}
