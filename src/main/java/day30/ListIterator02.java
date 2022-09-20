package day30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayşe");
        list.add("Fatma");
        list.add("Hayriye");

        System.out.println("list =" + list);

        ListIterator listIte1 = list.listIterator();
        while (listIte1.hasNext()){
            listIte1.next();
        }
       while (listIte1.hasPrevious()){
           System.out.print(listIte1.previous()+" ");


       }


    }
}
