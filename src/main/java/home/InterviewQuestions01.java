package home;

import java.util.Scanner;

public class InterviewQuestions01 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter first number---:");
        double a=Input.nextDouble();

        System.out.println("Enter second number---:");
        double b=Input.nextDouble();
        double temp=0;
        System.out.println(a+"--"+b);
        temp=b;
        b=a;
        a=temp;
        System.out.println(a+"--"+b);

        a=a+b;
        b=a-b;
        a=a-b;


    }



}
