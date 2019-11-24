package methods;

public class voidMethod {
    public static void main(String[] args) {
        sayHi();//coll method
        sayBy();
        System.out.println("main");
    }

    public static void sayHi() {//noting return nothing give bac
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");

        }
    }
    public  static void sayBy(){
        System.out.println("By");
    }
}