package day03;

public class Day03ObjectCreation {

    public static void main(String[] args) {
        Day03ObjectCreation myObject = new Day03ObjectCreation();
        System.out.println(myObject.calculateAge(1990));
        System.out.println(myObject.printName("Mark", "Twain"));
        System.out.println(myObject.height);
        System.out.println(myObject.id);







    }


    {

    }
    public  String printName(String firstname, String lastname){
        return firstname+" "+lastname;


    }
    public  int calculateAge(int dob){
        return 2022-dob;

    }
    int height=185;
    String id="Sp2022-001";





}
