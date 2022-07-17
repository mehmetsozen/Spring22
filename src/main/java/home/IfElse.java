package home;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println( "Enter the score");
        int score=input.nextInt();
        if(score<50){
            System.out.println("You don't  pass. Unsuccessful result");
        }else
        {
        System.out.println("You pass. Successful result");
    }


}}
