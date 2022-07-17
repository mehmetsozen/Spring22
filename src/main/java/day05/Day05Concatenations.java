package day05;

public class Day05Concatenations {






    public static void main(String[] args) {
        String t="Tom";
        String h="Hanks";
        int i=12;
        int k=5;
        char c='A';
        System.out.println(t+" "+h);
        System.out.println(t.concat(" "+h));
        System.out.println(t+i+k);
        System.out.println(t+(i+k));
        System.out.println(i+k+t);
        System.out.println(i+t+k);
        System.out.println(t+i*k);
        System.out.println(i+c+t);
        System.out.println(c+t+k);

    }




}
