package home;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping: " + n1 + " - " + n2);
        //n1=5 n2=2
        n1 = n1 + n2;//bu durumda n1=7 olur ama n2 hala 2
        n2 = n1 - n2;// burada n2=7-2==>n2=5 olur
        n1 = n1 - n2;//burada da n1 =7-5==>n1=2 olur ve içerik yer değiştirmiş olur
        System.out.println("After swapping: " + n1 + " - " + n2);
    }
}
