package day23;

public class HTruck extends Truck {
    @Override
    public void engine() {
        System.out.println("HTruck using electrical engine...");
    }

    @Override
    public void fourWheels() {
        System.out.println("HTruck is super 4 wheels...");
    }
}
