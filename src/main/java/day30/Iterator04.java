package day30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator04 {


        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(3);
            list.add(7);
            list.add(1);
            list.add(9);
            list.add(8);
            list.add(2);

            System.out.println("list = " + list);
            Iterator ite1=list.iterator();
            while (ite1.hasNext()) {
                ite1.next();
                ite1.remove();

            }
            System.out.println("list = " + list);
        }

}
