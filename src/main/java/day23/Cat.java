package day23;

public class Cat extends Mammal{
    public Cat(){
        super(12);//'super()' must be first line in constructor body
        System.out.println("Cat constructor worked...!");

    }
    public Cat(boolean b){
        super();
        System.out.println("Cat constructor with boolean parameter worked...");

    }
}
