package day11;

public class Day11WhileLoop01 {
    public static void main(String[] args) {
        for (int i=13;i<212;i++){
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n========================================");
            int i=13;
            while (i<212){
                if(i%4==0&&i%6==0){
                    System.out.print(i+" ");

            }
                i++;
        }
        System.out.println("\n========================================");
int a=3;
            while (a<6){
                //if ()
                System.out.print(a+" ");
                a++;
            }

    }
}

