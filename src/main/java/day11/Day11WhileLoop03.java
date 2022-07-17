package day11;

public class Day11WhileLoop03 {
    public static void main(String[] args) {
        int i=237;
        int sum=0;
        int s=0;
        while (i>0){

            sum=sum+i%10;
            i=i/10;

        }
        System.out.println(sum);

        int j=3;
        int m=1;
        while (m<11){

            System.out.println(j+"X"+m+"="+j*m);
            m++;
        }

    }
}
