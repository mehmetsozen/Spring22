package home;

import java.util.Random;
import java.util.Scanner;

public class Oyun {
    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        Scanner input = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;


        while (sayi != tahmin) {
            System.out.println("Lütfen bir sayi giriniz  ");
            tahmin = input.nextInt();
            if (sayi < tahmin) {
                System.out.println("Lütfen daha küçük bir sayi giriniz  !!!");

            } else if (sayi > tahmin) {
                System.out.println("Lütfen daha büyük bir sayi giriniz  !!!");
            }
            sayac++;
        }
        System.out.println("Tutulan sayıyı "+(sayac-1)+" defada bulabildiniz... ");



    }
}
