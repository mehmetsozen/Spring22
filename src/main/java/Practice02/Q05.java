package Practice02;

import java.util.Scanner;

/*Type code to do bank transactions below at an ATM:
	 Process 1: Balance inquiry
	 Process 2: Money withdrawal
	 Process 3: Deposit money
	 Process 4: End the process*/
public class Q05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of process: "+"\n"+"\n"+"Process 1: Balance inquiry"+"\n"+"Process 2: Money withdrawal\n"+"Process 3: Deposit money"+"\n"+"Process 4: End the process\n");
    int process=scan.nextInt();
    int balance=100;
    switch (process) {
        case 1:
            System.out.println("Your balance : " + balance);
            break;
        case 2:
            System.out.println("Enter the money you want to withdraw");
            int withdraw = scan.nextInt();
            if (withdraw <= balance) {
                balance -= withdraw;
                System.out.println("Your current after the withdrawal of $" + withdraw + " : $" + balance);
                break;
            }
        case 3:
            System.out.println("Enter tha amount of money you want to deposit");
            int deposit=scan.nextInt();
            if(deposit>2000){
                System.out.println("Daily limit of deposit money at the ATM: $2000");

            }else {

            }


    }


    }
}
