 //Write a  program to accept the names of cities and store them in array. Accept the city name from user 
 //and use linear search algorithm to check whether the city is present in array or not.	
package Assignment21October;

import java.util.Scanner;

public class CitySearch {

    public static boolean linearSearch(String[] cities, String cityToFind) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equalsIgnoreCase(cityToFind)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] cities = new String[n];

        System.out.println("Enter the names of the cities:");
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.nextLine();
        }

        System.out.print("Enter the name of the city to search: ");
        String cityToFind = scanner.nextLine();

        if (linearSearch(cities, cityToFind)) {
            System.out.println(cityToFind + " is present in the list.");
        } else {
            System.out.println(cityToFind + " is not present in the list.");
        }

        scanner.close();
    }
}
