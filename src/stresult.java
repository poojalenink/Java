import java.util.Scanner;

public class stresult {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the student name: ");
String name=sc.nextLine();
System.out.println("Enter the marks of subject 1: ");
int marks=sc.nextInt();
if (marks>100 || marks<0){
    System.out.println("Invalid marks");
}
String grade;
if(marks>=90 && marks<=100){
    grade="A+";
}
else if(marks>=80 && marks<=90){
    grade="A";
}
else if(marks>=70 && marks<=80){
    grade="B+";
}
else if(marks>=60 && marks<=70){
    grade="B";
}
else if(marks>=50 && marks<=60){
    grade="C+";
}
else if(marks>=40 && marks<=50){
    grade="C";
}
else{
    grade="F";
}

System.out.println("Student Name: "+name);
System.out.println("Marks: "+marks);
System.out.println("Grade: "+grade);
    
if(marks>=40){
    System.out.println("Result: Pass");
}
else{
    System.out.println("Result: Fail");
}
    }}