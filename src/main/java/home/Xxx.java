package home;

import java.util.Scanner;

public class Xxx {
    public static void main(String[] args) {
        System.out.println("Enter column and row");
        Scanner input=new Scanner(System.in);
        int col= input.nextInt();
        int row= input.nextInt();
        for(int i=1;i<=row;i++){
            String s="";
            for (int k=1;k<=col;k++){
                s=s+"X ";
                System.out.println(s);
            }

        }
    }
}
