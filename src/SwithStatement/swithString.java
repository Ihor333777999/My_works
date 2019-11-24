package SwithStatement;

public class swithString {
    public static void main(String[] args) {

        String fruit = "apple";

        switch (fruit){
            case "oranges":
                System.out.println("orange are sweet");
                break;
            case "bannana":
            case "apple":
                System.out.println("my favorite");
                break;
            default:
                System.out.println("not a fruit");
        }
    }
}
