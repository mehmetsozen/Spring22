package day28;

public class E06 {
    public static void main(String[] args) {
Object obj="1";
convertObjectToString(obj);//ClassCastException=Runtime Exception
    }

    public static void convertObjectToString(Object obj) {
      try {
          String s=(String) obj;
          System.out.println(s);
      }catch (ClassCastException e){
          System.err.println("Object class can not be converted");
      }finally {
          System.out.println("Break connection");
      }
    }
}
