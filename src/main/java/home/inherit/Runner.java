package home.inherit;

public class Runner {
    public static void main(String[] args) {
        Catt kedi=new Catt();
        kedi.meow();
        kedi.yer();
        kedi.icer();
        kedi.agirlik();
        System.out.println("================================");
        Dogg kopek=new Dogg();
        kopek.havlar();
        kopek.yer();
        kopek.icer();
        kopek.agirlik();
        System.out.println("================================");

        birdd kus=new birdd();
        kus.oter();
        kus.yer();
        kus.icer();
        kus.agirlik();


    }
}
