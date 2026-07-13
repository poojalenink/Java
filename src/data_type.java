import java.util.Scanner;
public class data_type{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.println("Integer value : ");
int i= sc.nextInt();

System.out.println("long value : ");
Long l= sc.nextLong();

System.out.println("Float value : ");
Float f= sc.nextFloat();

System.out.println("Double value : ");
Double d= sc.nextDouble();

System.out.println("Character value : ");
char c= sc.next().charAt(0);

System.out.println("Boolean value : ");
Boolean b= sc.nextBoolean();

System.out.println("Integer "+i);
System.out.println("Long "+l);
System.out.println("Float: "+f);
System.out.println("Double: "+d);
System.out.println("Character: "+c);
System.out.println("Boolean: "+b);


}
}