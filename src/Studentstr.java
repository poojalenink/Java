import java.util.Scanner;
class Student{
    int roll;
    String name;
    int m1,m2,m3;

    Student(int roll, String name,int m1,int m2,int m3){
        this.roll=roll;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;

    }

    void DisplayResult(){
        int total=m1+m2+m3;
    double avg=total/3.0;
    System.out.println("Name"+name);
    System.out.println("Roll no "+roll);
    System.out.println("Total "+total);
    System.out.println("Average "+avg);

    if(avg>=90){
        System.out.println("A grade");
    }
    else if (avg>=75) {
        System.out.println("B");
    }
    else{
        System.out.println("fail");
    }
    }
}
public class Studentstr{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Roll");
    int rollNo=sc.nextInt();

    System.out.println("Enter the name ");
    String name=sc.next();

    
        System.out.print("Enter 3 marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

Student s=new Student(rollNo,name,m1,m2,m3);
s.DisplayResult();
}}