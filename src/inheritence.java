class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat Meows");
    }
}
public class inheritence {
    public static void main(String[] args){
        Dog d=new Dog();
        Cat c=new Cat();

        d.bark();
        c.meow();
    }
}