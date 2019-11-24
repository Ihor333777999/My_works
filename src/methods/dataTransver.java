package methods;

public class dataTransver {
    public static void main(String[] args) {
        printName("Igor");
        printName("Boss");
        firstChar("Petrytskyi");
    }
    public static void printName (String name){
        System.out.println(name);

    }
    public  static void firstChar (String name){
        System.out.println(name.charAt(0));
    }
}
