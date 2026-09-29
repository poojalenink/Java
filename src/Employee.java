class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
        
    }
    @Override
    public String toString(){
        return "Employee anme "+name+"SAlary"+salary;
    }
}

class Manager extends Employee{
    String department;
    Manager(String name,int salary,String department){
        
        super(name,salary);
           this.department = department;

    }
    @override 
    public string toString(){
        return " Manager Name: " + name +
               ", Department: " + department +
               ", Salary: " + salary;
    }
}

