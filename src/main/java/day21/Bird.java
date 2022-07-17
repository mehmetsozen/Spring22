package day21;

public class Bird extends Animal{ //Child Class or Subclass
    void tweet(){

        System.out.println("Birds tweets...");
    }

    @Override
    protected void weight() {
        super.weight();
    }
}
