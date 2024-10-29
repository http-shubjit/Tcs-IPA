
// //Input: "Arijit"
// // Output: "Arij"
// // Explanation: The longest substring without repeating characters is "Arij".

// import java.util.ArrayList;

// class Main {
//     public static void main(String[] args) {
//         String input = "Arijit"; // Input string
//         String result = "";
//         ArrayList<Character> uniqueChars = new ArrayList<>(); 
        
//         for (int j = 0; j < input.length(); j++) {
//             char currentChar = input.charAt(j); 

            
//             if (!uniqueChars.contains(currentChar)) {
//                 uniqueChars.add(currentChar); 
//             } else {
//                 break; 
//             }
//         }

//         // Construct the result string from unique characters
//         for (int i = 0; i < uniqueChars.size(); i++) {
//             result += uniqueChars.get(i); // Append each character to result
//         }

//         // Print the result
//         System.out.println(result); // Output: "Arij"
//     }
// }

// Create class Medicine with below attributes: 

// MedicineName - String 
// batch - String 
// disease - String 
// price - int

// Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
// This method will take array of Medicine objects and a disease String as parameters. 
// And will return another sorted array of Integer objects where the disease String matches with the 
// original array of Medicine object's disease attribute (case insensitive search).

// Write necessary getters and setters.

// Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
// referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
// method and print the result.

// Input
// -------------

// dolo650
// FAC124W
// fever
// 100
// paracetamol
// PAC545B
// bodypain
// 150
// almox
// ALM747S
// fever
// 200
// aspirin
// ASP849Q
// flu
// 250
// fever

// Output
// ---------
// 100
// 200