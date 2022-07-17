package home;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd=scan.next();
    if(pwd.length()<8)
    {
        System.out.println("Password must be 8 character at least");
    }
    else if (pwd.replaceAll("^\\s","").length()==0)
    {
        System.out.println("Uppercase don't use");

    }
    else if(pwd.replaceAll("[^a-z]","").length()==0)
    {
            System.out.println("Lowercase don't use");
    }
    else if(pwd.replaceAll("[A-Za-z0-9]","").length()==0)
    {
            System.out.println("Special character don't use");

    }else{
        System.out.println("You have accessed your account");
    }

    }
}
