package Faizan;
/*There is a lonely monkey on island.
he needs to eat 4 bananas every day
there are only 165 bnanas on island
-
Create following variables and find how many days monkey can survive on island
Using while loop
Use increment and decrement and if statements
monkeyAlive
*/
public class Q03 {
    public static void main(String[] args) {
        int numberOfBanana=165;
        int day=0;
        int survivalDay=0;
        day=numberOfBanana/4;
        boolean monkeyAlive=true;
        while (monkeyAlive){

            if(numberOfBanana<4) {
                monkeyAlive = false;
            }
            survivalDay++;
            numberOfBanana-=4;
        }
        System.out.println(monkeyAlive);
        System.out.println("Monkey survived "+survivalDay+" day...!!!");
    }
}
