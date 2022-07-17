package day13;

import java.util.Arrays;

public class Day13Arrays01 {

        //Type code to print the sum of the min and max value of an integer array

    public static void main(String[] args) {
    int [] arr={23,12,34,10,89,19};
    System.out.println(Arrays.toString(arr));//[23, 12, 34, 10, 89, 19]
        //Put the elements in ascending order
        //sort() method in Arrays Class puts the elenements in ascending order
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//[10, 12, 19, 23, 34, 89]
        int minValue=arr[0];
    int maxValue=arr[arr.length-1];
    int sum=minValue+maxValue;
        System.out.println("Sum :"+sum);
    }
}
