package day05;

import java.util.Scanner;

public class Day06IfElseStatement01 {


    public static void main(String[] args) {

         //Ask user the enter score, if the score is less than 50 print "Fail"
        Scanner input=new Scanner((System.in));
        System.out.println("Enter the score");
        int score=input.nextInt();
        if(score<50)
    {
        System.out.println("Fail");

    }
    else
    {
        System.out.println("Pass");

    }

        System.out.println("Enter day number");
        int dayNum = input.nextInt();

        if(dayNum==1){
            System.out.println("Sunday");
        }else if(dayNum==2){
            System.out.println("Monday");
        }else if(dayNum==3){
            System.out.println("Tuesday");
        }else if(dayNum==4){
            System.out.println("Wednesday");
        }else if(dayNum==5){
            System.out.println("Thursday");
        }else if(dayNum==6){
            System.out.println("Friday");
        }else if(dayNum==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Please enter a valid day number");
        }


    }

}
