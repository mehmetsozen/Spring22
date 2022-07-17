package day16;

import java.util.ArrayList;
import java.util.List;
 /*
      1)Arrays are fixed in length which is not good but Lists have flexible length.
      2)Arrays can store just primitives and references but Lists store non-primitives.
      3)Arrays use less memory than Lists
       */
 public class ArrayList01 {
public static void main(String[] args){

        //How to create a List(ArrayList)
        //1st Way: Mostly Use
        List<Integer> al=new ArrayList<>();
        //2nd Way:
        ArrayList<Integer> bl=new ArrayList<>();

        //How to print a List on console
        System.out.println(al);//[] ==>empty list

        //How to add elements into a list
        //add() method puts the elements in insertion order.
        al.add(12);
        al.add(21);
        al.add(5);
        System.out.println(al);//[12, 21, 5]

        al.add(2,99);
        al.add(88);
        System.out.println(al);

        //How to get the number of elements in a list
        //
        int numOfElements=al.size();//5
        System.out.println("numOfElements: "+numOfElements);

        //How to get a specific element from list by using index

        int el=al.get(1);
        System.out.println(el);

//Create a list and add even integers between 13 and 51 in descending order
//Then print the 7th element on the console
List<Integer> cl=new ArrayList<>();

    for (int i = 51; i >12 ; i--) {

        if (i%2==0){
        cl.add(i);
        }
    }    System.out.println("cl :"+cl);
    System.out.println("7th Element :"+cl.get(6));
    List<String> dl=new ArrayList<>();
    dl.add("A");
    dl.add("C");
    dl.add("C");
    dl.add("C");
    dl.add("B");
    dl.add("E");
    System.out.println(dl);
    dl.remove("C");

    List<Integer> fl=new ArrayList<>();
    fl.add(12);
    fl.add(21);
    fl.add(32);
    fl.add(45);
    fl.add(21);
    System.out.println(fl);
    //1st way:
    fl.remove(fl.indexOf(21));
    System.out.println(fl);
    //2nd way
    fl.remove((Integer)21);
    System.out.println(fl);

    List<String> gl=new ArrayList<>();
    gl.add("Maria");
    gl.add("Marina");
    gl.add("Cate");
    gl.add("Mehmet");
    gl.add("Carina");
    System.out.println(gl);
    for (int i = 0; i <gl.size() ; i++) {
        if(gl.get(i).startsWith("M")&&gl.get(i).endsWith("a")){
            gl.remove(i);
            i--;
        }
    }
    System.out.println(gl);


}
}