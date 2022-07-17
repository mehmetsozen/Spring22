package day24;

public class Civic implements HondaAC,Engine,Security{
    @Override
    public void cool() {
        System.out.println("Civic uses normal AC");
    }

    @Override
    public void run() {
        System.out.println("AC runs well");
    }

    @Override
    public void bacterialKiller() {

    }
}
