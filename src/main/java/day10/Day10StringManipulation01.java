package day10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
//Ask user to enter his full name. then create a unique id for the user.
//id should contain first 2 characters of the first name and last 2 characters of the last name.
//Use the current date time at the end of the id.
//Example: Tom Hanks ==> Toks20220528180434
public class Day10StringManipulation01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name");
        String name=input.nextLine();
        //IndexOfLastCharacter() equals to length() - 1 everytime

        String firstTwo=name.substring(0,2);
        System.out.println(firstTwo);
        String lastTwo=name.substring(name.length()-2);
        System.out.println(lastTwo);
        LocalDateTime currentDateTime=LocalDateTime.now();
        String expectCurrentDateTime=currentDateTime.toString().substring(0,19).replaceAll("[^0-9]","");
        System.out.println(firstTwo+lastTwo+expectCurrentDateTime);


    }
}
