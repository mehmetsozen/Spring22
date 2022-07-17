package home;

public interface home_interface {

    void method1();
    static void method3(){
        System.out.println("interface static methodu");
    }
    default void method2(){
        System.out.println("interface default methodu");
    }
}
