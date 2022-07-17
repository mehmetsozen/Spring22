package day17;

import java.time.LocalDate;

public class StaticKeyword03 {

    /*
    Create unique student ID's for every registered student.
    e.g. Tom Hanks registered to Math Course (901) ==> TH20229011001
     */

    public static int counter = 1000;

    public StaticKeyword03() {
        counter++;
    }


    public static String setStdId(String studentName, String courseName) {

        String firstInitial = studentName.split(" ")[0].substring(0, 1);
        String lastInitial = studentName.split(" ")[1].substring(0, 1);

        LocalDate date = LocalDate.now();
        int year = date.getYear();

        int courseCode = 0;
        switch (courseName.toLowerCase()) {
            case "math":
                courseCode = 901;
                break;
            case "science":
                courseCode = 902;
                break;
            case "art":
                courseCode = 903;
                break;
            case "computer":
                courseCode = 904;
                break;
            default:
                System.out.println(courseName + " does not exist");
        }
        return firstInitial + lastInitial + year + courseCode + counter;
    }
}