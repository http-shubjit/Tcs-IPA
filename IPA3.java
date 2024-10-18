// // Create a class called Student with the below attributes:


// // rollNo - int
// // name - String
// // branch - String
// // score - double
// // dayScholar - boolean

// // The above attributes should be private, write getters, setters and parameterized constructor as required.

// // Create class Solution with main method.
// // Implement two static methods -findCountOfDayscholarStudents  and findStudentwithSecondHighestScore in Solution 
// // class.

// // findCountOfDayscholarStudents:

// // This method will take an array of Student objects as an input parameter . This method will calculate and return 
// // the count of Students whose score is greater than 80 and who are all from dayScholar.

// // If no Student scored greater than 80 and from dayScholar are present in the array of Student objects, then the
// // method should return 0.

// // findStudentwithSecondHighestScore:

// // This method will take an array of Student objects as an input parameter. This method will return the object 
// // of the second highest score student from the array of Student objects who are not from the dayScholar.

// // If no Student is a dayScholar  in the array of Student objects, then the method should return null.

// // Note : All the searches should be case insensitive.

// // The combination of dayScholar and score for each student is always unique.

// // The above mentioned static methods should be called from the main method.

// // For findCountOfDayscholarStudents method - The main method should print the returned count as it is 
// // if the returned value is greater than 0, else it should print "There are no such dayscholar students".

// // For findStudentwithSecondHighestScore method - The main method should print the rollNo, name and score 
// // in the below format from the returned object if the retuned value is not null.

// // rollNo#name#score

// // If the returned value is null, then it should print ”There are no student from non day scholar”

// // Before calling these static methods in main, use Scanner object to read the values of four Student 
// // objects referring attributes in the above mentioned attribute sequence. 
// // Consider below sample input and output:

// // Input:

// // 1001
// // Ashwa
// // IT
// // 85
// // true
// // 1002
// // Preeti
// // IT
// // 70
// // false
// // 1003
// // Uma
// // ECE
// // 85
// // false
// // 1004
// // Akash
// // EEE
// // 90
// // true

// // Output:
// // 2
// // 1002#Preeti#70.0

// import java.util.Arrays;
// import java.util.Scanner;

// class Solution {

//     public static void main(String[] args) {

//         Student[] students = new Student[3];
//         Scanner sc=new Scanner(System.in);
//         for (int i = 0; i < students.length; i++) {
//             int rollNo = sc.nextInt();
//             String name = sc.next();
//             String branch = sc.next();
//             double score = sc.nextDouble();
//             boolean dayScholar = sc.nextBoolean();
//             students[i] = new Student(rollNo, name, branch, score, dayScholar);

//         }

//      int res= findCountOfDayscholarStudents(students);
//        Student res2= findStudentwithSecondHighestScore(students);

//     }

//     private static Student findStudentwithSecondHighestScore(Student[] students) {

//         double[] score = new double[students.length];

//         for (int i = 0; i < students.length; i++) {
//             score[i] = students[i].score;
//         }
//         Arrays.sort(score);

//       double second=score[students.length-1];
//       for (int i = students.length; i >= 0; i--) {
//           if (score[i] != second) {
//               second = score[i];
//               break;
//           }
//       }

//       for (int i = 0; i < students.length; i++) {
//           if (second == students[i].score && !students[i].dayScholar) {
//               return students[i];
//           }

//       }
//       return null; 

//     }

//     private static int findCountOfDayscholarStudents(Student[] students) {
//         int count = 0;
//         for (int i = 0; i < students.length; i++) {
//             if (students[i].score > 80 && students[i].dayScholar == true)
//                 count++;
//         }
//         return count;
//     }

// }

// class Student {

//      int rollNo;
//      String name;
//      String branch;
//      double score;
//     boolean dayScholar;

//     public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
//         this.rollNo = rollNo;
//         this.name = name;
//         this.branch = branch;
//         this.score = score;
//         this.dayScholar = dayScholar;
//     }
// }


// find Second Largest num 

// int f = Integer.MIN_VALUE;
// int s = Integer.MIN_VALUE;

// for(int i=0;i<arr.length;i++){
//     if(f<arr[i])
//     { 
//     s=f;
//     f=arr[i];

//     }
//     else if(f>arr[i] && s<arr[i]){
// s=arr[i];
//     }
// }