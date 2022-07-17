package day18;

import java.util.Arrays;

/*
   Find the middle element in an integer array
  Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
  (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
*/
public class Varargs02 {
    public static void main(String[] args) {
        System.out.println(middleEiemenet(12,5,8));
        System.out.println(middleEiemenet(5,1,3,2,4));
    }

    public static int middleEiemenet(int... a) {
        Arrays.sort(a);
        int middleIdx = (a.length) / 2;
        return a[middleIdx];

    }
}
