// Create a class College with the below attributes.

//  id-int 

//  name -String 

//  contactNo-int

//  address-String 

//  pinCode-int



// Write the getters and setters and parametrized constructor in the above 

// mentioned sequence as required.



// Create the class Solution with the main method.

// Implement the two static methods:

//  1.findCollegeWithMaximumPincode 

//  2.searchCollegeByAddress



// findCollegeWithMaximumPincode method:

//    Create the Static method in the Solution Class.

//  This method will take array of the College objects and return the 

// College object having maximum pincode if found else return null if not 

// found.

//    for this method ,main method will print College object with maximum

// pincode if the returned value is not null.if the returned value is null ,


// then the main method will print "No college found with mentioned attribute".





// searchCollegeByAddress method:

//    Create the Static method in the Solution Class.

// This method will take array of College objects as input and address as 

// input and return College object having the mentioned address if found 

// else return null if not found.

//    for this method main method will print College object details as it is ,

//  if the returned value is not null.if the returned value is null then ,


// main method will print "No college found with mentioned attribute".


 

// ***************************************************************************

// input 1:

// 4
// 109 
// ACT
// 2500256
// mumbai
// 695001
// 107
// MCE
// 2500254
// malapuram
// 612354
// 113
// CTE
// 2500252
// chennai
// 623145
// 102
// SCT
// 2500255
// AP
// 523641
// AP



// OUTPUT1:

// id-109

// name-ACT

// contactNo-2500256

// address-mumbai

// pincode-695001

// id-102

// name-SCT

// contactNo-2500255

// address-AP

// pincode-523641







// INPUT2:

// 4
// 111
// MJT
// 2500251
// Calicut
// 401235
// 105
// MET
// 2500256
// kochi
// 668745
// 115
// IIT
// 2500262
// banglore
// 569874
// 110
// ACT
// 2500263
// delhi
// 687945
// delhi


// output2:

// id-110

// name-ACT

// contactNo-2500263

// address-delhi

// pincode-687945

// id-110

// name-ACT

// contactNo-2500263

// address-delhi

// pincode-687945

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        IPA4[] colleges = new IPA4[5];
        for (int i = 0; i < colleges.length; i++) {
             int id=sc.nextInt();
             String name = sc.next();
             int contactNo=sc.nextInt();
             String address=sc.next();
             int pinCode = sc.nextInt();
             colleges[i] = new IPA4(id, name, contactNo, address, pinCode);
        }

        // findCollegeWithMaximumPincode();

// searchCollegeByAddress()
    }
}

 class IPA4 {
    // Attributes
    private int id;
    private String name;
    private int contactNo;
    private String address;
    private int pinCode;

    // Constructor
    public IPA4(int id, String name, int contactNo, String address, int pinCode) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
        this.pinCode = pinCode;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    // toString method for easy representation
    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo=" + contactNo +
                ", address='" + address + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
