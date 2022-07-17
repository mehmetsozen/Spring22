package day24;

import day23.Honda;

public class Runner {
    public static void main(String[] args) {
        Civic civic=new Civic();
        System.out.println(civic.number);
        System.out.println(HondaAC.price);
        System.out.println(Engine.price);
        HondaAC.climateCool();
civic.bacterialKiller();

Pilot pilot=new Pilot();
pilot.cool();
Accord accord=new Accord();
accord.run();
civic.bacterialKiller();
    }
}
