package home;

import org.w3c.dom.ls.LSOutput;

public class working_myself {

    public static void main(String[] args) {
        System.out.println(addInteger(45,55));
        System.out.println(substractInteger(45,55));
        System.out.println(multiplyInteger(45,55));
        System.out.println(divideInteger(100,55));


    }

    static public int addInteger(int a, int b){

    return a+b;

}

    static public int substractInteger(int a, int b){

        return a-b;
    }
    static public int multiplyInteger(int a, int b){

        return a*b;
    }

    static public double divideInteger(double a, int b){

        return a/b;
    }

}
