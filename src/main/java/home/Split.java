package home;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a String to two part");
        String cutOfString=scan.nextLine();
        String endOfTheString=cutOfString.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(endOfTheString);
    }
}
