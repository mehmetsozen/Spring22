package day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Create an integer list, add 5 elements in it, remove the even elements, change the odd elements to 22
        //[12, 3, 7, 24, 11] ==> [22, 22, 22]
        List<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(3);
        al.add(7);
        al.add(24);
        al.add(11);
        System.out.println(al);//[12, 3, 7, 24, 11]
        for (int i = 0; i < al.size() ; i++) {
            if(al.get(i)%2==0){
                al.remove(i); ;
                i--;


            }else {
                al.set(i,22);
            }

        }
        //Create an integer list which has repeated elements then remove the duplicates
        //[2, 3, 2, 2, 4] ==> [2, 3, 4]
        System.out.println(al);
        List<Integer> oroginalList=new ArrayList<>();
        oroginalList.add(2);
        oroginalList.add(3);
        oroginalList.add(2);
        oroginalList.add(2);
        oroginalList.add(4);
        List<Integer> uniqeList=new ArrayList<>();
        for (int w :oroginalList) {
            if (!uniqeList.contains(w)){
                uniqeList.add(w);
            }
        }
        System.out.println(uniqeList);

    }
}
