// Q1(a), Q1(b), Q1(c)

// Abstract superclass
abstract class Employee {

    // Common fields for all employees
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Protected getters allow subclasses controlled access
    protected String getName() {
        return name;
    }

    protected int getId() {
        return id;
    }

    // Abstract method - every employee type calculates pay differently
    public abstract double calculatePay();
}


// Full-time employee
class FullTimeEmployee extends Employee {

    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}


// Contract employee
class ContractEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id,
                            double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}


// Intern employee
class Intern extends Employee {

    private double stipend;

    public Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    public double calculatePay() {
        return stipend;
    }
}


public class EmployeeDemo {

    // Q1(b) - Process payroll using standard for loop
    public static void processPayroll(Employee[] employees) {

        // Standard for loop
        for (int i = 0; i < employees.length; i++) {

            // Runtime polymorphism / dynamic binding
            double pay = employees[i].calculatePay();

            // Print employee summary
            System.out.println(
                    "Name: " + employees[i].getName()
                            + ", ID: " + employees[i].getId()
                            + ", Pay: " + pay
            );
        }
    }


    public static void main(String[] args) {

        // Employee array stores different subclass objects
        Employee[] employees = new Employee[3];

        employees[0] =
                new FullTimeEmployee("Arun", 101, 50000);

        employees[1] =
                new ContractEmployee("Meera", 102, 500, 80);

        employees[2] =
                new Intern("Rahul", 103, 10000);


        // Process all employees
        processPayroll(employees);
    }
}