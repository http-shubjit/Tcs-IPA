
//Input: "Arijit"
// Output: "Arij"
// Explanation: The longest substring without repeating characters is "Arij".

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        String input = "Arijit"; // Input string
        String result = "";
        ArrayList<Character> uniqueChars = new ArrayList<>(); 
        
        for (int j = 0; j < input.length(); j++) {
            char currentChar = input.charAt(j); 

            
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar); 
            } else {
                break; 
            }
        }

        // Construct the result string from unique characters
        for (int i = 0; i < uniqueChars.size(); i++) {
            result += uniqueChars.get(i); // Append each character to result
        }

        // Print the result
        System.out.println(result); // Output: "Arij"
    }
}