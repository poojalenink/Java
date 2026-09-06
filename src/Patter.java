import java.util.Scanner;
public class Patter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        int age;
        age=sc.nextInt();
        double marks;
        marks=sc.nextDouble();
        sc.nextLine();
        String city;
        city=sc.nextLine();
        char grade;
        grade=sc.next().charAt(0);

        if(marks>=80){
        System.out.println("A");}
        else if(marks>=40 && marks<=79){
        System.out.println("B");}
        else{
        System.out.println("C");}

        if ( marks>=75){
        System.out.println("Eligible for schiolarship");}

        System.out.println("name"+name);
        System.out.println("Age"+age);
        System.out.println("marks"+marks);
        System.out.println("city"+city);
        System.out.println("grade"+grade);


        System.out.println("congrats" +grade);
    }
}