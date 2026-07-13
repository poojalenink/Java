import java.util.Scanner;

public class Student_details{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//inputing datas from the user
System.out.print("Name ");
String name=sc.nextLine();

System.out.print("roll_number ");
int roll=sc.nextInt();

System.out.print("course ");
String course=sc.next();


System.out.print("Percentage ");
Double percentage=sc.nextDouble();

System.out.println("________________");
System.out.println("Name  "+name);
System.out.println("Roll Number "+roll );
System.out.println("Course "+course );
System.out.println("percentage "+percentage );
}
}


