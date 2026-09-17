abstract class overload2 {
    protected String name;
    protected int id;

    overload2(String name, int id) {
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