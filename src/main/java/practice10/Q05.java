package practice10;

import java.util.Scanner;

/*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
public class Q05 {

    public static void sumOfDigit(String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
           if(Character.isDigit(str.charAt(i))){
               sum+=Integer.valueOf(""+str.charAt(i));
           }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine();
        sumOfDigit(str);
    }

}
