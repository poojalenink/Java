import java.util.Scanner;
public class largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=25;
        int b=40;
        int c=10;
        int largest;
        if (a>=b && a>=c){
            largest=a;
        }
else if(b>=a && b>=c){
            largest=b;
        }
else {
            largest = c;

        }
        System.out.println("Enter N: " + largest);
    }
}