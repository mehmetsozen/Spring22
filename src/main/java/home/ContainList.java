package home;

import java.util.ArrayList;
import java.util.List;

public class ContainList {
    public static void main(String[] args) {
        List<String> chars=new ArrayList<>();
        chars.add("D");
        chars.add("M");
        chars.add(1,"T");
        chars.add(0,"T");
        System.out.println(chars);

        System.out.println(chars.contains("T"));
        System.out.println(chars.contains("F"));
        List<String> charsAll=new ArrayList<>();
        charsAll.add("M");
        charsAll.add("T");
        System.out.println(chars.containsAll(charsAll));
        charsAll.add("F");
        System.out.println(chars.containsAll(charsAll));


    }
}
