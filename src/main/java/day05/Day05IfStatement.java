package day05;

import java.util.Scanner;

public class Day05IfStatement {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n=input.nextInt();
    if(n%3==0){
        System.out.println("The number is divided by 3");
    }
    if(n%3!=0){
        System.out.println("The number is not divided by 3");
    }
if(n/100<5){

    System.out.println("Perfect number");

}
if(n/100>=5){

    System.out.println("Good number");
}
    }
}