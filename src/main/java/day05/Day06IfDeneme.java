package day05;

import java.util.Scanner;

public class Day06IfDeneme {


           public static void main(String[] args) {
            Scanner giris= new Scanner(System.in);
            String pwd = giris.next();
            //Ask user to enter the password then check if the password is valid or not according to the given rules
//1)At least 8 characters   2)Contains at least 1 uppercase     3)Contains at least 1 lowercase     4)Contains at least 1 symbol
            if (pwd.length() < 8) {
                System.out.println("Password is invalid because it does not have at least 8 characters");

            }
        }


    }


