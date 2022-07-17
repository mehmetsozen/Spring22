package Practice02;

import java.util.Locale;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first name, middle name and last name") ;
String str =input.nextLine().toUpperCase().trim();
char initialOfMiddleName=str.charAt(str.indexOf(" ")+1);
        //System.out.print(initialOfMiddleName+" ");
        char initialOfLastName=str.charAt(str.lastIndexOf(" ")+1);
        System.out.println(""+initialOfMiddleName+initialOfLastName);

    }
}
