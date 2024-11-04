
/*
 * Write a Java program to check if a given number is an Armstrong number or
 * not.
 * 
 * Here's an example of the expected input and output:
 * 
 * Input number: 153=1^3+5^3+3^3=153
 * Input number:1634= 1^4+6^4+3^4+4^4=1+1296+81+256=1634
 * Output: "Yes, the number is an Armstrong number."
 * 
 * 
 */
import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copyofnum=num;
        int sum = 0;
        int totaldigit = Integer.toString(num).length();
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, totaldigit);
            num /= 10;
        }
        if(sum==copyofnum)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



// Create class Movie with below attributes: 

// movieName - String 
// company - String 
// genre - String 
// budget - int

// Create class Solution and implement static method "getMovieByGenre" in the Solution class. This method will 
// take array of Movie objects and a searchGenre String as parameters. And will return another array of Movie 
// objects where the searchGenre String matches with the original array of Movie object's genre attribute 
// (case insensitive search).

// Write necessary getters and setters.

// Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the 
// attributes in above sequence along with a String searchGenre. Then call the "getMovieByGenre" method and write
// logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else 
// print "Low Budget Movie".

// Input
// ---------
// aaa
// Marvel
// Action
// 250000000
// bbb
// Marvel
// Comedy
// 25000000
// ccc
// Marvel
// Comedy
// 2000000
// ddd
// Marvel
// Action
// 300000000
// Action

// Output
// -------------------
// High Budget Movie
// High Budget Movie
