package day14;

import java.util.Arrays;

public class Day14MultiDimensionalArray {
    public static void main(String[] args) {
String str[][][]=new String[4][4][3];
        System.out.println(Arrays.deepToString(str));

str[0][0][0]="5";
        System.out.println(Arrays.deepToString(str));


    }
}
