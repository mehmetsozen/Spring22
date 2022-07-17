package day21;

import day20.Creatures;

public class Animal extends Creatures {  //Parent or Super Class

    public void eat() {
        System.out.println("Animals eats...");
    }

    public void drink() {
        System.out.println("Animals drinks...");
    }

    public void move(){
        System.out.println("Animals moves...");
    }
}
