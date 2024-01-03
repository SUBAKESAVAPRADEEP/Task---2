package Pradeep;

public class Employee extends  Person2 {


    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Call the superclass constructor to initialize the name and age attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }

}
