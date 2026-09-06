import java.util.Scanner;
public class atm{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          int balance=10000;
          int withdraw=5000;
        int deposit=2000;
        int update=balance+deposit;
        int choice;        
        choice=sc.nextInt();
       switch(choice) {
    case 1:
        System.out.println("Executing: Withdraw");
        if (balance>=withdraw){
            System.out.println("Transaction successful");
        }
        else{
            System.out.println("Transaction failed");       
        }
        break;

    case 2:
System.out.println("Executing: Deposit");
deposit=deposit+balance;
        break;

    case 3:
        System.out.println("Executing: Check Balance"+balance);
        break;
}
    
System.out.println(update); 
sc.close();   
    }}