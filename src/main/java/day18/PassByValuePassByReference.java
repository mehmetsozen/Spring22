package day18;

public class PassByValuePassByReference {
    public static void main(String[] args) {
        int num=10;
        System.out.println(add(num));
        System.out.println(num);
        //add(num);

        int price=100;
        System.out.println(doDiscount("student",price));
        System.out.println("Original Price :"+price);
        System.out.println(doDiscount("veterans",price));
        String greeting="Hello";
        System.out.println( addExclamationMark(greeting));
        System.out.println(greeting);
    }
    public static int add(int num){
        num=num+5;
        return num;
    }
    public static int doDiscount(String status,int price){
        switch (status){
            case "student":
                price=price-10;
                break;
            case    "senior":
                price=price-5;
                break;
            case "veterans":
                price=price-20;
                break;
            default:
                price=price;
              break;
        }
        return price;
    }
    public static String addExclamationMark(String greeting){
        return greeting+"!";
    }
}
