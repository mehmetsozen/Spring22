package day07;

import java.util.Scanner;

public class Day07Switch03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
char c=scan.next().charAt(0);
switch (c){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("Vowela");
    break;
    case'b':
    case'c':
    case'd':
    case'f':
    case'g':
    case'h':
    case'j':
    case'k':
    case'l':
    case'm':
    case'n':
    case'p':
    case'r':
    case's':
    case't':
    case'v':
    case'w':
    case'x':
    case'y':
    case'z':
        System.out.println("Not vowel");
        break;
    default:
        System.out.println("Enter a letter" );
}


    }
}
