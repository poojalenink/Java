import java.util.Scanner;

public class student_info {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        String city;
        city = sc.nextLine();
        String college;
        college = sc.nextLine();
        final int Pass_mark= 40;
        double marks;
        marks = sc.nextDouble();
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("College: " + college);
        System.out.println("Marks: " + marks);

        if(marks>=Pass_mark){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        
        }

        String upperText=name.toUpperCase();
        System.out.println("Uppercase name: "+upperText);
        int length=name.length();
        System.out.println("Length of name: "+length);
        if (city.equals("Kottayam")){
            System.out.println("City is Kottayam");
        }
        else{
            System.out.println("City is not Kottayam");
        }
    }}