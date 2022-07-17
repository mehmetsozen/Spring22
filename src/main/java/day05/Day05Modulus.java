package day05;

import java.util.Scanner;

public class Day05Modulus {


    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Enter an Integer");
        int num=input.nextInt();
        int lastDigit=num%10;

        int absN=Math.abs(num);
        //System.out.println(Math.abs(num)%10);

        int lastTwoDigits=absN%100;
        System.out.println(lastTwoDigits);
        System.out.println("Is the number even?  "+(absN%2==0));
        System.out.println("Is the number odd?  "+(absN%2!=0));
        System.out.println(absN%10);
        int last=absN%10;
        absN=absN/10;
        int second=(absN)%10;
        absN=absN/10;
        int first=(absN/10)%10;
        System.out.println(first+second+last);
    }




}
