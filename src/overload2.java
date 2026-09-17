
abstract class Employee {
    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    public abstract double calculatePay();
}


class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculatePay() {
        return 50000;
    }
}


class ContractEmployee extends Employee {

    public ContractEmployee(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculatePay() {
        return 30000;
    }
}


class Intern extends Employee {

    public Intern(String name, int id) {
        super(name, id);
    }

    @Override
    public double calculatePay() {
        return 15000;
    }
}


public class overload2 {

    
    public static void processPayroll(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {

            double pay = employees[i].calculatePay();

            System.out.println(
                "Name: " + employees[i].name +
                ", ID: " + employees[i].id +
                ", Pay: " + pay
            );
        }
    }

    public static void main(String[] args) {

        
        Employee[] employees = {
            new FullTimeEmployee("Ravi", 101),
            new ContractEmployee("Anu", 102),
            new Intern("Kiran", 103)
        };

        // Call processPayroll()
        processPayroll(employees);
    }
}
