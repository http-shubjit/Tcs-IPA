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
// Copy code
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
