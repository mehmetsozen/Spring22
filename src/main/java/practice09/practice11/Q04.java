package practice09.practice11;

import java.util.HashMap;
import java.util.Map;

/*
        Print two arrays which contains firstname and lastname as the format : firstname=lastname
            input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};
            output : {John=Doe, Mark=Twain, Ali=Can};
         */
public class Q04 {
    public static void main(String[] args) {
        String[] firstname={"John", "Mark", "Ali"};
        String[] lastname={"Doe", "Twain", "Can"};

        Map<String,String> fullName=new HashMap<>();
        for (int i = 0; i < firstname.length; i++) {
            fullName.put(firstname[i],lastname[i]);
        }
        System.out.println("Full name: "+fullName);

    }
}
