package Faizan;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        int num = 2;
        int counter = 0;

        while(num<100){
            for (int i=2; i<=num; i++){
                if(num%i == 0){
                    counter++;
                }
            }

            if(counter==1){
                primeNumbers.add(num);
            }
            num++;
            counter = 0;
        }
        System.out.println("Prime numbers till 100 are:\n "+primeNumbers);
    }
}
