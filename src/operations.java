import java.util.Scanner;

public class operations {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st num: ");
int a = sc.nextInt();


System.out.println("Enter 2nd num: "); 
int b = sc.nextInt();
int ab = a + b;
int s  = a - b;
int m  = a * b;
int d  = a / b;
int mo = a % b;

System.out.println("\n--- Results ---");
System.out.println("Addition: " + ab);
System.out.println("Subtraction: " + s);
System.out.println("Multiplication: " + m);
System.out.println("Division: " + d);
System.out.println("Modulus: " + mo);
        

}
}
