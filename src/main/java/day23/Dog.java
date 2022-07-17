package day23;

public class Dog extends Mammal{
    public Dog(){
        super("Hi doggy...");
        System.out.println("Dog constructor worked...!");

    }
    public Dog(int x){
        this();
        System.out.println("Dog constructor with int parameter");

    }
}
