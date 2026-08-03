// PayrollSystem.java
import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Polymorphism: Using a list of the superclass (Employee) to hold subclasses
        ArrayList<Employee> employeeList = new ArrayList<>();
        boolean isRunning = true;

        System.out.println("=========================================");
        System.out.println("  Welcome to the Employee Payroll System ");
        System.out.println("=========================================");

        while (isRunning) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Calculate Total Payroll");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int ftId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String ftName = scanner.nextLine();
                    System.out.print("Enter Monthly Salary: $");
                    double salary = scanner.nextDouble();
                    
                    // Object Creation
                    Employee ftEmployee = new FullTimeEmployee(ftId, ftName, salary);
                    employeeList.add(ftEmployee);
                    System.out.println("Full-Time Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int ptId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String ptName = scanner.nextLine();
                    System.out.print("Enter Hours Worked: ");
                    int hours = scanner.nextInt();
                    System.out.print("Enter Hourly Rate: $");
                    double rate = scanner.nextDouble();
                    
                    // Object Creation
                    Employee ptEmployee = new PartTimeEmployee(ptId, ptName, hours, rate);
                    employeeList.add(ptEmployee);
                    System.out.println("Part-Time Employee added successfully!");
                    break;

                case 3:
                    System.out.println("\n--- Employee List ---");
                    if (employeeList.isEmpty()) {
                        System.out.println("No employees in the system.");
                    } else {
                        // Polymorphism: Java decides at runtime which displayInfo() to call
                        for (Employee emp : employeeList) {
                            emp.displayInfo();
                        }
                    }
                    break;

                case 4:
                    double totalPayroll = 0;
                    for (Employee emp : employeeList) {
                        totalPayroll += emp.calculateSalary();
                    }
                    System.out.printf("\nTotal Payroll for all employees: $%.2f\n", totalPayroll);
                    break;

                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}