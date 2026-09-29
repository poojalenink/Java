import java.util.Scanner;
 class sum{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter two positive integers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("Sum"+sum);
        }
        catch(Exception e){
            System.out.println("Invalid input. Please enter positive integers only.");
        }

    }}