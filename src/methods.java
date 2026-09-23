public class methods{
    public static void display(){
        System.out.println("Hello, World!");
    }
    public static void greet(String name){
        System.out.println("Hello, " + name + "!");
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double avg(int a,double b,double c){
        return(a+b+c)/3;
    }
    
    public static void main(String[] args){
        display();
        greet("pooja");
        int sum=add(5,30);
        System.out.println("Sum: " + sum);
        double average=avg(5,10.5,15.2);
        System.out.println("Average: " + average);
        
    }
}