package Faizan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        String[] arr = {"J", "a", "v", "a", "i", "s", "d", "i", "f", "f", "i", "c", "u", "l", "t"};
        System.out.println(Arrays.toString(arr));
        String str = "";
        for (String w : arr) {
            str += w;
        }
        System.out.println(str);
        System.out.println(str.replaceAll("is"," is not "));
    }


}
