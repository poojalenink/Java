import java.util.Scanner;
public class empslr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary=sc.nextDouble();
        double da=salary*0.10;
        double hra=salary*0.15;
        double gross=salary+da+hra;
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);     
        System.out.println("Dearness Allowance: "+da);
        System.out.println("House Rent Allowance: "+hra);
        System.out.printf("Gross Salary: %.2f\n", gross);


    }
}