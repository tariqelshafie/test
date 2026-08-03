// FullTimeEmployee.java
public class FullTimeEmployee extends Employee {
    private double fixedMonthlySalary;

    public FullTimeEmployee(int id, String name, double fixedMonthlySalary) {
        super(id, name); // Calls the Employee constructor
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    // Polymorphism: Overriding the abstract method
    @Override
    public double calculateSalary() {
        return fixedMonthlySalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" | Type: Full-Time | Salary: $%.2f\n", calculateSalary());
    }
}