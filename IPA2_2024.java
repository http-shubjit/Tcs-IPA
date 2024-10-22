// Write a Laptop
// class with
// the following attributes:

// laptopId (int)
// brand (String)
// os (String)
// price (double)
// rating (int)
// The attributes should be private, and the class should provide:

// A parameterized constructor to initialize all the attributes.
// Getters and setters for each attribute.
// You also need to implement a Solution class with the following
// functionalities:

// countOfLaptopsByBrand: This static method should take two input parameters:

// An array of Laptop objects.
// A String parameter representing a brand.
// The method should return the count of laptops in the array that match the
// given brand (case-insensitive) and have a rating greater than 3. If no
// laptops meet these criteria, return 0.

// searchLaptopByOsType: This static method should take two input parameters:

// An array of Laptop objects.
// A String parameter representing the OS type.
// The method should return an array of Laptop objects sorted in descending
// order by laptopId, where the os matches the given OS type (case-insensitive).
// If no laptops match the OS, return null.

// In the main method of the Solution class:

// Read details for four laptops from user input.
// Read a brand and an OS from user input.
// Use the countOfLaptopsByBrand method to print the count of matching laptops.
// If no laptops match, print "The given brand is not available."
// Use the searchLaptopByOsType method to print the laptopId and rating of the
// matching laptops in descending order of laptopId. If no laptops match, print
// "The given OS is not available."

// Sample Input:

// 123
// HP
// Windows
// 35000
// 5
// 124
// Apple
// Mac OS
// 70000
// 5
// 125
// Dell
// Ubuntu
// 30000
// 4
// 126
// HP
// Windows
// 40000
// 4
// HP
// Windows

// Sample Output:

// 2
// 126 4
// 123 5



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Laptop {
    private int laptopId;
    private String brand;
    private String os;
    private double price;
    private int rating;

    // Parameterized constructor
    public Laptop(int laptopId, String brand, String os, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.os = os;
        this.price = price;
        this.rating = rating;
    }

    // Getters
    public int getLaptopId() {
        return laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
}

class Solution {

    // Method to count laptops by brand
    public static int countOfLaptopsByBrand(Laptop[] laptops, String brand) {
        int count = 0;

        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equalsIgnoreCase(brand) && laptop.getRating() > 3) {
                count++;
            }
        }
        return count;
    }

    // Method to search laptops by OS type
    public static List<int[]> searchLaptopByOsType(Laptop[] laptops, String os) {
        List<int[]> matchingLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            if (laptop.getOs().equalsIgnoreCase(os)) {
                int[] arr = new int[2];
                arr[0] = laptop.getLaptopId();
                arr[1] = laptop.getRating();
                matchingLaptops.add(arr);
            }
        }

        if (matchingLaptops.isEmpty()) {
            return null; // No laptops found
        } else {
            // Sort in descending order by laptopId
            matchingLaptops.sort((a, b) -> Integer.compare(b[0], a[0]));
            return matchingLaptops; // Directly return the list of int[]
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];

        // Read details for four laptops from user input
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter details for laptop " + (i + 1) + ":\n");
            System.out.print("Laptop ID: ");
            int laptopId = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Brand: ");
            String brand = scanner.nextLine();

            System.out.print("OS: ");
            String os = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Rating: ");
            int rating = scanner.nextInt();

            laptops[i] = new Laptop(laptopId, brand, os, price, rating);
        }

        // Read a brand and an OS from user input
        scanner.nextLine(); // Consume newline
        System.out.print("Enter brand to search: ");
        String searchBrand = scanner.nextLine();

        System.out.print("Enter OS to search: ");
        String searchOs = scanner.nextLine();

        // Count of matching laptops by brand
        int count = countOfLaptopsByBrand(laptops, searchBrand);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available.");
        }

        // Search for laptops by OS type
        List<int[]> foundLaptops = searchLaptopByOsType(laptops, searchOs);

        if (foundLaptops != null) {
            for (int[] laptop : foundLaptops) {
                System.out.println(laptop[0] + + laptop[1]); 
            }
        } else {
            System.out.println("The given OS is not available.");
        }

        scanner.close();
    }
}