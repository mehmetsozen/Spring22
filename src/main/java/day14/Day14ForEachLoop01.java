package day14;

import java.util.Arrays;

public class Day14ForEachLoop01 {
    public static void main(String[] args) {
        //Type code to check if 2 given arrays have exactly same elements
        //arr[]=[12,3,-5,14]        brr[]=[14,-5,12,3]
        //Note:Arrays Class has a method to check if 2 given arrays same(Elements and order same) or not
        //[12,4,-1]!=[12,-1,4]      [12,4,-1]==[12,4,-1]
        int arr[]={12,3,-5,14};
        int brr[]={14,-5,12,3};
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean areTheySame =Arrays.equals(arr,brr);
        System.out.println("Are they arrays same ? : " +areTheySame);

        //Type code to check if a specific element exists in an array or not
        String crr[]={"Java","Selenium","Api","Sql"};
        String expectedElement ="MySql";
        int counter = 0;//Flag is used to check if specific scenario accurred in an array or not
        for (String w:crr){
            if(w.equals(expectedElement)){
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("The array has the expected element");


        }else {
            System.out.println("The array has not the expected element");
        }
int expected=12;
int drr[]={12,2,23,-5,12,23,12};
        int flag=0;
        for(int w:drr){
            if (w==expected)
            {
                flag++;
            }
        }
        System.out.println(expected+" was used  "+flag+" times");








    }
}
