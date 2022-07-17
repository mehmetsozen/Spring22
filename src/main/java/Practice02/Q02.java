package Practice02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first word");
        String Word1=input.next();
        System.out.println("Enter second word");
        String Word2=input.next();
        if(Word1.length()%2==0){
            String str1=Word1.substring(0,Word1.length()/2);
            System.out.println("Str1: "+str1);
            String str2=Word1.substring(Word1.length()/2);
            System.out.println("Str2: "+str2);
            System.out.println(str1+Word2+str2);


        }


    }

}
