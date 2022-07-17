package home;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a triangle sides ");
        int side1=scan.nextInt();
        int side2=scan.nextInt();
        int side3=scan.nextInt();
        System.out.println(side1==side2&&side2==side3?"equilateral triangle":(side1==side2&&side1!=side3||side1==side3&&side2!=side3||side2==side3&&side1!=side3)?"isosceles triangle ":"Neither isosceles nor equilateral ");
    }
}
