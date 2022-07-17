package practice05;

public class Q02 {

    //Create a method to print "Mark" on console by picking the characters from the "alphabet string".
    // String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(nameIt("M","a","r","k"));
    }

    public static String nameIt(String str1,String str2,String str3,String str4) {
        Q02 obj=new Q02();

        char ch1=str1.charAt(str1.indexOf(str1));
        char ch2=str2.toLowerCase().charAt(str2.indexOf(str2));
        char ch3=str3.toLowerCase().charAt(str3.indexOf(str3));
        char ch4=str4.toLowerCase().charAt(str4.indexOf(str4));

return ""+ch1+ch2+ch3+ch4;

    }


}
