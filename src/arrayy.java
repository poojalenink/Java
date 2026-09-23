import java.util.Arrays;
import java.util.Scanner;

public class arrayy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int [] arr=new int[n];
         System.out.println("Enter elements:");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
    
         }
         int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
         System.out.println("Sum of elements: " + sum);
double avg=(double)sum/n;

        System.out.println("Average of elements: " + avg);
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        sc.close();
    }
}
