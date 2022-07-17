package day23;

public class Pilot extends Honda {
    @Override
    public void engine() {
        System.out.println("Pilot uses 3.0 Double Turbo Engine...");
    }

    @Override
    public void musicSystem() {
        System.out.println( "Pilot uses perfect music system");
    }
}
