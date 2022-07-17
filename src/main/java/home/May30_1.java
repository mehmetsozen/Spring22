package home;

public class May30_1 {
    public static void main(String[] args) {

        String name1 = "Ali Can";
        String name2 = "Aliye Canan";
        String name3 = "Aliyev Can Cananov";
        int numberOfCharacters = name1.replaceAll("\\s","").length() + name2.replaceAll("\\s","").length() + name3.replaceAll("\\s","").length();
        System.out.println("Number of the string: "+numberOfCharacters);
        System.out.println("=================================================");
        String name4="    Miami 33018!!!!    ";
        int integer=name4.replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(integer);
        System.out.println("=================================================");

        String s="1a3Bcf4!...";
        Integer int1=s.replaceAll("[0-9]","").length();
        System.out.println(int1);




   }

}
