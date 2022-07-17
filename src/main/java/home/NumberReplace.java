package home;

import java.util.Scanner;

public class NumberReplace {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first integer");
        int a=scan.nextInt();
        System.out.println("Enter second integer");
        int b=scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("first number: "+a+" "+"second number: "+b);

    }
}
