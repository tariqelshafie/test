// PartTimeEmployee.java
public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name); // Calls the Employee constructor
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Polymorphism: Overriding the abstract method differently
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Type: Part-Time | Salary: $%.2f (%d hrs @ $%.2f/hr)\n", 
                          calculateSalary(), hoursWorked, hourlyRate);
    }
}