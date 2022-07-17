package home;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a palindrom");
        String palindrome=input.next();
        String revesed="";
        for(int i=palindrome.length()-1;i>=0;i--) {
            revesed = revesed + palindrome.charAt(i);
        }
                 if(palindrome.equals(revesed))
                 {
                     System.out.println("pali");
                 }else
                    {
                    System.out.println("not pali");
                    }
        }
}
