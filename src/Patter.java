import java.util.Scanner;
public class Patter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n=sc.nextInt();

        int Sum=0;
        int oddcount=0;
        System.out.println("Numbers are:");
        for(int i=1;i<=n;i++){
            System.out.println(i);

            if(i%2==0){
                Sum+=i;
            }
            else if(i%2!=0){
                oddcount++;
            }
        }
    }
}
