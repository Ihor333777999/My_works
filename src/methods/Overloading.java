package methods;

public class Overloading {
    public static void main(String[] args) {
        jump();
        jump("nike");
        jump(5);
        String [] arr ={"d"};
        jump(arr);//do return
       // System.out.println(jump(arr));  //print out
    }
    public  static void  jump (){
        System.out.println("you dont get far");
    }
    public static void jump(String shoes){
        System.out.println("Better with shoes");
    }
    public  static  void  jump (int distance){
        System.out.println("you jumped "+ distance);
    }
    public static  String jump (String [] arr){
       return "jump by arr";

    }
}
