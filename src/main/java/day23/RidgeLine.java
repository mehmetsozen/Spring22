package day23;

public class RidgeLine extends Truck{
    @Override
    public void engine() {
        System.out.println("Ridgeline uses 5.0 multi turbo engine...");
    }

    @Override
    public void fourWheels() {
        System.out.println("Ridgeline has 4 wheels...");
    }
}
