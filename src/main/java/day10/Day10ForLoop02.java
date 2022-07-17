package day10;

import java.util.Scanner;

public class Day10ForLoop02 {
    public static void main(String[] args) {
        String s="Tommy";
        String reversed="";
        for(int i=s.length()-1;i>=0;i--){
            reversed=reversed+s.charAt(i);
        }
        System.out.println(reversed);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer to find tha sum of digits");
        int num=input.nextInt();
        int absNum=Math.abs(num);

int sumOfDigit=0;
for(int i=absNum;i>0;i=i/10){
    sumOfDigit=sumOfDigit+i%10;
}
        System.out.println(sumOfDigit);


    }
}
