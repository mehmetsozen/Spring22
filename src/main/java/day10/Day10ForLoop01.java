package day10;

public class Day10ForLoop01 {
    public static void main(String[] args) {


        System.out.println("Hi!!");
        System.out.println("Hi!!");
        System.out.println("Hi!!");
        System.out.println("Hi!!");
        System.out.println("Hi!!");

        System.out.println("=========================================");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Hi!!");
        }
        System.out.println("=========================================");
        //Example 1: Type integers from 10 to 3 on the console by using for-loop
        for (int i = 10; i >= 3; i--) {
            System.out.print(i + " ");
        }
        System.out.println("=========================================");

        for (int i = 4; i < 16; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("=========================================");

        //Example 2: Type even integers from 4 to 8 on the console by using for-loop
        //1.way use
        for (int i = 4; i < 16; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("=========================================");
        //2.way
        for (int i = 4; i < 16; i = i + 2) {
            System.out.print(i + " ");
        }

        System.out.println("=========================================");
        //Example 3: Type odd integers from 4 to 15 by using for-loop
        for (int i = 4; i < 16; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("=========================================");
        //From 10 to 32 all integer write except 17

        for (int i = 10; i < 33; i++) {
            if (i != 17) {
                System.out.print(i + " ");
            }


        }
        System.out.println("=========================================");
        for (int i = 10; i < 33; i++) {
            if (i == 17) {
               continue;
            }
            System.out.print(i + " ");

        }
        System.out.println("=========================================");
        //To skip some steps in a loop we use "continue" keyword
        for (int i=10;i<33;i++){
            if(i>18&&i<21){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("=========================================");
            String str="Publix is the best";
        for (int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='x'){
                break;
            }
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println("=========================================");



    }
}
