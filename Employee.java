public class Employee extends Person {
    // Additional attributes for the Employee class
    private String employeeID;
    private double salary;

    // Constructor to initialize employeeID and salary along with Person attributes
    public Employee(String name, int age, String employeeID, double salary) {
        // Call the constructor of the Person class using super
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Getters for Employee class attributes
    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details including Person details
    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo(); // Call the displayPersonInfo method from Person class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: INR" + salary);
    }
}
