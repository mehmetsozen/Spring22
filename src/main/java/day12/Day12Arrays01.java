package day12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Day12Arrays01 {
    public static void main(String[] args) {
        int [] ages=new int[5];
        System.out.println(Arrays.toString(ages));
        ages[0]=12;
        ages[1]=13;
        ages[2]=14;
        ages[3]=15;
        ages[4]=16;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[1]+ages[2]+ages[3]+ages[4]);
        //2nd way
        int sum=0;
        for (int i=0;i< ages.length;i++){
            sum=sum+ages[i];
        }
        System.out.println(sum);
        String[] names={"Tom","Jim","Alex","Karl"};
        System.out.println(Arrays.toString(names));
        int total=0;
        for(int i=0;i<names.length;i++){
    total=total+ names[i].length();
            System.out.println(total);
        }
    }
}
