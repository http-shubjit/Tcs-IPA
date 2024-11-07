
//1:
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
// import java.util.*;
// class Solution {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int copyofnum=num;
// int sum = 0;
// int totaldigit = Integer.toString(num).length();
// while (num > 0) {
// int rem = num % 10;
// sum += Math.pow(rem, totaldigit);
// num /= 10;
// }
// if(sum==copyofnum)
// {
// System.out.println("Yes");
// }
// else{
// System.out.println("No");
// }
// }
// }//

//2: 
//missing integers within the array
// for the input 1 2 4 8 9 11 12 14, the output should be 3 5 6 7 10 13.

// import java.util.Arrays;

// class Solution {
//     public static void main(String args[]) {
//         int[] numbersArray = { 1, 2, 4, 8, 9, 11, 12, 14 };
//         Arrays.sort(numbersArray);
//         int len = numbersArray[numbersArray.length - 1];
//         boolean isavlarr[] = new boolean[len];
//         int[] resarr = new int[0];
//         for (int i = 0; i < numbersArray.length; i++) {
//             isavlarr[numbersArray[i] - 1] = true;
//         }
//         int k = 0;
//         for (int i = 0; i < isavlarr.length; i++) {
//             if (!isavlarr[i]) {
//                 resarr = Arrays.copyOf(resarr, resarr.length + 1);
//                 resarr[k] = i + 1;
//                 k++;
//             }
//         }
//         System.out.println(Arrays.toString(resarr));
//     }
// }

//3:
/*
 * Write a Java program that takes a user input integer n and prints the
 * Fibonacci series up to n.
 * 
 * The Fibonacci series is a series of numbers in which each number is the sum
 * of the two preceding numbers.
 * The first two numbers in the series are 0 and 1. For example, the first 10
 * numbers in the Fibonacci series are:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
 * 
 * The program should use a for loop to generate the series.
 * 
 * Sample Input:
 * 20
 * 
 * Sample Output:
 * 0 1 1 2 3 5 8 13
 * 
 * Explanation:
 * The Fibonacci series up to 20 is: 0, 1, 1, 2, 3, 5, 8, 13. Therefore, the
 * output is "0 1 1 2 3 5 8 13".
 */

// import java.util.Scanner;

// class Solution {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(0);
//         System.out.println(1);
//         int count = 2;
//         int prev=0;
//         int next=1;
//         while (count <= n) {
//             int fib = prev + next;
//             prev = next;
//             next = fib;
//             System.out.println(fib);
//             count++;
//         }

//     }
// }

//or

// import java.util.Scanner;


//  class Solution {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     for (int i = 0; i < n; i++) {
//         System.out.println(fib(i));
        
//     }
// }

// private static int fib(int i) {
//    if(i==0)
//        return 0;
//        else if(i==1)
//            return 1;
//        else
//            return fib(i - 1) + fib(i-2);

// }
    
// }

//4: 
// write a Java program that compresses a given string by counting the consecutive occurrences of each character.
// Input: aabbbcc
// Output: a2b3c2
// Input: abbccc
// Output: a1b2c3

// import java.util.Scanner;

// class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String res = "";
//         for (int i = 0; i < str.length(); i++) {
//             int count = 1;
//             char ch = str.charAt(i);
            
//             while (i+1 < str.length() && ch == str.charAt(i + 1)) {
//                 count++;
//                 i++;
               
//             }
//             res += ch + count;
//         }
//        System.out.println(res); 
//     }
// }

//5: 
// Valid Palindrome
// Attempted
// Easy
// Topics
// Companies
// A phrase
// is a palindrome if,
// after converting
// all uppercase
// letters into
// lowercase letters
// and removing
// all non-alphanumeric characters, it
// reads the
// same forward
// and backward.
// Alphanumeric characters
// include letters
// and numbers.

// Given a
// string s,return true if
// it is
// a palindrome, or false otherwise.

// Example 1:

// Input:s="A man, a plan, a canal: Panama"Output:true Explanation:"amanaplanacanalpanama"
// is a palindrome.Example 2:

// Input:s="race a car"Output:false Explanation:"raceacar"
// is not
// a palindrome.Example 3:

// Input:s=" "Output:true Explanation:
// s is
// an empty string""
// after removing non-
// alphanumeric characters.
// Since an
// empty string
// reads the
// same forward
// and backward, it
// is a palindrome
// .