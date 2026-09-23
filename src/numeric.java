import java.util.Scanner;
public class numeric{
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Radius: ");
    double radius=sc.nextDouble();
    double area=3.14*radius*radius;
    System.out.print("Area of Circle: %.2f\n  "+area);
    double cir=2*3.14*radius;
    System.out.println("Circumference of Circle: "+cir);
    double volume=4/3*3.14*radius*radius*radius;
    System.out.println("Volume of Sphere: "+volume);
}
}