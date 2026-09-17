class Employee
{
    int id;

    Employee(int i)
    {
        id = i;
    }

    protected void finalize()
    {
        System.out.println("Employee object removed: " + id);
    }
}

class Demo
{
    public static void normal2(String args[])
    {
        Employee e1 = new Employee(201);
        Employee e2 = new Employee(202);

        e1 = null;
        e2 = null;

        System.gc();

        System.out.println("Program finished");
    }
}