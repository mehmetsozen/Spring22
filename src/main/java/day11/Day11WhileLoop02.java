package day11;

public class Day11WhileLoop02 {
    public static void main(String[] args) {

        String i="nalan";
        String StrI =String.valueOf(i);
String reverse="";
int idx=StrI.length()-1;
while (idx>-1) {
    reverse=reverse+StrI.charAt(idx);
    idx--;

}
if(StrI.equals(reverse)){
    System.out.println("Palindrome");
}else {
    System.out.println("NOT Palindrome");
}
    }
}
