package day26;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
    public static void main(String[] args) {
        Deque<String> dq1=new LinkedList<>() ;
        dq1.add("xxx");
        dq1.add("yyy");
        System.out.println(dq1.pop());
        System.out.println(dq1.pop());
        dq1.push("As");
        System.out.println(dq1);


    }
}
