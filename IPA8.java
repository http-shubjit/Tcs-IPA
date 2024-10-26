// Create a class called Employee with the below attributes:

// employeeld - int
// name - String
// branch - String
// rating - double
// company Transport - boolean
// The above attributes should be private. write getters, setters and parameterized constructor as required.

// Create class MyClass with main method.
// Implement two static methods findCountOfEmployeesUsingCompTransport and findEmployeeWithSecondHighestRating
// in MyClass class.

// findCountOfEmployeesUsingCompTransport method: 
// ----------------------------------------------
// This method will take an array of Employee object and a String parameter as input parameters. 
// This method will calculate and return the count of Employees who are all using company transport 
// in the given branch (String parameter passed).
// If no Employee in the given branch using company transport in the array of Employee objects, then 
// the method should return 0.

// findEmployeeWithSecondHighestRating method: 
// --------------------------------------------
// This method will take an array of Employee objects as an input parameter. This method will return 
// the object of the second highest rating employee from the array of Employee objects who are not using 
// company transport.
// If all Employees using company transport in the array of Employee objects, then the method should return null.

// Note: All the searches should be case sensitive, companyTransport and rating combination of each Employee 
// is unique.
// For findCountOfEmployeesUsingCompTransport method, The main method should print the returned count as it 
// is if the returned value is greater than 0, else it should print "No such Employees".
// Ex: 2 , where 2 is the count
// For findEmployeeWithSecondHighestRating method: The main method should print the employeeld and name from 
// the returned object if the returned value is not null. If the returned value is null, then it should 
// print "All Employees using company transport".
// Ex: 1003
//     Uma
// where 1003 is the employeeld and Uma is the name.
// Before calling these static methods in main, use Scanner object to read the values of four Employee 
// objects referring attributes in the above mentioned attributes sequence. Next, read the value of String
// parameter for capturing branch.

// Input : 

// 1001
// Ashwa
// IT
// 5
// true
// 1002
// Preeti
// IT
// 4
// true
// 1003
// Uma
// Admin
// 3
// false
// 1004
// Akash
// Hardware
// 4.5
// false
// IT



// Output : 

// 2
// 1003
// Uma


import java.util.Arrays;
import java.util.Scanner;

 class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[4];

        // Input for Employee objects
        for (int i = 0; i < emp.length; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            boolean transport = sc.nextBoolean();
            sc.nextLine(); // Consume newline

            emp[i] = new Employee(id, name, branch, rating, transport);
        }

        // Read branch for count method
        String branchInput = sc.nextLine();

        // Count employees using company transport in the given branch
        int count = findCountOfEmployeesUsingCompTransport(emp, branchInput);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("No such Employees");
        }

        // Find employee with second highest rating who is not using company transport
        Employee secondHighestEmployee = findEmployeeWithSecondHighestRating(emp);
        if (secondHighestEmployee != null) {
            System.out.println(secondHighestEmployee.getEmployeeId());
            System.out.println(secondHighestEmployee.getName());
        } else {
            System.out.println("All Employees using company transport");
        }

        sc.close();
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
        int count = 0;

        for (Employee emp : employees) {
            if (emp.getBranch().equals(branch) && emp.isCompanyTransport()) {
                count++;
            }
        }

        return count; // Return the count
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
        double[] rat = new double[0];
        for (int i = 0; i < employees.length; i++) {
            if (!employees[i].isCompanyTransport()) {
                rat = Arrays.copyOf(rat, rat.length + 1);
                rat[rat.length - 1] = employees[i].getRating();
            }
        }
        
        Arrays.sort(rat);
        double second = rat[rat.length - 1];
        for (int i = rat.length - 1; i >= 0; i--) {
            if (second != rat[i]) {
                second = rat[i];
                break;
            }

        }
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getRating()==second)
                return employees[i];
            
        }
        return null;
    }
}
class Employee {
    // Attributes
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    // Constructor
    public Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    // Getter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;
    }
}