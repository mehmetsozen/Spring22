package home;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int arr[]={3,5,6,1,9,45,25,4,9,0};
      tersYazdir(arr);

    }

    public static void tersYazdir(int [] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int tersArr[]=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            tersArr[i]=arr[arr.length-(i+1)];


        }System.out.println(Arrays.toString(tersArr));
    }

}
