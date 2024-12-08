// /* Input : Home, Sweet Home
//            Home
//  * Output : Number of that word present in the sentence : 2
//  * 
//  * Process
//  * ----------
//  * The word Home present in the sentence 2 times
//  */

// import java.util.*;

// public class Find_CountWord {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String[] arr = str.split("\\W+");
//         String s = sc.nextLine();
//      int count=0;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i].equals(s))
           //count++
//         }
//         System.out.println("Number of that word present in the Sentence : " + count);
//     }
// }
// Create a class AutonomousCar with the below attributes:

// carld – int
// brand – String 
// noOfTestsConducted – int
// noOfTestsPassed- int
// environment – String

// Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence 
// except grade.

// Create class Solution with main method. Implement two static methods – findTestPassedByEnv and updateCarGrade in 
// Solution class.

// findTestPassedByEnv method:

// This method will take two input parameters -array of AutonomousCar objects and string parameter environment. The method 
// will return the sum of the noOfTestsPassed attribute from autonomousCar objects for the environment passed as parameter. 
// If no autonomousCar with the given environment is present in the array of AutonomousCar objects, then the method should 
// return 0.

// updateCarGrade method:

// This method will take a String parameter brand, along with the array of AutonomousCar objects. The method will return 
// the autonomousCar object, if the input String parameter matches with the brand attribute of the autonomousCar object. 
// Before returning the object, the grade should be derived based on the rating calculation mentioned below. This grade 
// value should be assigned to the object. If any of the above conditions are not met, then the method should return null. 
// The grade attribute should be calculated as follows: rating .(noOfTestsPassed * 100)/noOfTestsConducted 
// If the rating > = 80 then grade should be ‘A1’, otherwise the grade should be ‘B2’.

// The above mentioned static methods should be called from the main method. For findTestPassedByEnv method – The main 
// method should print the totalTestPassed as it is, if the returned value is greater than 0, or it should print “There 
// are no tests passed in this particular environment”.

// For updateCarGrade method – The main method should print the brand and grade of the returned autonomousCar object. 
// The brand and grade should be concatinated with :: while printing. eg:- Tesla::A1, where Tesla is the brand and Al 
// is the grade.

// If the returned value is null then it should print “No Car is available with the specified brand”. Before calling these 
// static methods in main, use Scanner object to read the values of four autonomousCar objects referring attributes in the 
// above mentioned attribute sequence (except grade attribute). Next, read the value for environment and brand.

// Input
// ----------------
// 100
// Tesla
// 1000
// 500
// Hills
// 200
// Ford
// 2000
// 1500
// Desert
// 300
// Royce
// 3000
// 1700
// Hills
// 400
// Mercedez
// 1000
// 400
// Desert
// Desert
// Mercedez

// Output
// -----------
// 1900
// Mercedez::B2
import java.util.*;
class Solution {
    public static void main(String args[]) {
        AutonomousCar[] cars = new AutonomousCar[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            cars[i] = new AutonomousCar(a, b, c, d, e);
        }
        String env = sc.nextLine();
        String brand = sc.nextLine();
        int res1 = fun1(cars, env);
        AutonomousCar res2 = fun2(cars, brand);
    }

    public static int fun1(AutonomousCar[] cars, String env) {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getE().equalsIgnoreCase(env))
                count += cars[i].getD();
        }
        return count;
    }
    public static AutonomousCar fun2(AutonomousCar[] cars,String brand )
    {

    for (int i = 0; i < cars.length; i++) {
        if (cars[i].getB().equalsIgnoreCase(brand)) {
            String grade = "";
            int rating = (cars[i].getC() * 100) / cars[i].getD();
            if (rating >= 80) {
                cars[i].setGrade("A1");
            } else {

                cars[i].setGrade("B2");
            }
        }
        return cars[i];
        
    }
    return null;
}    

}


class AutonomousCar {
   
   private int a;
   private String b;
   private int c;
   private int d;
   private String e;
 private String grade;

    AutonomousCar(int a, String b, int c, int d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.grade = "";
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public String getE() {
        return e;
    }
    
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    
}