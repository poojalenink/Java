import java.util.Scanner;
public class grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m=sc.nextInt();

        if(m>=90 && m<=100){
            System.out.print("A ");
        }
        else if (m>=80 && m<=89) {
            System.out.print("B ");
        }
        else if(m>=70 && m<=79) {
            System.out.print("C ");
        }
        else{
            System.out.print("Fail ");
        }
    }
}