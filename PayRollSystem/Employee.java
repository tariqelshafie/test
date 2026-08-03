// Employee.java
public abstract class Employee {
    // Encapsulation: Private attributes
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Encapsulation: Getter and Setter methods
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

    // Abstraction: Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    // Display basic information
    public void displayInfo() {
        System.out.printf("ID: %-5d | Name: %-15s", id, name);
    }
}