// Create a class Motel with the below attributes:

// motelId - int
// motelName - String
// dateOfBooking – String (in the format dd-mon-yyyy)
// noOfRoomsBooked – int
// cabFacility – String
// totalBill- double

// Restricted for circulation outside TCS Xplore 6
// The above attributes should be private, write getters, setters and parameterized constructor as 
// required.
// Create class Solution with main method.
// Implement one static method – totalNoOfRoomsBooked in Solution class.
// totalNoOfRoomsBooked method:
// This method will take two input parameter - array of Motel objects and a String parameter.
// The method will return the total numbers of rooms booked from array of Motel objects if the cab facility 
// attribute matches with the given String parameter(cab facility) and the number of rooms booked is 
// greater than 5.
// If no rooms are booked with the above criteria in the array of Motel objects, then the method should 
// return 0.
// Note :
// No two Motel object would have the same motelId.
// dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
// The above mentioned static method should be called from the main method.
// For totalNoOfRoomsBooked method - The main method should print the total number of booked rooms 
// as it is, if the returned value is greater than 0, else it
// should print "No such rooms booked"
// Before calling these static methods in main, use Scanner object to read the values of four Motel objects 
// referring attributes in the above mentioned attribute sequence.
// Next, read the value of one String parameter for capturing the cab facility

// Input
// ___________
// 1001
// M&M
// 01-Dec-2022
// 5
// Yes
// 30000
// 1002
// BestStay
// 10-Jan-2022
// 3
// Yes
// 27000
// 1003
// Novatel
// 11-Jun-2022
// 5
// Yes
// 25000
// 1004
// Chola
// 01-Sep-2022
// 7
// Yes
// 72000
// Yes
// ___________
// OutPut
// ___________
// 7

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        IPA5[] motels = new IPA5[5]; 
        for (int i = 0; i < motels.length; i++) {
             int motelId=sc.nextInt();
             String motelName=sc.next();
             String dateOfBooking=sc.next(); // Format: dd-mon-yyyy
             int noOfRoomsBooked=sc.nextInt();
             String cabFacility=sc.next();
             double totalBill = sc.nextDouble();
             motels[i] = new IPA5(motelId, motelName, dateOfBooking, noOfRoomsBooked, cabFacility, totalBill);
        } 

String facility=sc.next();
int res = totalNoOfRoomsBooked(motels, facility);
System.out.println(res);
       sc.close();

    }

    private static int totalNoOfRoomsBooked(IPA5[] motels, String facility) {
        int totalRooms = 0;
        for (int i = 0; i < motels.length; i++) {
            if (motels[i].getCabFacility().equalsIgnoreCase(facility) && motels[i].getNoOfRoomsBooked()>5)
                totalRooms+=motels[i].getNoOfRoomsBooked();
        }
        return totalRooms;
    }
}


public class IPA5 {
    private int motelId;
    private String motelName;
    private String dateOfBooking; // Format: dd-mon-yyyy
    private int noOfRoomsBooked;
    private String cabFacility;
    private double totalBill;

    
    public IPA5(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility,
            double totalBill) {
        this.motelId = motelId;
        this.motelName = motelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.cabFacility = cabFacility;
        this.totalBill = totalBill;
    }

    // Getters
    public int getMotelId() {
        return motelId;
    }

    public String getMotelName() {
        return motelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getCabFacility() {
        return cabFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    // Setters
    public void setMotelId(int motelId) {
        this.motelId = motelId;
    }

    public void setMotelName(String motelName) {
        this.motelName = motelName;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setCabFacility(String cabFacility) {
        this.cabFacility = cabFacility;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

}