package practice01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first integer");
        int a=input.nextInt();
        System.out.println("Enter second integer");
        int b=input.nextInt();
        System.out.println((a==b)?"Numbers equal":a>b?"a greater than b":"b greater than a");
    }





}
