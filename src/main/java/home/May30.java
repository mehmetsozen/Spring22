package home;


import java.util.Scanner;

public class May30 {

    public static void main(String[] args) {
   Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String Word=scan.next();
        String UpperFirstChar=Word.substring(0,1).trim().toUpperCase();
        String LowerLastChars=Word.substring(1).toLowerCase();
        String lastword=UpperFirstChar+LowerLastChars;
        System.out.println(lastword);


        }

}
