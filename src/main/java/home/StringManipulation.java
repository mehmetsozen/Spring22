package home;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String str="Mehmet Sözen";
        String Sum="";
        Sum=str.substring(0,1);
        System.out.println(Sum);
        String Sum2=str.split(" ")[1].substring(0,1);
        //Sum2=str.substring(i,i+1);
                System.out.println(Sum+Sum2);

        Scanner input=new Scanner(System.in);
        String Str=input.nextLine();
        String Str2;
        for(int i=0;i< str.length();i++){
            Str2= Str.substring(i,i+1);
        }



    }
}
