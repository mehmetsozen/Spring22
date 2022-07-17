package day07;

import java.util.Scanner;

public class Day07Switch02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter day number");
        int dayNumber=scan.nextInt();
        switch (dayNumber){
            case 1:
                System.out.println("Sunday");
            case 2:
                System.out.println("Mondayy");
            case 3:
                System.out.println("Tuesday");
            case 4:
                System.out.println("Wednesday");
            case 5:
                System.out.println("Thursday");
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Enter a valid day number");


        }


    }
}
