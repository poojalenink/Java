
import java.util.Scanner;

public class simple_interest{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Principal ");
Integer p=sc.nextInt();
System.out.println("Rate ");
int r=sc.nextInt();
System.out.println("Time ");
int t=sc.nextInt();
int SI=(p*r*t)/100;
System.out.println("Simple Interest "+SI);
int total=SI+p;
System.out.println("Total Amount: "+total);
}
}
