package day28;
    //"try block" cannot be used alone, can be used with 1 or more catch blocks.
    //"try block" cannot be used alone, can be used without "catch block" with "finally block".
public class E04 {
    public static void main(String[] args) {
        convertStringToIntegerThrnDivideByGivenNum("123", 2);
        convertStringToIntegerThrnDivideByGivenNum("123p", 3);//NumberFormatException==Runtime exception
        convertStringToIntegerThrnDivideByGivenNum("123", 0);
        convertStringToIntegerThrnDivideByGivenNum("50", 5);

    }

    public static void convertStringToIntegerThrnDivideByGivenNum(String str, int num) {
        try {
            System.out.println(Integer.parseInt(str) / num);

        } catch (NumberFormatException e) {
            System.err.println("Issue occured in conversion");
        }catch (ArithmeticException e) {
            System.err.println("Issue occured in division");
    }
}}
