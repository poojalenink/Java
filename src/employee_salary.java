import java.util.Scanner;
public class employee_salary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Basic Salary: ");
int s=sc.nextInt();

int DA=s*10/100;
int HRA=s*15/100;
int gross=s+DA+HRA;

System.out.println("DA: "+DA);
System.out.println("HRA: "+HRA);
System.out.println("Gross: "+gross);

}
}