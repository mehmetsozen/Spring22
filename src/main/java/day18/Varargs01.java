package day18;

public class Varargs01 {
    public static void main(String[] args) {
        System.out.println(add(2,3,2,5));
    }

    private static int add(int...a) {
        int sum=0;
        for (int w:a) {
            sum+=w;

        }return sum;
    }


}
