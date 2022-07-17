package practice03;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Get the number of rows from user then draw a right triangle by using asterixs
        Number of rows = 4;
        *
        * *
        * * *
        * * * *
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int rows = input.nextInt();

        for (int i=0; i<rows; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted triangle:

        System.out.println("Please enter the number of rows");
        int row = input.nextInt();

        for (int j = row; j>0; j--){
            for (int k=0; k<j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}