package home;

public class home_runner implements home_interface{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
        home_interface.super.method2();
    }




    public static void main(String[] args) {
        home_interface.method3();




    }


}

