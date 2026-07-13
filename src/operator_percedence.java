import java.util.Scanner;
public class operator_percedence{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("a: ");
int a=sc.nextInt();
System.out.println("b: ");
int b=sc.nextInt();
System.out.println("c: ");
int c=sc.nextInt();
System.out.println("d: ");
int d=sc.nextInt();
System.out.println("e: ");
int e=sc.nextInt();
int result = a + b * c - d / e ;

System.out.println("result: "+result);


}
}