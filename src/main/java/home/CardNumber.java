package home;

public class CardNumber {
    public static void main(String[] args) {
        String cardNumber = "   8734 235324 30453    ";
        cardNumber = cardNumber.trim();
        int spaces = cardNumber.replaceAll("[0-9]", "").length();
        System.out.println(spaces);
        String lastNumbers = cardNumber.split(" ")[spaces];
        int loop = 0;
        String lastCardNumber = "";
        while(loop<spaces){
            lastCardNumber = lastCardNumber + cardNumber.split(" ")[loop] + " ";
            loop++;
        }
        lastCardNumber = lastCardNumber.replaceAll("[0-9]", "*");
        lastCardNumber = lastCardNumber + lastNumbers;
        System.out.println(lastCardNumber);
        String n="Learn java";
        System.out.println(n.replace('V','v'));
    }

}
