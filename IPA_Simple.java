
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
