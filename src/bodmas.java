import java.util.Scanner;
public class bodmas{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int radius;
    radius=sc.nextInt();
    double area=Math.PI*radius*radius;
    System.out.printf("are: %.2f",area);
    double circumference=2*Math.PI*radius;
    System.out.printf("circumference: %.2f",circumference);
    double voulume=(4/3)*Math.PI*radius*radius*radius;
    System.out.printf("voulume: %.2f",voulume);

    }}