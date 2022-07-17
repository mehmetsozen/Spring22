package home;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Comparator;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        String[] str = {"Michael", "Ali", "Maria", "Veli" };
        //String[] newStr = new String[3];
     //   newStr=str;
        System.out.println(Arrays.toString(str));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        Arrays.sort(str, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(str));
        Arrays.sort(str,Comparator.comparing(String::length).reversed());
        System.out.println(Arrays.toString(str));
        int[] num={25,20,17,3,2,80,130};
        //int num2;
        System.out.println(Arrays.toString(num));





    }
}
