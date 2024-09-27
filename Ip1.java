//**:  Problem Statement 1: The Simple One

// Write the main method in the Solution class. In the main method, write code to read a numeric digit(without any alphabets or special characters) using Scanner and print it in the reverse sequence as they appear in the input. Consider below sample input and output:
// Input:
// 12345
// Output:
// The reverse of the number is 54321.


class Ipa1 {
    public static void main(String[] args) {

        int result = reverse(12345);
        System.out.println(result);

    }
    public static int reverse(int num)
    {
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }     return reverse;
}
}

//**: Problem Statement 2: The Complex One

// Create a Class Medicine with the below attributes:
// medicine name – String
// batch no – String
// disease – String
// price – int
// Write getters, setters, and parameterized constructors as required. A public class Solution is already created with the main method. Code inside the main method should not be altered else your solution might be scored as zero. You may copy the code from the main method in Eclipse to verify your implementation.
// Implement static method – medicinePriceForGivenDisease in Solution class. This method will take a String parameter named disease along with the other parameter as an array of Medicine objects. The method will return an array of integers containing the price of the medicines in ascending order if the given input(disease) matches the disease attribute of the medicine objects in the Array.
// Note: 1) Same disease can have more than one medicine.
// 2) disease search should be case insensitive.
// This method should be called from the main method and display the prices. The main method mentioned above already has Scanner code to read values, create objects, and test the above methods. Hence do not modify it.