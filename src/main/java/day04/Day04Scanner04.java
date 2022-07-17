package day04;

import java.util.Scanner;

public class Day04Scanner04 {

    /*
        Get first name and last name from user then print them in upper cases on the console with a space between them
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your firstname");
        String firstName=input.next();
        System.out.println("Enter your firstname");
        String lastName=input.next();
        System.out.println(firstName.toUpperCase()+" "+lastName.toUpperCase());

    }

}
