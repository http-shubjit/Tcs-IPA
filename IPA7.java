// Create a class Sim with below attributes:



// simId - int

// customerName - String

// balance - double

// ratePerSecond - double

// circle - String



// Write getters, setters and parameterized constructor as required. 



// Public class Solution is already created with main method.


// Code inside main method should not be altered else your solution might be 


// scored as zero.You may copy the code from main method in eclipse to 

// verify your implementation. 





// Implement static method - transferCustomerCircle in Solution class.

// This method will take first parameter as array of Sim class objects, 

// second parameter as circle to be transferred (which is String parameter 

// circle1) and third parameter as new circle (which is String parameter 

// circle2).



// Method will transfer the customer to new circle (circle2), where the

//  circle attribute would match second parameter (circle1). 


// Method will return array of Sim objects for which circle is transferred.


//  Return array should be sorted in descending order of ratePerSecond

//  (assuming ratePerSecond is not same for any of the Sim objects).





// This method should be called from main method and display the simId,

// customerName,circle and ratePerSecond of returned objects 

// (as per sample output).



// Main method mentioned above already has Scanner code to read values, 

// create objects and test above methods. Hence do not modify it.






// ************************************************************************



// Consider below sample input and output:



// Input:

// 1
// raj
// 100
// 1.5
// KOL
// 2
// chetan
// 200
// 1.6
// AHD
// 3
// asha
// 150
// 1.7
// MUM
// 4
// kiran
// 50
// 2.2
// AHD
// 5
// vijay
// 130
// 1.8
// AHD
// AHD
// KOL



// Output:

// 4 kiran KOL 2.2

// 5 vijay KOL 1.8

// 2 chetan KOL 1.6

import java.util.Scanner;

 class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPA7[] sims = new IPA7[4];
        for (int i = 0; i < sims.length; i++) {
           

    System.out.print("Enter Sim ID (integer): ");
    int id = sc.nextInt();
    sc.nextLine(); // Consume the newline character

    // Prompt for customerName - String
    System.out.print("Enter Customer Name (String): ");
    String cn = sc.nextLine(); // Use nextLine() to capture full name

    // Prompt for balance - double
    System.out.print("Enter Balance (double): ");
    double b = sc.nextDouble();
    sc.nextLine(); // Consume the newline character

    // Prompt for ratePerSecond - double
    System.out.print("Enter Rate Per Second (double): ");
    double rps = sc.nextDouble();
    sc.nextLine(); // Consume the newline character

    // Prompt for circle - String
    System.out.print("Enter Circle (String): ");
    String c = sc.nextLine(); 
            sims[i] = new IPA7(id, cn, b, rps, c);
        }
        String cir1 = sc.next();
        sc.nextLine();
        String cir2 = sc.next();

        IPA7[] sim = transferCustomerCircle(sims, cir1, cir2);
for (int i = 0; i < sim.length; i++) {
    System.out.println("Sim Object " + (i + 1) + ":");
    System.out.println("ID: " + sim[i].getId());
    System.out.println("CN: " + sim[i].getCn());
    System.out.println("B: " + sim[i].getB());
    System.out.println("RPS: " + sim[i].getRps());
    System.out.println("C: " + sim[i].getC());
}

    }

    private static IPA7[] transferCustomerCircle(IPA7[] sims, String cir1, String cir2) {

        IPA7[] retarr = new IPA7[4];
        int c = 0;
        for (int i = 0; i < sims.length; i++) {
            if (sims[i].getC().equalsIgnoreCase(cir1)) {
                sims[i].setC(cir2);
                retarr[c] = sims[i];
                c++;
            }

        }

        for (int i = 0; i < retarr.length; i++) {
            for (int j = i + 1; j < retarr.length; j++) {
                if (retarr[i].getRps() < retarr[j].getRps()) {
                    IPA7 s = retarr[i];
                    retarr[i] = retarr[j];
                    retarr[j] = s;
                }

            }
        }

       return retarr;
    }
}









public class IPA7 {
    private int id;
    private String cn;
    private double b;
    private double rps;
    private String c;

    // Constructor
    public IPA7(int id, String cn, double b, double rps, String c) {
        this.id = id;
        this.cn = cn;
        this.b = b;
        this.rps = rps;
        this.c = c;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for cn
    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    // Getter and Setter for b
    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Getter and Setter for rps
    public double getRps() {
        return rps;
    }

    public void setRps(double rps) {
        this.rps = rps;
    }

    // Getter and Setter for c
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}