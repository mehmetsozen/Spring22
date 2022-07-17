package day07;

import java.util.Scanner;

public class Day07Switch04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter 1st number");
        double num1=input.nextDouble();
        System.out.println("Enter 2st number");
        double num2=input.nextDouble();
        System.out.println("Enter one of the operation signs:+,-,*,/,%");
    char opr=input.next().charAt(0);
    switch (opr){

        case'+':
            System.out.println(num1+"+"+num2+"="+ (num1+num2));
            break;
        case'-':
            System.out.println(num1+"-"+num2+"="+ (num1-num2));
            break;
        case'*':
            System.out.println(num1+"*"+num2+"="+ (num1*num2));
            break;
        case'/':
            System.out.println(num1+"/"+num2+"="+ (num1/num2));
            break;
        case'%':
            System.out.println(num1+"%"+num2+"="+ (num1%num2));
            break;
    }





    }



}
