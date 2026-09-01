import java.util.Scanner;
public class grocery {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int weight;
        double pricePerKg;
        double totalCost;
        double kg;
        System.out.println("Enter weight: ");
        weight=sc.nextInt();
        System.out.println("Enter pricePerKg: ");
        pricePerKg= sc.nextDouble();
        kg=(double) weight/1000;
        totalCost=kg*pricePerKg;
        System.out.println(" weight: "+weight);
        System.out.println(" pricePerKg: "+pricePerKg);

        if(totalCost>500) {
            System.out.println("A");
        }
        else{
                System.out.println("B");

        }
        System.out.printf("totalCost %.2f " ,totalCost);
    }

}
