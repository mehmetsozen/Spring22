package home;

import java.util.Scanner;

public class HomeFibo {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the fibonacci seial number ");
        int s=input.nextInt();
        int fibo=0;
        System.out.print(a);
        System.out.print(" "+b);
        for(int i=2;i<s;i++){

            fibo=b+a;
            a=b;
b=fibo;
            System.out.print(" "+fibo);

        }

    }
}
