package home;

public class DoubleDeneme {
    public static void main(String[] args) {
        // Tekrar eden harfleri bulan program
        String str = "aksesuarlar";
        String d = "";
        for (int i = 0; i < str.length(); i++) {
           String c = str.substring(i,i+1);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                if (!d.contains(c)) {
                    d = d + c;
                }
            }
        }
        System.out.println(d);

    }

}//c=a
//d=a