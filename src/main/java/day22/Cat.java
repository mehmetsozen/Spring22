package day22;

public class Cat extends Mammal {
    @Override
    public void eat() {
              System.out.println("Cats eat...");
    }

    @Override
    public Mammal createAnimal() {
        return new Cat();
    }
}
