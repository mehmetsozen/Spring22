package day21;

public class Runner {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.meow();
        cat1.drink();
        cat1.eat();

        Dog dog1=new Dog();
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.move();

        Bird bird1=new Bird();
        bird1.tweet();
        bird1.drink();
        bird1.eat();
        bird1.move();
        bird1.weight();

    }
}
